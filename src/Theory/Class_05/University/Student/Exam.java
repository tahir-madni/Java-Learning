/*
* Date: 17 March 2026
* Concepts Covered:
- Access modifiers and their scopes (Public,Protected,Private,Default)
*/

package Theory.Class_05.University.Student;

public class Exam {
    int a; // Accessible in its own package

    private int b; // Acessible only in class

    protected int c; //Acessible across its own package or other package (sub class needed)

    public int d; // Acessible all across the university package (sub packages and classes)

    public static void main(String[] args) {

        Exam e1 = new Exam();

        System.out.println(e1.a);

        System.out.println(e1.b);

        System.out.println(e1.c);

        System.out.println(e1.d);

    }
}
