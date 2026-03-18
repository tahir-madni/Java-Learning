/*
* Date: 17 March 2026
* Concepts Covered:
- Access modifiers and their scopes (Public,Protected,Private,Default)
*/

package Theory.Class_05.University.Student;

public class Student {

    public static void main(String[] args) {

        Exam e1 = new Exam();

        System.out.println(e1.a);

        /*  
        Since the variable "b" was set to private.
        It cant be accessed outside its class
        
        System.out.println(e1.b);
        */

        System.out.println(e1.c);

        System.out.println(e1.d);

    }
}