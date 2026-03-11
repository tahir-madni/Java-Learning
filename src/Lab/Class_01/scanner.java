/*
* Date: 4 March 2026
* Concepts Covered:
- Scanner (User Inputs)
*/

package Lab.Class_01;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User name: ");
        String name = sc.next();
        System.out.println("Name: " + name);
    }
}
