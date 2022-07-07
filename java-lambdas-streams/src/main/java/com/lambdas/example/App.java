package com.lambdas.example;

import java.util.Random;
import java.util.function.IntBinaryOperator;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        // Using the Concrete class
        Greeting greeting = new HelloWorldGreeting();
        greeting.sayHello();

        // Using the Anonymous class notation
        Greeting greeting2 = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };

        greeting2.sayHello();

        // Using the lambda notation with no parameters
        Greeting greeting3 = () -> System.out.println("Hello World !!");
        greeting3.sayHello();

        // Using the lambda notation with parameters
        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y + randomNumber ;
        };
        System.out.println(calculator.calculate(1, 2));


        // User the Java built-in functional interfaces
        IntBinaryOperator calculator2 = (x, y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y + randomNumber ;
        };
        System.out.println(calculator2.applyAsInt(1, 2));
    }
}
