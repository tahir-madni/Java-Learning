/*
* Date: 11 March 2026
* Concepts Covered:
- Loop (for,while,do-while)
*/
package Lab.Class_02;

import java.util.Scanner;

/* public class loop {

    public static void main(String[] args) {
        int n = 0;
        do {
            System.out.println(n);
            n++;
        } while (n > 0 && n < 5);
    }

} 
*/

/* 
public class loop {
    public static long calcFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        System.out.println("The factorial of " + num + " is: " + calcFactorial(num));
        sc.close();
    }
} 
*/

public class loop {
    public static void printNumsExceptEight(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 8) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printNumsExceptEight(n);
        sc.close();
    }
}