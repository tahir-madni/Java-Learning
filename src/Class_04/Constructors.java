package Class_04;

public class Constructors {
    int a;
    float b;
    String c;
    char d;
    boolean e;

    Constructors() { // No argument constructor - values set by us
        a = 5;
        b = 9.6f;
        c = "No value";
        d = 'A';
        e = false;
    }

    public static void main(String[] args) {

        Constructors temp = new Constructors();

        System.out.println(temp.a);
        System.out.println(temp.b);
        System.out.println(temp.c);
        System.out.println(temp.d);
        System.out.println(temp.e);

        /* 
        - In Java if a local variable is not declared then the code shows error and doesnt run - default values arent set
        - For a class variable default values are declared
        */

        /*
        method:
        - return type
        - any name
        - pass arguments
        - have to be defined

        constructor:
        - special type of method to create obj
        - no return type
        - named same as the class
        - pass arguments too
        - dont have to define
         */

        /* 
        Constructor Tyes
        1. Default
        2. No argument - set our values instead of default values during initialization
        3. parameterized
        */
    }
}