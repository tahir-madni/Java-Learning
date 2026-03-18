/*
* Date: 17 March 2026
* Concepts Covered:
- Access modifiers and their scopes (Public,Protected,Private,Default)
*/

package Theory.Class_05.University;

public class accessModifiers {

   /* 
   Packages are folder made to classify the files and codes
   
   There are 3 scopes of a variable (Access Modifiers):
   
   1. Public
      - Its accessable across every class and package
   2. Protected
      - Works inside every class inside its package
      - can be inherited to a sub class inside another package
   3. Private
      - Works only inside its class
   4. Default
      - Works inside every class inside its package
      - Can't be inherited to a sub class inside another package
   */

   /* 
   
   | Access Modifiers | Exam  | Finance | Student | Non_Teaching | Teaching |
   |        a         |  yes  |   yes   |   yes   |      no      |    no    |
   |        b         |  yes  |   no    |   no    |      no      |    no    |
   |        c         |  yes  |   yes   |   yes   |      yes     |    yes   | : Sub-class needed
   |        d         |  yes  |   yes   |   yes   |      yes     |    yes   |
   
   */
}