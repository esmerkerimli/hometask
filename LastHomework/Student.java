public class Student extends Human {
    private Course[] registeredCourses;
    private String[] enrolledCourseIds;
    private int[] marks;
    private int totalCourses;

    public Student(String id, String fullName, int age, String email, String phone) {
        super(id, fullName, age, email, phone);
        this.registeredCourses = new Course[10];
        this.enrolledCourseIds = new String[10];
        this.marks = new int[10];
        this.totalCourses = 0;
    }

    public void registerCourse(Course course) {
        registeredCourses[totalCourses] = course;
        totalCourses++;
    }

    public void assignMark(String courseId, int mark) {
        for (int i = 0; i < totalCourses; i++) {
            if (enrolledCourseIds[i] == null) {
                enrolledCourseIds[i] = courseId;
                marks[i] = mark;
                break;
            }
        }
    }

    public Course[] getRegisteredCourses() {
        return registeredCourses;
    }

    public int getTotalCourses() {
        return totalCourses;
    }

    public int[] getMarks() {
        return marks;
    }
}
