/*
* Date: 7 April 2026
* Concepts Covered:
- Inheritance and its type
*/

package Theory.Class_08.Hybrid_Inheritance;

public class Tester {
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println("Bike");
        System.out.println(b.noOfWheels); // own property
        b.drive(); // parent property
        b.stop(); // parent property

        Car c = new Car();
        System.out.println("\nCar");
        System.out.println(c.noOfDoors); // own property
        c.drive(); // parent property
        c.stop(); // parent property

        Suv sv = new Suv();
        System.out.println("\nSuv");
        System.out.println(sv.cargoSpace); // own property
        System.out.println(sv.noOfDoors); // parent property
        sv.drive(); // grandparent property
        sv.stop(); // grandparent property

        Sedan sd = new Sedan();
        System.out.println("\nSedan");
        System.out.println(sd.fuelEffeciency); // own property
        System.out.println(sd.noOfDoors); // parent property
        sd.drive(); // grandparent property
        sd.stop(); // grandparent property
    }
}