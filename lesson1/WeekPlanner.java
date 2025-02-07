import java.util.Scanner;

public class WeekPlanner {
    static String[][] schedule = new String[7][2];

    public WeekPlanner() {
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do homework";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to dentist";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "do homework";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "practice piano for 30 minutes; go for a 30 minute walk";
        schedule[5][0] = "Friday";
        schedule[5][1] = "practice cooking a new recipe";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "do laundry; clean room";
    }

    public static void main(String[] args) {
        WeekPlanner planner = new WeekPlanner();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please, input the day of the week: ");
            String day = scanner.nextLine().trim();

            if (day.toLowerCase().equals("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

           int valid = 1;

            switch (day.toLowerCase()) {
                case "sunday":
                    System.out.println("Your tasks for Sunday: " + schedule[0][1]);
                    break;
                case "monday":
                    System.out.println("Your tasks for Monday: " + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your tasks for Tuesday: " + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your tasks for Wednesday: " + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your tasks for Thursday: " + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your tasks for Friday: " + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your tasks for Saturday: " + schedule[6][1]);
                    break;
                default:
                    valid = 0;
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
            }

            if (valid == 1) {
                continue;
            }
        }
    }
}

