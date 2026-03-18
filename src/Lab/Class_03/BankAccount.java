/*
* Date: 18 March 2026
* Concepts Covered:
- private modifier
- Accessing private modifier in different class using methods
- toString() method
- getters and setters methods
*/

package Lab.Class_03;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount > 0) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void setAccountNumber(String accNum) {
        this.accountNumber = accNum;
    }

    public void setAccountHolderName(String accName) {
        this.accountHolderName = accName;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public String toString() { //makes sure that data is given when b1 is consoled
        return "Account Number: " + getAccountNumber() + "\nAccount Holder Name: " + getAccountHolderName()
                + "\nCurrent Balance: " + getBalance();
    }
}

class Main {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.setAccountNumber("123456abc"); // private variable accessed using a set method
        b1.setAccountHolderName("Owais"); // private variable accessed using a get method
        b1.deposit(1999.00);

        System.out.println(b1);
        
        b1.withdraw(500);
        System.out.println("");
        System.out.println(b1);
        System.out.println("");
        b1.withdraw(1500);
    }
}