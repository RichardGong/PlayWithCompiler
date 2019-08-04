# CMakeLists.txt

# minimum required CMAKE version
cmake_minimum_required(VERSION 3.5)

project(play CXX)

# compiler must be 11 or 14
set (CMAKE_CXX_STANDARD 14)

find_package(LLVM REQUIRED CONFIG)

message(STATUS "Found LLVM ${LLVM_PACKAGE_VERSION}")
message(STATUS "Using LLVMConfig.cmake in: ${LLVM_DIR}")

message(STATUS "LLVM_INCLUDE_DIRS: ${LLVM_INCLUDE_DIRS}")
message(STATUS "LLVM_DEFINITIONS: ${LLVM_DEFINITIONS}")

# Set your project compile flags.
# E.g. if using the C++ header files
# you will need to enable C++11 support
# for your compiler.

include_directories(${LLVM_INCLUDE_DIRS})
add_definitions(${LLVM_DEFINITIONS})

# Find the libraries that correspond to the LLVM components
# that we wish to use

INCLUDE_DIRECTORIES(src/grammar 
                antlr4.7.2-runtime 
                antlr4.7.2-runtime/atn 
                antlr4.7.2-runtime/dfa 
                antlr4.7.2-runtime/misc 
                antlr4.7.2-runtime/support 
                antlr4.7.2-runtime/tree
                antlr4.7.2-runtime/tree/pattern
                antlr4.7.2-runtime/tree/xpath
                ${LLVM_INCLUDE_DIRS}
                )

SET(EXECUTABLE_OUTPUT_PATH ${PROJECT_BINARY_DIR}/bin)

set(SRC_LIST src/PlayScript.cpp 
            src/grammar/PlayScriptBaseListener.cpp 
            src/grammar/PlayScriptBaseVisitor.cpp 
            src/grammar/PlayScriptLexer.cpp 
            src/grammar/PlayScriptListener.cpp  
            src/grammar/PlayScriptParser.cpp 
            src/grammar/PlayScriptVisitor.cpp
            src/grammar/RefPass.cpp
        src/grammar/Scope.cpp src/grammar/Symbol.cpp src/grammar/Variable.cpp src/grammar/Variable.h src/grammar/Type.cpp src/grammar/Type.h src/grammar/Function.cpp src/grammar/Function.h src/grammar/FunctionType.cpp src/grammar/FunctionType.h src/grammar/IRGen.cpp src/grammar/IRGen.h src/grammar/ASTEvaluator.h src/grammar/ASTEvaluator.cpp src/grammar/PlayScriptJIT.cpp src/grammar/PlayScriptJIT.h)

MESSAGE(STATUS "SRC_LIST: " ${SRC_LIST})

LINK_DIRECTORIES(${PROJECT_SOURCE_DIR}/lib)

add_executable(play ${SRC_LIST})

# TARGET_LINK_LIBRARIES(play libantlr4-runtime.a)

llvm_map_components_to_libnames(llvm_libs
                                support
                                core
                                irreader
                                analysis
                                ExecutionEngine
                                InstCombine
                                Object
                                OrcJIT
                                RuntimeDyld
                                ScalarOpts
                                native)
message(STATUS "llvm_libs: " ${llvm_libs})

# Link against LLVM libraries
target_link_libraries(play libantlr4-runtime.a ${llvm_libs})


