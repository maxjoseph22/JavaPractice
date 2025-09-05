import java.util.Scanner;

public class ForExercise2 {
    public static void main(String[] args) {
    // multiplication table, up to 12, of a number
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        System.out.println("Which number would you like to multiply?");
        x = scanner.nextInt();

        for (int i = 1; i < 13; i ++) {
            System.out.println(i * x);


        }
    }
}
