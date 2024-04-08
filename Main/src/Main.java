public class Main {
    public static void main(String[] args) throws ModifiedIllegalArgumentException, IllegalStateException {
        Student student1 = new Student("abc", "def", "s123456", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student2 = new Student("def", "ghi", "s234567", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student3 = new Student("ghi", "jkl", "s345678", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student4 = new Student("jkl", "mno", "s456789", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{});
        Student student5 = new Student("mno", "pqr", "s567890", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        StudentGroup studentGroup = new StudentGroup("group1");
        System.out.println(student1.countAGP());
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        studentGroup.addStudent(student5);
        System.out.println(studentGroup.students.length);
        for(int i = 0; i < studentGroup.students.length; i++) {
            System.out.println(studentGroup.students[i].indexNumber);
        }
        //studentGroup.addStudent(student3);
        System.out.println(student4.countAGP());
    }
}