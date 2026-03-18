/*
* Date: 17 March 2026
* Concepts Covered:
- Access modifiers and their scopes (Public,Protected,Private,Default)
*/

package Theory.Class_05.University.Department;

import Theory.Class_05.University.Student.Exam;

public class Non_Teaching extends Exam { // Non_teaching is now part of exam. 

    public static void main(String[] args) {

        Exam e1 = new Exam();

        /*   
        Since the variable "a" was set to default.
        It cant be accessed outside its package
        
        System.out.println(e1.a);
        */

        /*  
        Since the variable "b" was set to private.
        It cant be accessed outside its class
        
        System.out.println(e1.b);
        */

        Non_Teaching nt = new Non_Teaching();
        System.out.println(nt.c);
        /* 
        - To access c we extended Non-Teaching as a sub class of Exam (line 5)
        - Now class Non_Teaching has "inherited" c
        - To access it new use Non_Teaching constructor and then access it
        
        Note: To avoid the hassle of inheritance and sub class use "public" access modifiers 
        */

        System.out.println(e1.d);
    }
}
