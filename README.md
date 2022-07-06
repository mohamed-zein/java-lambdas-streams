# Java: Lambdas and Streams
This is the repository for the LinkedIn Learning course [Java: Lambdas and Streams](https://www.linkedin.com/learning/java-lambdas-and-streams). 

The [GitHub repo](https://github.com/LinkedInLearning/java-lambdas-streams-2453107) provided by the instructor.

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
1. Concrete class.
2. Anonymous class.

### 2. Using Lambdas
In the previous lesson, we did implement the `@FunctionalInterface` interface using the typical approach (i.e. _Concrete Class_ and _Anonymous class_).
In this lesson we use the new _lambda_ notation.
> `([comma separated argument-list]) -> {code block} ;`

### 3. Using existing interfaces
* Actually, we didn't need to create our `@FunctionalInterface` interface.  
* Java's already got quite a few implementations of ready-made functional interfaces that we can use.  
* There's a package called `java.util.function`, which contains lots of useful functional interfaces. [This package](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html) contains a list of interfaces that covers most of use cases for writing lambdas.  
* A commonly used one is this one called [Function](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html), which represents a function that accepts one argument and produces a result. 
* In the code example, we will use the [Interface `IntBinaryOperator`](https://docs.oracle.com/javase/8/docs/api/java/util/function/IntBinaryOperator.html) instead of our custom `Calculator` interface.

### 4. Challenge: Using Lambdas
In this section we have a skeleton for using Lambdas for solving the challenge.
* `Employee` Java bean that holds some data.
* `EmployeeUtils` class that defines some methods that an `Employee` object as parameter and return result. The methods of this class should be implemented using lambda in order to pass the Unit Test.
* `EmployeeUtilsTest` is a test class for `EmployeeUtils`

To solve this challenge, we need to implement the methods of `EmployeeUtils` so all tests in `EmployeeUtilsTest` pass successfully.

### 5. Solution: Using Lambdas
The code in class `com.challenge.EmployeeUtils` contains the solution which pass the tests defined in `com.challenge.EmployeeUtilsTest`.