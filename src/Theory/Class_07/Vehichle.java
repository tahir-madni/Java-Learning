/*
* Date: 31 March 2026
* Concepts Covered:
- Inheritance and its type
- Hierarichal inheritance
*/

package Theory.Class_07;

/* 
Types of inheritance:

  - Single (parent with one child)
     - Child can access parent properties

  - Hierarichal (parent with multiple childs)
     - All Children can access parent properties
     - Sibling cant access eachothers properties

  - Multilevel (parent with child and grandchildren)
     - All Children can access parent properties
     - All Children can access their grand-parent properties
*/

public class Vehichle {
    int noOfWheels;
    
    void canAccelerate(){
        System.out.println("Vehichle runs");
    }
}

class Truck extends Vehichle {
    void trunkCapacity() {
        System.out.println("Boot space available");
    }
}

class Scooter extends Vehichle {
    void kickStart() {
        System.out.println("Bike started");
    }
}

class VehichleTester {

    public static void main(String[] args) {

        Truck t1 = new Truck();
        t1.noOfWheels = 6;
        t1.canAccelerate();
        t1.trunkCapacity();
        // t1.kickStart();  // Can't access sibling properties

        Scooter s1=new Scooter();
        s1.noOfWheels = 6;
        s1.canAccelerate();
        // s1.trunkCapacity();  // Can't access sibling properties
        s1.kickStart();
    }

}