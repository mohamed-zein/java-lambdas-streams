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

## Unit 3: Streams
### 1. Understanding Streams
* The [Streams API](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html) was introduced in Java 8.
* Streams used together with lambdas. Streams allows you to write concise, powerful code.
* Example:
    > You have a list of countries (ArrayList).
    > You want to:
    > * Capatalize everything.
    > * Filter out countries beginning with "C".
    > * Sort Countries in alphabetical order.
    > * Print results to the console.  
    
    To implement the above requirements without Streams, you will use `for` loop:
    ```
    //Sort Countries in alphabetical order.
    Collections.sort(countries);
    
    for (String country : countries) {
        // Capatalize everything
        country = country.toUpperCase();
        
        // Filter out countries beginning with "C".
        if(!country.startWith("C")) {
            // Print results to the console
            System.out.println(country);
        }
    }
    ```

    Now let's see what this would like with Streams.
    ```
    countries.stream()
        .map(s -> s..toUpperCase())
        .filter(s -> !.startWith("C"))
        .sorted()
        .forEach(s -> System.out.println(s));
    ```
* With Streams APIs, you can chain methods together to keep processing the list in different ways. So each line here handles each of the requirements:
    * The `map` method is used to capatalize the strings.
    * The `filter` method is used to filter out countries beginning with a "C".
    * The `sorted` method puts the results in alphabetical order.
    * And finally, the `forEach` method prints out each one to the console.
    
* **It is importtant to note that this code won't actually change the list of countries at all. This is because streams are mutable so you can't go making changes to the elemens in the middle of the stream.**

* In some of these methods, you will see that lambda notation is used. So this is an example of a function passed to a method as an argument, which is something that's quite often done in functional programming.

* It is also worth noting that the `forEach` method has to go at the end here. This is because there are two types of methods in the Streams API:
    1. Intermedia (e.g. `map`, `filter` and `sorted`). Intermedita operations all return a stream as a result, so you can keep chaining them together for as long as you like.
    2. Terminal (e.g. `forEach`). Terminal operations return something else, so either void or some other type, so they have to go at the end of the chain.
#### Summary
* Streams operations can be **intermediate** or **terminal**.
* Terminal operations have to come last.
* Streams are immutable.

### 2. Using Streams
There are 2 ways to create [Streams](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html).
1. The most common use of streams is to create a stream from an existing [Array](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html) or [Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html).
2. Create Stream without Collections or Array at all by creating a Stream object and passing the elements of the stream.