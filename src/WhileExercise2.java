import java.util.Scanner;

public class WhileExercise2 {
    public static void main(String[] args) {
        int secret = 7;
        Scanner scanner = new Scanner(System.in);

        int guess = 1;
        while (guess != secret) {
            System.out.println("Incorrect, try again");
            guess = scanner.nextInt();
        }
        System.out.println("Correct");
    }
}