package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        
        // Create a Stream without an Array or Collection
        Stream<String> lettersStream = Stream.of("a", "b", "c");

        Integer[] scores = new Integer[] {80, 66, 73, 92, 43};

        // Create a Stream from an existing Array
        Stream<Integer> scoreStream = Arrays.stream(scores);

        List<String> shoppingList = new ArrayList<String>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        // Create a Stream from a Collection
        Stream<String> shoppingListStream = shoppingList.stream();

        // Sort the items in the Stream object shoppingListStream using the built-in method sorted
        // We will use map method to make all items in Capital letters. map takes a Function as an argument so we will use lambda notation to do that
        // We will use the filter method to get only items start with P. filter method takes Predicate as an argument which takes single argument and returns boolean
        // To output results to the screen, we use the forEach method
        // The forEach method takes a Consumer as an argument. Consumer is a @FunctionalInterface so it can be used with lambda notation.
        // forEach is a terminal method so no other method can be chained after the forEach method
        shoppingListStream.sorted()
            .map(item -> item.toUpperCase())
            .filter(item -> item.startsWith("P"))
            .forEach(item -> System.out.println(item));

        // Streams Advanced operations
        // This illegal line of code. It throws exception: java.lang.IllegalStateException: stream has already been operated upon or closed
        // because shoppingListStream can be only used once (done in previous step when forEach is called)
        // shoppingListStream.forEach(item -> System.out.println(item));
        
        // The original List is not affected by the operations performed on the Stream
        System.out.println(shoppingList);

        // We didn't need to create a variable shoppingListStream because it is not actually used.
        // If we need to keep the results of my Stream so I can use them later, in this case I need to create a new collection using the collect method
        List<String> sortedShopingList = shoppingList.stream()
            .sorted()
            .map(item -> item.toUpperCase())
            .filter(item -> item.startsWith("P"))
            .collect(Collectors.toList());
        
        System.out.println(sortedShopingList);
    }
}
