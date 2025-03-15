import java.util.Scanner;

interface NumberChecker {
    boolean test(int number);
}

class NumberUtils {
    public static NumberChecker isOdd() {
        return num -> num % 2 != 0;
    }

    public static NumberChecker isPrime() {
        return num -> {
            if (num <= 1) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        };
    }

    public static NumberChecker isPalindrome() {
        return num -> {
            int original = num, reversed = 0;
            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            return original == reversed;
        };
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int option = scanner.nextInt();
            int value = scanner.nextInt();

            String result = (option == 1) ? (NumberUtils.isOdd().test(value) ? "ODD" : "EVEN") :
                    (option == 2) ? (NumberUtils.isPrime().test(value) ? "PRIME" : "COMPOSITE") :
                            (NumberUtils.isPalindrome().test(value) ? "PALINDROME" : "NOT PALINDROME");

            System.out.println(result);
        }
        scanner.close();
    }
}
