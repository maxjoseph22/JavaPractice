
import java.util.Scanner;

public class ageChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 13) {
            System.out.println("You are a child, grow up!");
        } else if (age < 18) {
            System.out.println("You are a teenager, good luck!");
        } else if (age < 65) {
            System.out.println("You are an adult, hard luck!");
        } else if (age > 65) {
            System.out.println("You're gonna die soon");
        }

    }
}
