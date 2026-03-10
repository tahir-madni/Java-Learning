/*
* Date: 24 Feb 2026
* Concepts Covered:
- switch case
*/

package Class_02;

public class switch_case {

    public static void main(String[] args) {
        int option = 2;
        int a = 5;
        int b = 10;

        switch (option) {
            case 1: {
                System.out.println("The Sum is: " + (a + b));
                break;
            }
            case 2: {
                System.out.println("The Difference is: " + (a - b));
                break;
            }
            case 3: {
                System.out.println("The Product is: " + (a * b));
                break;
            }
            case 4: {
                System.out.println("The Division is: " + (a / b));
                break;
            }
            case 5: {
                System.out.println("The Mod is: " + (a % b));
                break;
            }
            default: {
                System.out.println("Invalid option selected");
            }
        }
    }
}
