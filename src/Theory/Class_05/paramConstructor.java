/*
* Date: 17 March 2026
* Concepts Covered:
- Parameter Constructor
*/

package Theory.Class_05;

public class paramConstructor {

    static String company; //static: independent of object
    String regno;
    String color;
    int model;

    /*     
    - Variables that we want to be set by us or user 
    - Ones that will be diff for each time constructor is used 
    */

    paramConstructor(String a, String b) {

        regno = a;
        color = b;
        model = 2026;

        /*         
        - All the car entry created using the constructor will belong to same company and model
        - The color and regno will be diff for each 
        */
    }

    public static void main(String[] args) {

        paramConstructor.company = "BMW";
        /*
        Company variable accessed without an object. Since it is static 
        */

        /* 
        Since company variable is static it means that if its value is changed it will shared with
        every object that has been created using the constructor 
        */

        paramConstructor c1 = new paramConstructor("ABC-111", "Blue");
        paramConstructor c2 = new paramConstructor("HGC-223", "white");

        System.out.println(c1.regno);
        System.out.println(c1.color);
        System.out.println(company);
        System.out.println(c1.model);
        System.out.println(c2.regno);
        System.out.println(c2.color);
        System.out.println(company);
        System.out.println(c2.model);
    }
}