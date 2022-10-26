package firstAssessment;

public class Student {
    // class variables
    public int id;
    public String firstName;
    public String lastName;
    public AssignmentMarks mathMarks;
    public AssignmentMarks englishMarks;

    public Student(int id, String firstName, String lastName, AssignmentMarks mathMarks, AssignmentMarks englishMarks) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mathMarks = mathMarks;
        this.englishMarks = englishMarks;
    }

    public String getFullName() {
        return ("The student's full name: " + this.firstName + " " + this.lastName);

    }
}
