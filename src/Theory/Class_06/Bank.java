/*
* Date: 24 March 2026
* Concepts Covered:
- Encapsulation
*/

package Theory.Class_06;

import java.util.Scanner;

public class Bank {
    String name;
    int amount;
    private int balance;

    void setBal(int balance) {
        this.balance = balance;
    }

    int getBal() {
        return balance;
    }
}

class BankTester {

    public static void main(String[] args) {

        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        Bank b1 = new Bank();

        b1.setBal(20000);

        int option = 1;

        System.out.print("Enter name: ");
        b1.name = scStr.nextLine();

        while (option != 0) {

            System.out.print("\nEnter 1 to deposit\nEnter 2 to withdraw\nEnter 3 to check balance\nEnter 0 to end: ");
            option = scInt.nextInt();

            if (option == 1) {
                System.out.print("\nEnter the amount: ");
                b1.amount = scInt.nextInt();
                int newBalance = b1.getBal() + b1.amount;
                b1.setBal(newBalance);
            } else if (option == 2) {
                System.out.print("\nEnter the amount: ");
                b1.amount = scInt.nextInt();
                int newBalance = b1.getBal() - b1.amount;
                b1.setBal(newBalance);
            } else if (option == 3) {
                b1.getBal();
                System.out.println("Current balance is:" + b1.getBal());
            } else {
                System.out.println("invalid input!!");
                break;
            }
        }
        System.out.println("Updated balance is:" + b1.getBal());
    }
}
