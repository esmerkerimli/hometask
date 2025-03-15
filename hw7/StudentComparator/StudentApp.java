import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student(142, "Esmer", "Kerimli", false, 100,2006);
        Student s2 = new Student(108, "Nezrin", "Qasimova", false, 100,2006);
        Student s3 = new Student(161, "Nezrin", "Muradli", false, 99,2005);
        Student s4 = new Student(116, "Fatime", "Eliyeva", false, 50,2006);
        Student s5 = new Student(190, "Sekine", "Agayeva", false, 75,2006);
        Student s6 = new Student(119, "Aide", "Cerkezova", false, 75,2004);

        Student[] students = {s1, s2, s3, s4, s5, s6};
        Checker checker = new Checker();

        System.out.println("\n  Based on grade descending, birthyear ascending, gender females first, surname ascending, name descending and id ascending:");
        Arrays.sort(students, checker);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\n------------------------------------------------------------------------------------------");

        Arrays.sort(students);
        System.out.println("\n  Based on ids ascending:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}