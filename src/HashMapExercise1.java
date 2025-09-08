// Write a method that takes a string of text and returns a HashMap showing how many times each word appears.
// Example:

// Input: "hello world hello java world"
// Output: {hello=2, world=2, java=1}

// Hint: Split the string into words, then use map.put() and map.getOrDefault()


import java.util.*;
public class HashMapExercise1 {
    public static void main(String[] args) {
        String words = "hello world hello java world";
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] splitWords = words.split(" ");
        for (String word : splitWords) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }
        System.out.println(wordCount);
    }
}

