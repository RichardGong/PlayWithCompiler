cmake_minimum_required(VERSION 3.13)
project(simd C)

set(CMAKE_C_STANDARD 11)

set(CMAKE_C_FLAGS "-mavx2")

add_executable(simd1 simd1.c)
add_executable(simd2 simd2.c)
add_executable(simd3 simd3.c)
add_executable(sisd sisd.c)
