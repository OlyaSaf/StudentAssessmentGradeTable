package firstAssessment;

public class Main {
    public static void main(String[] args) {

        Student frank = new Student(1, "Frank", "West", new AssignmentMarks("Mathematics", 98, 95, 87),
                new AssignmentMarks("English", 78, 77, 88));

        Student dianne = new Student(2, "Dianne", "Greene", new AssignmentMarks("Mathematics", 78, 94, 88),
                new AssignmentMarks("English", 87, 95, 92));

        Student doug = new Student(3, "Doug", "Lei", new AssignmentMarks("Mathematics", 78, 94, 88),
                new AssignmentMarks("English", 87, 95, 92));

        Student james = new Student(4, "James", "Hewlett", new AssignmentMarks("Mathematics", 69, 92, 74),
                new AssignmentMarks("English", 77, 89, 91));

        Student aroha = new Student(5, "Aroha", "Wright", new AssignmentMarks("Mathematics", 97, 92, 87),
                new AssignmentMarks("English", 83, 82, 92));

    }

}
