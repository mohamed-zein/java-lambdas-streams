package com.example;

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
        Greeting greeting = new HelloWorldGreeting();
        greeting.sayHello();

        Greeting greeting2 = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };

        greeting2.sayHello();
    }
}
