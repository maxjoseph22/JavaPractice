// Write a method that takes a list of party guests and removes any duplicate names (case-insensitive). Then return the list sorted alphabetically.
// Example:

// Input: ["Alice", "bob", "Charlie", "alice", "Bob", "Diana"]
// Output: ["Alice", "Bob", "Charlie", "Diana"]

import java.util.*;

public class ArrayListExercise1 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Alice", "Bob", "Diana"};
        ArrayList<String> sortedNames = new ArrayList<>();
        for (String name : names) {
            if (!sortedNames.contains(name)) {
                sortedNames.add(name);
            }
        }
        Collections.sort(sortedNames);
        System.out.println(sortedNames);
    }
}