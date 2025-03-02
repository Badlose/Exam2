import java.util.Objects;

public class Student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return this.age == student.age && Objects.equals(this.name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}