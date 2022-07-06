package com.lambdas.example ;

/**
 * This interface is annotated as @FunctionalInterface
 * Using this annotation make it compiler error to have more than one method 
 * and so it can be used with lambda notation
 */
@FunctionalInterface
public interface Greeting {
    
    void sayHello();
}