import java.util.Scanner;

public class WhileExercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num = 0;

        // TODO: while num >= 0, add to sum, keep asking user for input
        // when loop ends, print final sum

        while (num >= 0) {
            sum += num;
            num = scanner.nextInt();
        }
        System.out.println(sum);
    }
}

