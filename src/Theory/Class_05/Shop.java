/*
* Date: 17 March 2026
* Concepts Covered:
- Parameter Constructor
- Method creation and use
*/

package Theory.Class_05;

public class Shop {

    String item;
    int price;
    int quantity;

    Shop(String a, int b, int c) {
        item = a;
        price = b;
        quantity = c;
    }

    void printVal() {
        System.out.println("\nThe item is: " + item);
        System.out.println("The quantity is: " + quantity);
        System.out.println("The  total price is: " + (price * quantity));
    }

    public static void main(String[] args) {
        Shop s1 = new Shop("Apple", 3, 5);
        Shop s2 = new Shop("Orange", 8, 1);
        Shop s3 = new Shop("Grape", 3, 10);

        s1.printVal();
        s2.printVal();
        s3.printVal();
    }
}
