//Create an array of 5 integers. Fill it with any numbers you like. Write a program that calculates and prints the sum of all the elements.
//Hint: Use a loop to go through the array.

public class ArrayExercise1 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 10, 10210};
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            // or use this loop : for (int number : numbers) {}
        counter += numbers[i];
    }
        System.out.println(counter);
}
}



