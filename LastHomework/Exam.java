public class Exam {
    private String id;
    private Course subject;
    private Student examinee;
    private int result;

    public Exam(String id, Course subject, Student examinee, int result) {
        this.id = id;
        this.subject = subject;
        this.examinee = examinee;
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public int getResult() {
        return result;
    }
}
