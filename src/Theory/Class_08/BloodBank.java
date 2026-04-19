/*
* Date: 7 April 2026
* Concepts Covered:
- Inheritance and its type
*/

import java.util.Scanner;

public class BloodBank {
    private int id;
    private String name;
    private String b_group;
    private int quanity;

    void setPersonalData(int id, String name, String b_group) {
        this.id = id;
        this.name = name;
        this.b_group = b_group;
    }

    void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    int getQuanity() {
        return quanity;
    }

    void Donate() {
        quanity++;
        System.out.println("Blood donated successfully!");
    }

    void Receive() {
        if (quanity == 0) {
            System.out.println("Insufficient amount left");
        } else {
            quanity--;
        }
        System.out.println("Blood received by receptor!");
    }
}

class BloodBankTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);

        BloodBank bb = new BloodBank();
        int opt, id;
        String name, b_group;
        bb.setQuanity(5);

        do {
            System.out.println("Welcome to Blood Bank!");
            System.out.println("Choose an option below:");
            System.out.println("1. Donor");
            System.out.println("2. Receptor");
            System.out.println("3. Check quantity");
            System.out.println("4. Exit");
            System.out.print("Enter an option: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1: {
                    System.out.print("Enter id: ");
                    id = sc.nextInt();
                    System.out.print("Enter name: ");
                    name = scS.nextLine();
                    System.out.print("Enter blood group: ");
                    b_group = scS.nextLine();
                    bb.setPersonalData(id, name, b_group);
                    bb.Donate();
                    break;
                }
                case 2: {
                    System.out.print("Enter id: ");
                    id = sc.nextInt();
                    System.out.print("Enter name: ");
                    name = scS.nextLine();
                    System.out.print("Enter blood group: ");
                    b_group = scS.nextLine();
                    bb.setPersonalData(id, name, b_group);
                    bb.Receive();
                    break;
                }
                case 3: {
                    System.out.println("Current quantity: " + bb.getQuanity());
                    break;
                }
                case 4: {
                    opt = 0;
                    System.out.println("Program exited...");
                    break;
                }
                default: {
                    System.out.println("Invalid option");
                }
            }
        } while (opt != 0);
    }
}
