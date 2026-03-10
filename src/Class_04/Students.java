/*
* Date: 10 March 2026
* Concepts Covered:
- Array of Objects declaration and construction
*/

package Class_04;

import java.util.Scanner;

public class Students {

    int id;
    String name;
    int grade;
    Long contact;

    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        Students s[] = new Students[2]; // Declaration of array of object. An array of 2 objects will be created

        for (int i = 0; i < 2; i++) {
            s[i] = new Students(); // Constructor used to make the objects

            System.out.println("Enter data for Student ");
            s[i].id = i + 1;
            System.out.print("Enter Student Name: ");
            s[i].name = scStr.nextLine();
            System.out.print("Enter Student grade: ");
            s[i].grade = scInt.nextInt();
            System.out.print("Enter Student Contact: ");
            s[i].contact = scInt.nextLong();
            System.out.println();
        }

        System.out.println();
        System.out.println("<----- Student Details----->");
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.println("Id: " + s[i].id);
            System.out.println("Name: " + s[i].name);
            System.out.println("grade: " + s[i].grade);
            System.out.println("Contact: " + s[i].contact);

            System.out.println();
        }
    }
}
