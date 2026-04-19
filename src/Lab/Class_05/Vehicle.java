/*
* Date: 1 April 2026
* Concepts Covered:
- Inheritance
- super keyword
*/

package Lab.Class_05;

public class Vehicle {
    String brand;
    String color;
    int price;

    Vehicle(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    void display() {
        System.out.println("Brand : " + brand + " color: " + color + " Price : " + price);
    }
}

class Car extends Vehicle {
    int wheels;
    int doors;

    Car(String brand, String color, int price, int wheels, int doors) {

        // Super keyboard enabvles to access keywords from parent class
        super(brand, color, price);
        this.wheels = wheels;
        this.doors = doors;

    }

    void display() {

        super.display();
        System.out.println("Doors: " + doors + " Wheels : " + wheels);
    }
}

class vehichleTester {
    public static void main(String[] args) {

        Car c1 = new Car("BMW", "Black", 30000, 4, 2);
        c1.display();
    }
}
