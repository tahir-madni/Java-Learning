/*
 * Date: 24 Feb 2026
 * Concepts Covered:
  - Operators
  - if statements
  - switch cases
  - Loops (for,while,do-while)
 */

public class Class_02 {
    /*
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
    
        System.out.println("Sum is: " + (a + b));
        System.out.println("Diff is: " + (a - b));
        System.out.println("Product is: " + (a * b));
        System.out.println("Divide is: " + (a / b));
        System.out.println("Mod is: " + (a % b));
    }
    */

    /*
    public static void main(String[] args) {
        int x = 2;
    
        System.out.println("x is " + x);
        System.out.println("x++ is " + x++);
        System.out.println("++x is " + ++x);
        System.out.println("x-- is " + x--);
        System.out.println("--x is " + --x);
    
    }
    */

    /*
    public static void main(String[] args) {
        int time = 7;
        if (time >= 0 && time <= 23) {
            if (time >= 6 && time <= 8) {
                System.out.println("Its breakfast time");
            } else if (time >= 12 && time <= 14) {
                System.out.println("Its lunch time");
            } else if (time >= 16 && time <= 17) {
                System.out.println("Its snack time");
            } else if (time >= 19 && time <= 21) {
                System.out.println("Its dinner time");
            } else {
                System.out.println("No meal");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
    */

    /*
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
    */

    /*
    public static void main(String[] args) {
        int evenSum = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println("The sum of even num:" + evenSum);
    }
    */

    /*
    public static void main(String[] args) {
        int i = 0;
        int oddSum = 0;
        while (i <= 20) {
            if (i % 2 != 0) {
                oddSum += i;
            }
            i++;
        }
        System.out.println("The sum of odd num:" + oddSum);
    }
    */

    /*
    public static void main(String[] args) {
        int i = 0;
        int oddSum = 0;
    
        do {
            if (i % 2 != 0) {
                oddSum += i;
            }
            i++;
        } while (i <= 20);
        System.out.println("The sum of odd num:" + oddSum);
    }
    */
}