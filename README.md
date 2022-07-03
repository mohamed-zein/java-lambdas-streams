# Java: Lambdas and Streams
This is the repository for the LinkedIn Learning course [Java: Lambdas and Streams](https://www.linkedin.com/learning/java-lambdas-and-streams). 

## Introduction
Java is famous for being Object-Oriented language.

Lambdas and Streams are introduced in Java 8 to add Functional programming capabilities to Java.

## Unit 1: Functional Programming
### What is Functional Programming
In Functional Programming:
* We think functions, not objects.
* Functions give you the same output every time you give the same input.
* Functions can take function as input.
* Functions can output other functions.

Functional Programming in Java:
* Java is Object Oriented.
* But you can do functional-style programming with it.
* For example, with lambdas and streams.

## Unit 2: Lambdas
### 1. Functional Interfaces
We start with creating an interface `Greeting` that contains one function `sayHello`. Most importantly, the interface is annotated as `@FunctionalInterface`. The annotation marks make it illegal to have more than one function in the interface.
```
package com.example ;

@FunctionalInterface
public interface Greeting {
    void sayHello();
}

```
We can implement this interface in 2 ways:
1. Typical class.
2. Anonymous class.