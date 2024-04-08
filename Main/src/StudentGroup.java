import java.util.ArrayList;

public class StudentGroup {
    public String name;
    public ArrayList<Student> students;

    public StudentGroup(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public boolean isInGroup(Student student) {
        for (Student i : students) {
            if (i == student) {
                return true;
            }
        }
        return false;
    }

    public void addStudent(Student student) throws IllegalStateException {
        try {
            if (students.size() >= 15 || isInGroup(student)) {
                throw new IllegalStateException();
            }
            if (students.size() < 15 && !isInGroup(student)) {
                students.add(student);
            }
        } catch (IllegalStateException e) {
            e.getStackTrace();
            if (students.size() >= 15) {
                throw new IllegalStateException("To many students in that group. Student can't be added");
            }
            if (isInGroup(student)) {
                throw new IllegalStateException("Student already added");
            }
        }
    }
}