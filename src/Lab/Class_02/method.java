/*
* Date: 11 March 2026
* Concepts Covered:
- Initialize Methods
- Use Methods
*/

package Lab.Class_02;

import java.util.Scanner;

public class method {

    /* Methods/functions can be made before or after the main function */

    /*     
    public static void main(String[] args) {
    
        System.out.println(add(2, 3));
        System.out.println(division(2, 3));
        helloMsg(); 
    } 
    */

    /* 
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        int a;
        System.out.print("Enter the number to find factorial of: ");
        a = scInt.nextInt();
    
        System.out.println("The factorial of " + a + " is: " + factorial(a));
    } 
    */
    public static void main(String[] args) {

        /* Task: Take n from user, and print numbers from 1 to n except 8 */

        Scanner scInt = new Scanner(System.in);
        int a;
        System.out.print("Enter the number: ");
        a = scInt.nextInt();

        sequence(a);
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static double division(double a, int b) {
        double result = a / b;
        return result;
    }

    public static int factorial(int a) {
        int result = 1;
        for (int i = a; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    public static void sequence(int a) {
        /* Task: Take n from user, and print numbers from 1 to n except 8 */

        for (int i = 1; i <= a; i++) {
            if (i == 8) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }

    /* Method without a parameter */
    public static void helloMsg() {
        System.out.println("Hello");
    }

}
