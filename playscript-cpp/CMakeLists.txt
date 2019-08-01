# CMakeLists.txt

# minimum required CMAKE version
CMAKE_MINIMUM_REQUIRED(VERSION 3.5)

project(play CXX)


# compiler must be 11 or 14
SET (CMAKE_CXX_STANDARD 14)

INCLUDE_DIRECTORIES(src/grammar 
                antlr4.7.2-runtime 
                antlr4.7.2-runtime/atn 
                antlr4.7.2-runtime/dfa 
                antlr4.7.2-runtime/misc 
                antlr4.7.2-runtime/support 
                antlr4.7.2-runtime/tree
                antlr4.7.2-runtime/tree/pattern
                antlr4.7.2-runtime/tree/xpath
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
        src/grammar/Scope.cpp src/grammar/Symbol.cpp src/grammar/Variable.cpp src/grammar/Variable.h src/grammar/Type.cpp src/grammar/Type.h src/grammar/Function.cpp src/grammar/Function.h)

MESSAGE(STATUS "SRC_LIST: " ${SRC_LIST})

LINK_DIRECTORIES(${PROJECT_SOURCE_DIR}/lib)

add_executable(play ${SRC_LIST})

TARGET_LINK_LIBRARIES(play libantlr4-runtime.a)

