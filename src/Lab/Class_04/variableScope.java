/*
* Date: 25 March 2026
* Concepts Covered:
- Scope of variable (static , local , global)
*/

package Lab.Class_04;

public class variableScope {
    
    int instanceVar = 10; //instance variable

    static int staticVar = 30;

    public void display() {
        int localVar = 50; //local variable
        System.out.println(localVar);
        System.out.println(staticVar);
        System.out.println(instanceVar);
    }

    public static void main(String[] args) {

        variableScope obj = new variableScope();

        obj.instanceVar = 1000;
        staticVar = 300;
        obj.display();

        variableScope obj2 = new variableScope();
        obj2.display();

        variableScope obj3 = new variableScope();
        obj3.display();
    }
}
