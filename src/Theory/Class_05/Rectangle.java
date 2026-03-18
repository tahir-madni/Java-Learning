/*
* Date: 17 March 2026
* Concepts Covered:
- Parameter Constructor
- Method creation and use
*/

package Theory.Class_05;

public class Rectangle {

    int length;
    int width;

    Rectangle(int a, int b) {
        length = a;
        width = b;
    }

    void area() { // It is a method
        int area = length * width;
        System.out.println("Area is " + area);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(6, 4);

        r1.area();
        r1.length = 20; // The new value is used by method if it is reassigned
        r1.area();
        r2.area();
    }
}