import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(101);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Let the game begin!");

        int[] guesses = new int[100];
        int count = 0;

        while (true) {
            System.out.print("Enter your guess (a number between 0 and 100): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }

            int guess = scanner.nextInt();

            if (guess < 0 || guess > 100) {
                System.out.println("Your guess must be between 0 and 100. Please try again.");
                continue;
            }

            guesses[count++] = guess;

            if (guess < secretNumber) {
                System.out.println("Your number is too small. Please, try again.");
            }
            else if (guess > secretNumber) {
                System.out.println("Your number is too big. Please, try again.");
            }
            else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (guesses[i] < guesses[j]) {
                    int temp = guesses[i];
                    guesses[i] = guesses[j];
                    guesses[j] = temp;
                }
            }
        }

        System.out.println("Your numbers: ");

        for (int i = 0; i < count; i++) {
            System.out.print(guesses[i] + " ");
        }
    }
}

