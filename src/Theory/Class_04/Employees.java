/*
* Date: 10 March 2026
* Concepts Covered:
- Array of Objects declaration and construction
*/

package Theory.Class_04;

import java.util.Scanner;

public class Employees {

    int id;
    String name;
    float salary;
    long contact;
    String dept;

    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        Employees e[] = new Employees[2]; // Declaration of array of object. An array of 2 objects will be created

        for (int i = 0; i < 2; i++) {
            e[i] = new Employees(); // Constructor used to make the objects

            System.out.println("Enter data for Employee ");
            e[i].id = i + 1;
            System.out.print("Enter Employee Name: ");
            e[i].name = scStr.nextLine();
            System.out.print("Enter Employee Salary: ");
            e[i].salary = scInt.nextFloat();
            System.out.print("Enter Employee Contact: ");
            e[i].contact = scInt.nextLong();
            System.out.print("Enter Employee Department: ");
            e[i].dept = scStr.nextLine();
            System.out.println();
        }

        System.out.println();
        System.out.println("<----- Employee Details----->");
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.println("Id: " + e[i].id);
            System.out.println("Name: " + e[i].name);
            System.out.println("Salary: " + e[i].salary);
            System.out.println("Contact: " + e[i].contact);
            System.out.println("Department: " + e[i].dept);
            System.out.println();
        }

        scInt.close();
        scStr.close();
    }
}