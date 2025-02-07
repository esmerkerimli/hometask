//THE SHIP IS HORIZONTAL IN THE GAME
import java.util.Random;
import java.util.Scanner;

public class ShipBattle {
    public static void printField(char[][] field) {
        System.out.print("0|1|2|3|4|5|");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < 5; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] field = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = '-';
            }
        }

        int targetRow = random.nextInt(5);
        int targetCol1 = random.nextInt(3);
        int targetCol2 = targetCol1 + 1;
        int targetCol3 = targetCol2 + 1;

        int hitTargetCount = 0;

        System.out.println("All set. Get ready to rumble!");

        while (hitTargetCount < 3) {
            int row = 0;
            int col = 0;

            System.out.println("Enter row (1-5): ");
            while(true) {
                if(scanner.hasNextInt()) {
                    row = scanner.nextInt();
                    if (row >= 1 && row <= 5) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next();
                }
            }

            System.out.println("Enter column (1-5): ");
            while(true) {
                if(scanner.hasNextInt()) {
                    col = scanner.nextInt();
                    if (col >= 1 && col <= 5) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid integer.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next();
                }
            }

            row -= 1;
            col -= 1;

            if (row == targetRow && col == targetCol1) {
                if (field[row][col] != 'x') {
                    field[row][col] = 'x';
                    hitTargetCount++;
                }
            }
            if (row == targetRow && col == targetCol2) {
                if (field[row][col] != 'x') {
                    field[row][col] = 'x';
                    hitTargetCount++;
                }
            }
            if (row == targetRow && col == targetCol3) {
                if (field[row][col] != 'x') {
                    field[row][col] = 'x';
                    hitTargetCount++;
                }
            }

            if (hitTargetCount == 3) {
                System.out.println("You have won!");
                printField(field);
                break;
            } else {
                if (field[row][col] == '-') {
                    field[row][col] = '*';
                }
            }

            printField(field);
        }
    }
}
