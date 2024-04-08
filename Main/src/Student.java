public class Student {
    public String fName;
    public String lName;
    public String indexNumber;
    public String email;
    public String address;
    public double[] grades;

    public Student(String fName, String lName, String indexNumber, String email, String address, double[] grades) {
        this.fName = fName;
        this.lName = lName;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }

    public double countAGP() throws ModifiedIllegalArgumentException {
        double agp = 0.0;
        try {
            if (grades.length == 0) {
                throw new IllegalArgumentException();
            }
            for (double i : grades) {
                agp += i;
            }
            agp /= grades.length;
            if (agp - (int) agp >= 0.75) {
                agp++;
            }
            return (int) agp;
        } catch (ModifiedIllegalArgumentException e) {
            e.getStackTrace();
            throw new ModifiedIllegalArgumentException("No marks found. Invalid student", e);
        }
    }
}