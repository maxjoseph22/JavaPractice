// You have two arrays: student names and their corresponding grades. Create a HashMap to store this data, then write a method that takes a student name and returns their grade (or "Not Found" if they don't exist).
// Example:

// Names: ["Alice", "Bob", "Charlie"]
// Grades: [85, 92, 78]
// Lookup "Bob" → return 92
// Lookup "Dave" → return "Not Found"

import java.util.*;
import java.util.Scanner;

public class HashMapExercise3 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] grades = {85, 92, 78};
        HashMap<String, Integer> classGrades = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            classGrades.put(names[i], grades[i]);

            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            System.out.println(classGrades.get(name));

        }





    }
}
