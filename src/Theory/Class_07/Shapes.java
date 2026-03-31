/*
* Date: 31 March 2026
* Concepts Covered:
- Inheritance and its type
- Hierarichal inheritance
*/

package Theory.Class_07;

public class Shapes {

    void draw() {
        System.out.println("Drawing in progess...");
    }
}

class Rectangle extends Shapes {
    int l;
    int b;

    void perimeter() {
        System.out.println("Perimeter is: " + (2 * (l + b)));
    }
}

class Circle extends Shapes {
    double r;

    void circumference() {
        System.out.println("Circumference is: " + (2 * 3.412 * r));
    }

}

class ShapesTester {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.l = 5;
        r1.b = 5;

        r1.perimeter();
        r1.draw();
        // r1.circumference();   // Can't access sibling properties

        Circle c1 = new Circle();
        c1.r = 4.0;

        c1.circumference();
        c1.draw();
        // c1.perimeter();  // Can't access sibling properties
    }
}