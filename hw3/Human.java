import java.util.Objects;
import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq) {
        this(name, surname, year);
        this.iq = iq;
    }

    public Human(String name, String surname, int year, int iq, Family family) {
        this(name, surname, year, iq);
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }


    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("Finalize not supported.");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                year == human.year &&
                iq == human.iq &&
                Arrays.deepEquals(schedule, human.schedule);
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.deepHashCode(schedule);
        return result;
    }
}
