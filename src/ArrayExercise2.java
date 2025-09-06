// Task:
// Create an array of integers. Write a program that finds and prints the largest element in the array.

public class ArrayExercise2 {
    public static void main(String[] args) {
        int[] numbers = {-8, 100, 10000, 2, 4};
        int largest = numbers[0];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }

        }
        System.out.println(largest);

    }

}