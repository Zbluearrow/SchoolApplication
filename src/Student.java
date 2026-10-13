public class Student extends Person {

    private String myIDNum; // student ID number
    private double myFee;   // amount the student pays every year
    private String myGrade; // student's grade, e.g. "A"

    // Constructor: the inherited values are initialised by the Person constructor
    public Student(String name, int age, String gender, String idNum) {
        super(name, age, gender);
        myIDNum = idNum;
        myFee = 0.0;
        myGrade = "N/A";
    }

    public String getIDNum() {
        return myIDNum;
    }

    public double getFee() {
        return myFee;
    }

    public String getGrade() {
        return myGrade;
    }

    public void setIDNum(String idNum) {
        myIDNum = idNum;
    }

    public void setFee(double fee) {
        myFee = fee;
    }

    public void setGrade(String grade) {
        myGrade = grade;
    }

    // super.toString() prints the name, age and gender already handled by Person
    @Override
    public String toString() {
        return super.toString() + ", student ID: " + myIDNum
                + ", fee: " + myFee + ", grade: " + myGrade;
    }
}
