# CMakeLists.txt

# minimum required CMAKE version
cmake_minimum_required(VERSION 3.5)

project(llvmdemo CXX)

# compiler must be 11 or 14
set (CMAKE_CXX_STANDARD 14)

find_package(LLVM REQUIRED CONFIG)

message(STATUS "Found LLVM ${LLVM_PACKAGE_VERSION}")
message(STATUS "Using LLVMConfig.cmake in: ${LLVM_DIR}")

message(STATUS "LLVM_INCLUDE_DIRS: ${LLVM_INCLUDE_DIRS}")
message(STATUS "LLVM_DEFINITIONS: ${LLVM_DEFINITIONS}")

include_directories(${LLVM_INCLUDE_DIRS})
add_definitions(${LLVM_DEFINITIONS})

SET(EXECUTABLE_OUTPUT_PATH ${PROJECT_BINARY_DIR}/bin)

set(SRC_LIST main.cpp DemoJIT.h)

MESSAGE(STATUS "SRC_LIST: " ${SRC_LIST})

# LINK_DIRECTORIES(${PROJECT_SOURCE_DIR}/lib)

add_executable(llvmdemo ${SRC_LIST})

#llvm_map_components_to_libnames(llvm_libs
#        support
#        core
#        irreader
#        analysis
#        ExecutionEngine
#        InstCombine
#        Object
#        OrcJIT
#        RuntimeDyld
#        ScalarOpts
#        native)
llvm_map_components_to_libnames(llvm_libs all)
message(STATUS "llvm_libs: " ${llvm_libs})

# Link against LLVM libraries
target_link_libraries(llvmdemo  ${llvm_libs})

