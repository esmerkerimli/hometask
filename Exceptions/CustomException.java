import java.util.Scanner;

//for example, the maximum number of students allowed in a seminar is 100
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void check(int number) throws InvalidInputException {
        if (number > 100) {
            throw new InvalidInputException("Numbers higher than 100 are not valid input!");
        } else {
            System.out.println("The number is valid: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            check(number);
        } catch (InvalidInputException e) {
            System.out.println("InvalidInputException caught!");
        }
    }
}