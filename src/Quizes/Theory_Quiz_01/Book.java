/*
* Date: 24 March 2026
*/

package Quizes.Theory_Quiz_01;

public class Book {
    String title;
    String author;
    int copiesAvailable;

    Book(String a, String b, int c) {
        title = a;
        author = b;
        copiesAvailable = c;
    }

    void borrowBook() {
        if (copiesAvailable > 0) {
            copiesAvailable--;
        } else {
            System.out.println("Book not available");
        }
    }

    void returnBook() {
        copiesAvailable++;
    }

    void displayBookInfo() {
        System.out.println("\nThe book title is: " + title);
        System.out.println("The book author is: " + author);
        System.out.println("The available copies are: " + copiesAvailable);
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Jungle Book", "Sam", 20);

        b1.borrowBook();
        b1.displayBookInfo();
        b1.returnBook();
        b1.displayBookInfo();
    }
}
