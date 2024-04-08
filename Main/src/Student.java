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
        double sum = 0.0;
        try {
            if(grades == null || grades.length == 0 || grades.length > 20) {
                throw new IllegalArgumentException();
            }
            for (double i : grades) {
                sum += i;
            }
            sum /= grades.length;
            double agp = Math.round(sum) - Math.round(sum * 100) / 100.0;
            if (agp < 0.75 && agp >= 0.5) {
                return Math.round(sum) - 1;
            }
            return Math.round(sum);
        } catch (ModifiedIllegalArgumentException e) {
            e.getStackTrace();
            throw new ModifiedIllegalArgumentException("No marks found. Invalid student", e);
        }
    }
}