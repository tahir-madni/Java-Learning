/*
* Date: 24 March 2026
* Concepts Covered:
- Encapsulation
- Getters and Setters
*/

package Theory.Class_06;

import java.util.Scanner;

// Encapsulation is to wrap up some private variables and their get and set methods
// It allows us to hide sensitive data (code) from outsiders

// When we set variable as private they are only accessible inside the class. 
// In our program we need to use those variables outside.
// For that we use getter and setter methods
// It allows us to access variables but others cant when seeing our program functionalities
// It prevents code from being altered

public class Student {
    private int marks;
    String name;

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

class StudentTester {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        Student s1 = new Student();

        System.out.print("Enter name: ");
        s1.name = scS.nextLine();
        System.out.print("Enter marks: ");
        int marksInput = scS.nextInt();
        s1.setMarks(marksInput);

        sc.close();
        scS.close();

        System.out.println("Student name: " + s1.name);
        System.out.println("Student marks: " + s1.getMarks());
    }
}
