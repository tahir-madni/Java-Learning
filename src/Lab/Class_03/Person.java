/*
* Date: 18 March 2026
* Concepts Covered:
- private modifier
- Accessing private modifier in different class using methods
- toString() method
- getters and setters methods
*/

package Lab.Class_03;

public class Person {

    private String name;
    private int age;
    public double height;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Person's name is : " + getName() + ", age is : " + getAge() + " and height is : " + height;
    }
}

class Main {
    
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.height = 6.0;
        p1.setAge(20);
        p1.setName("Ali");

        // System.out.println(p1);

        // System.out.println("Person's name is : " + p1.getName() + ", age is : " + p1.getAge() + " and height is : " + p1.height);
    }
}
