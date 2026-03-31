/*
* Date: 31 March 2026
* Concepts Covered:
- Inheritance
*/

package Theory.Class_07;

public class Car {

    int speed;
}

/* 
  - Iheritance: Share property of one class (parent) with another class (child)
  - Accessibility : Class that can access it own properties
  - Sharing: Accessing properties of another class by making an object of that class using it constructor 
*/

class Bike extends Car { // Bike inherited property of Car

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.speed = 30; // accessibility
        System.out.println(c1.speed);

        Bike b1 = new Bike();

        b1.speed = 20; // inherited - b1 uses speed variable of class Car
        System.out.println(b1.speed);
    }
}



