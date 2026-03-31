/*
* Date: 24 March 2026
* Concepts Covered:
- Encapsulation
*/

package Theory.Class_06;

public class Employee {
    int id;
    String name;
    private double salary;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    void giveRaise() {
        salary = salary * 1.1;
    }

}

class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Ali");

        e1.setSalary(20000);

        System.out.println("The current salary is: " + e1.getSalary());

        e1.giveRaise();

        System.out.println("The updated salary after 10% raise is: " + e1.getSalary());
    }
}
