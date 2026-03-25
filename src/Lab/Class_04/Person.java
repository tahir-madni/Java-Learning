/*
* Date: 25 March 2026
* Concepts Covered:
- Constructors
- Constructors type (default,no-argument,parameterized)
- Constructor overloading
*/

package Lab.Class_04;

public class Person {
    int age;
    String name;
    int height;
    double age2;

    /*         
    - Constructor overloading is when mutiple constructors are made with different parameter list
    - Parameter: listings , data type , order or quantity 
    */

    //Constructor 1
    Person() { // No-Argument constructor
        age = 20;
        name = "Sagar";
    }

    //Constructor 2
    Person(String name, int age) { // Parameterized constructors
        this.name = name;
        this.age = age;
    }

    //Constructor 3
    Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    //Constructor 4
    Person(String name, int age, int height) {
        this(name, age); //It will call constructor 2
        this.height = height;
    }

    //Constructor 5
    Person(double age2, String name) {
        this.name = name;
        this.age2 = age2;
    }

    public String toString() {
        return "\nName is : " + name + "\nAge is : " + age + "\nHeight is : " + height + "\nAge is : " + age2;
    }

}

class PersonTester {
    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println(p1);

        Person p2 = new Person("Ali", 20);
        System.out.println(p2);

        Person p3 = new Person(30, "Ahmed");
        System.out.println(p3);

        Person p4 = new Person("Arslan", 20, 6);
        System.out.println(p4);

        Person p5 = new Person(40.5, "Aaqib");
        System.out.println(p5);

    }
}
