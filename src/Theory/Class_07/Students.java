/*
* Date: 31 March 2026
* Concepts Covered:
- Inheritance
*/

package Theory.Class_07;

public class Students {

    int id;
    String name;
}

class Exam extends Students { // Exam inherited property of Students
    
    int marks;
}

class StudentsTester {

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.id = 1;
        s1.name = "Ali";
        // s1.marks = 5; // Cant access(inherit) property of its child Exam

        Exam e1 = new Exam();
        e1.id = 2;
        e1.name = "Madni";
        e1.marks = 20;
    }
}