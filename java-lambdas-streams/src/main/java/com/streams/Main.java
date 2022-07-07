package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        
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
        // To output results to the screen, we use the forEach method
        // The forEach method takes a Consumer as an argument. Consumer is a @FunctionalInterface so it can be used with lambda notation.
        shoppingListStream.sorted().forEach(item -> System.out.println(item));

        // Create a Stream without an Array or Collection
        Stream<String> lettersStream = Stream.of("a", "b", "c");
    }
}
