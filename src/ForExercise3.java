import java.util.Scanner;

    public class ForExercise3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What number would you like to multiply?");
            int x = scanner.nextInt();
            for (int i = 1; i < 13; i++) {
                System.out.println(x * i);
            }
        }
    }