package com.example;

/**
 * This interface is annotated as @FunctionalInterface
 * Using this annotation make it compiler error to have more than one method 
 * and so it can be used with lambda notation
 * This function interface will be used with lambda notation with parameters
 */
@FunctionalInterface
public interface Calculator {
    int calculate(int x, int y);
}
