// 👉 Write a program that allows the user to add 3 names into an ArrayList, then prints them all out.

import java.util.Scanner;
import java.util.ArrayList;

public class arrayCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 1; i < 4; i ++) {
            System.out.println("Please enter a name:");
            String name = scanner.next();
            names.add(name);
        }
        System.out.println(names);
    }
}
