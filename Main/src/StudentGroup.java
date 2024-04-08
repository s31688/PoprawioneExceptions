public class StudentGroup {
    public String name;
    public Student[] students;

    public StudentGroup(String name) {
        this.name = name;
        this.students = new Student[0];
    }

    public boolean isInGroup(Student student) {
        for (Student i : students) {
            if (i == student) {
                return true;
            }
        }
        return false;
    }

    public void addStudent(Student student) throws IllegalStateException{
        Student[] studentsNew;
        try {
            if(students.length >= 15 || isInGroup(student)){
                throw new IllegalStateException();
            }
            if(students.length < 15 && !isInGroup(student)) {
                studentsNew = new Student[students.length + 1];
                System.arraycopy(students, 0, studentsNew, 0, students.length);
                studentsNew[students.length] = student;
                students = studentsNew;
            }
        } catch (IllegalStateException e) {
            e.getStackTrace();
            if (students.length >= 15) {
                throw new IllegalStateException("To many students in that group. Student can't be added");
            }
            if(isInGroup(student)) {
                throw new IllegalStateException("Student already added");
            }
        }
    }
}