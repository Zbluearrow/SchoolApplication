public class Teacher extends Person {

    public static final int MAX_TUTEES = 3;

    private double mySalary;  // amount the teacher earns
    private String mySubject; // e.g. "Computer Science", "Chemistry", "English", "Other"

    // Question 12: a Teacher "has" 3 Students as personal tutees (aggregation).
    // The students exist independently of the teacher, so the teacher only
    // holds references to them.
    private Student[] myTutees = new Student[MAX_TUTEES];
    private int numTutees = 0;

    // Constructor: the inherited values are initialised by the Person constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    public double getSalary() {
        return mySalary;
    }

    public String getSubject() {
        return mySubject;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    // Assigns a student as a personal tutee.
    // Returns false if the teacher already has 3 tutees.
    public boolean addTutee(Student student) {
        if (numTutees == MAX_TUTEES) {
            return false;
        }
        myTutees[numTutees] = student;
        numTutees++;
        return true;
    }

    public Student[] getTutees() {
        return myTutees;
    }

    public int getNumTutees() {
        return numTutees;
    }

    // super.toString() prints the name, age and gender already handled by Person
    @Override
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
    }
}
