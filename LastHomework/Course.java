public class Course implements Gradable {
    private String id;
    private String title;
    private Teacher instructor;
    private Student[] participants;
    private int[] grades;
    private int enrolledCount;

    public Course(String id, String title, Teacher instructor) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
        this.participants = new Student[10];
        this.grades = new int[10];
        this.enrolledCount = 0;
        instructor.teach(this);
    }

    public void addStudent(Student s) {
        participants[enrolledCount] = s;
        s.registerCourse(this);
        enrolledCount++;
    }

    public void grade(Student s, int mark) {
        for (int i = 0; i < enrolledCount; i++) {
            if (participants[i] == s) {
                grades[i] = mark;
                s.assignMark(id, mark);
                break;
            }
        }
    }

    public String getID() {
        return id;
    }

    public Student[] getParticipants() {
        return participants;
    }
}
