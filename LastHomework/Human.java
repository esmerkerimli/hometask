public abstract class Human {
    protected String id;
    protected String fullName;
    protected int age;
    protected String email;
    protected String contactNumber;

    public Human(String id, String fullName, int age, String email, String contactNumber) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
