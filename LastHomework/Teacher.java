public class Teacher extends Human implements Teachable {
    private String expertise;
    private Course[] activeCourses;
    private int assignedCourseCount;

    public Teacher(String id, String fullName, int age, String email, String phone, String expertise) {
        super(id, fullName, age, email, phone);
        this.expertise = expertise;
        this.activeCourses = new Course[10];
        this.assignedCourseCount = 0;
    }

    public void teach(Course course) {
        activeCourses[assignedCourseCount] = course;
        assignedCourseCount++;
    }

    public Course[] getActiveCourses() {
        return activeCourses;
    }

    public String getExpertise() {
        return expertise;
    }
}
