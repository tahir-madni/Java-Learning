/*
* Date: 24 March 2026
*/

package Quizes.Theory_Quiz_01;

public class Product {

    private String productName;
    private int price;
    private int quantity;

    public void setName(String productName) {
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    void sell() {
        if (quantity <= 0) {
            System.out.println("Insufficient Stock!!");
        } else {
            quantity--;
        }
    }

    void restock() {
        quantity = 100;
    }

    void displayProduct() {
        System.out.println("\nThe product name is: " + productName);
        System.out.println("The product price is: " + price);
        System.out.println("The product quantity are: " + quantity);
    }

}

class ProductTester {
    
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setName("Apple");
        p1.setPrice(60);
        p1.setQuantity(10);

        p1.displayProduct();

        p1.sell();
        p1.displayProduct();

        p1.restock();
        p1.displayProduct();
    }
}
