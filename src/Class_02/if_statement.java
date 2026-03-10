/*
* Date: 24 Feb 2026
* Concepts Covered:
- if statement
- nested if statement
- if else statement
- comparators
*/

package Class_02;

public class if_statement {

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
}
