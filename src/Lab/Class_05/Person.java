/*
* Date: 1 April 2026
* Concepts Covered:
- Objects as methods arguments
- Returning Objects from methods
- Creating objects from methods
*/

package Lab.Class_05;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    // method passes Objects as function arguments and returns Objects from functions
    Person updateObject(Person s) {
        s.setName("Ahmed");
        s.setAge(70);
        return s;
    }

    // method created an object 
    // This functions returns an object
    // Static so it can be called with the class(belongs to the class and not an object created)
    static Person createPerson(String name, int age) {
        return new Person(name, age);
    }
}

class PersonTester {

    public static void main(String[] args) {
        Person s1 = Person.createPerson("Ali", 28);
        Person s2 = new Person("ahmed", 20);
        // System.out.println(s1.getAge());
        // s1.setAge(35);
        // System.out.println(s1.getAge());

        // Person s3 = s1.updateObject(s1);
        // System.out.println(s3.getName() + s3.getAge());
        // System.out.println(s1.getName());

        System.out.println(s1.getAge());
        System.out.println(s1.getName());
    }
}