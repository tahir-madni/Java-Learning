/*
* Date: 25 March 2026
* Concepts Covered:
- Constructors
- Constructors type (default,no-argument,parameterized)
- Constructor overloading
*/

package Lab.Class_04;

public class Book {
    String title;
    String author;
    int price;

    Book() {
        this.title = "unkown";
        this.author = "unknown";
        this.price = 0;
    }

    Book(String title) {
        this.title = title;

    }

    Book(String title, String author, int price) {
        this(title);
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "\ntitle: " + title + "\nauthor: " + author + "\nprice: " + price;

    }

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Harry Potter", "JK Rowling", 50);
        Book b3 = new Book("Great Gatsby");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
