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
* There are 2 ways to create [Streams](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html).
    1. The most common use of streams is to create a stream from an existing [Array](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html) or [Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html).
    2. Create Stream without Collections or Array at all by creating a Stream object and passing the elements of the stream.

* In this lesson, we used 2 Streams methods:
    1. `sorted`: This is an **intermediate** method that sort the items of the Stream.
    2. `forEach`: This is a **terminal** method. We used it to output the items of the Stream after being `sorted`.

### 3. More Streams operations
* In this lessons, we will use 2 interesting methods of the Streams APIs:
    1. `map`: This method takes a [Function](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html) as an argument. _Function_ takes one argument and returns one thing.
        * It is important to remember that the purpose of `map` that the purpose of this method is to create a new object rather than modify existing one.
        * If you have a Stream object and you are trying to change a field on an object with a `set` method, for example, you would not be able to do that. You have to create a whole new object and set the value on the new object.
    2. `filter`: This method takes [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html) as an argument. _Predicate_ is a functional interface that takes a single argument and returns a `boolean`

* Both those 2 methods are **intermediate** methods so they must be called only before a **terminal** method (i.e. `forEach`)

### 4. Advanced streams operations
In this lesson, we will have a look on how Streams works.
* Streams can only be used once.
* Streams are not designed for storing objects. Instead, they are designed for performing operations in group of objects.
* When a Stream is created from an existing Array or Collections object, operations on the stream **DOES NOT** affect/change the original Array or Collection because Stream operations are performed on the Stream not on the original List.
* In most cases, we don't need to create a variable for the Stream Object because often we don't use it anymore after performing operations on it.
* If we need to keep the results of my Stream somewhere so I can refer to them or use them later on, in this case I need to create a new Collection and save the results to that new Collection using the `collect` method.
    * `collect` is a _terminal_ operation so it must be called at the end of the chain and cannot be called after another _terminal_ operation like `forEach`.

#### Summary
Streams are for performing operations on a group of elements in functional style and not for storing things.