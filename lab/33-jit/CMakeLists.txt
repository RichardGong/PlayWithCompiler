# CMakeLists.txt

# minimum required CMAKE version
cmake_minimum_required(VERSION 3.5)

project(JIT CXX)

# compiler must be 11 or 14
set (CMAKE_CXX_STANDARD 14)

#### executable 1
add_executable(jit jit.cpp)


