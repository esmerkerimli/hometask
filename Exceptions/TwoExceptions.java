import java.util.*;

public class TwoExceptions {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        System.out.print("Enter a divisor (to perform division): ");
        int divisor = scanner.nextInt();

        try {
            System.out.println("The element at the index you entered: " + numbers[index]);

            int result = numbers[index] / divisor;
            System.out.println("Division result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
        }
    }
}