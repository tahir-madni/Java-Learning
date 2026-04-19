/*
* Date: 1 April 2026
* Concepts Covered:
- Objects as methods arguments
- Returning Objects from methods
*/

package Lab.Class_05;

public class Student {
    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    void displayDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Student marks: " + marks);
    }
}

class GradeCalculator {

    String calculateGrade(Student s) {
        int marks = s.getMarks();
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "D";
        }
    }

    Student updateStudent(Student s, int newMarks) {
        s.setMarks(newMarks);
        return s;
    }
}

class Tester {

    public static void main(String[] args) {
        Student s1 = new Student("Ali", 20);
        GradeCalculator gc = new GradeCalculator();

        System.out.println("<----- Current Details ----->");
        s1.displayDetails();
        System.out.println("Student grade: " + gc.calculateGrade(s1));

        gc.updateStudent(s1, 90);

        System.out.println("\n<----- Updated Details ----->");
        s1.displayDetails();
        System.out.println("Student grade: " + gc.calculateGrade(s1));
    }

}