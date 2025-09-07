// 	Task: Write a method that takes an ArrayList of integers and returns a new ArrayList with the elements in reverse order.

import java.util.*;

public class ArrayListExercise2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> reversedNumbers = new ArrayList<>();
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedNumbers.add(numbers[i]);
        }
        System.out.println(reversedNumbers);
    }
}

