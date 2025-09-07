// Task: Write a method that takes two ArrayLists of strings and returns a new ArrayList containing the elements that appear in both lists.
// Example:
// Input: ["Dog", "Cat", "Fish"] and ["Cat", "Dog", "Horse"]
// Output: ["Dog", "Cat"]

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercise3 {
    public static void main(String[] args) {
        ArrayList<String> pets1 = new ArrayList<>(Arrays.asList("Dog", "Cat", "Fish"));
        ArrayList<String> pets2 = new ArrayList<>(Arrays.asList("Cat", "Dog", "Horse"));
        ArrayList<String> appearsInBoth = new ArrayList<>();
        for (String pet : pets1) {
            if (pets2.contains(pet)) {
                appearsInBoth.add(pet);
            }
        }
        System.out.println(appearsInBoth);


    }
}