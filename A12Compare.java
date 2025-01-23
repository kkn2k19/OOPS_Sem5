// Write a Java program to compare two sets and print the elements which are common on both sets.

import java.util.HashSet;
import java.util.Set;

public class A12Compare {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Set.of("Red", "White", "Black", "Green"));
        HashSet<String> set2 = new HashSet<>(Set.of("Red", "Pink", "Black", "Orange"));

        set1.retainAll(set2);
        System.out.println("Common elements: " + set1);
    }
}

// OUTPUT ---
// Common elements: [Red, Black]