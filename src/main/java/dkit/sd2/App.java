package dkit.sd2;

import java.util.ArrayList;

/**
 * // October 2022
 * Demonstrates INHERITANCE
 * Manager class inherits from (extends) Employee class.
 * Use of:
 * - extends             - create inheritance relationship between classes
 * - super()             - call superclass constructor
 * - super.methodName()  - call a superclass method
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n*** Inheritance Demo - Employee & Manager ***");
        App app = new App();
        app.start();
    }

    public void start() {
        Employee emp1 = new Employee("John Brady", 35, 123.45);
        Employee emp2 = new Employee("Mary Ryan", 20, 198.45);

        Manager mgr1 = new Manager("Bob", 40, 123.5, 300);
        Manager mgr2 = new Manager("Martin", 35, 113.5, 200);

        System.out.println("m1 salary = " + mgr1.getSalary());

        // toString() - test the versions defined in each class
        System.out.println("\ntoString() Test:");
        System.out.println(emp1.toString());
        System.out.println(mgr1.toString());
        System.out.println("\n\n");

        // An ArrayList of type "Employee" can store references to both Employee objects
        // and Manager objects, because a Manager is a "type-of" Employee.

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(emp1);    // Employees
        employees.add(emp2);
        employees.add(mgr1);    // Managers
        employees.add(mgr2);

//      TODO#1 Write loop to output details of all objects from the arrayList (using toString())
        System.out.println("\nDetails from Arraylist:");

//      TODO#2 Write code to display only the name & salaries of all employees
        System.out.println("\nNames & salaries:");


//      TODO#3 Examine the following code
//        The TYPE of a reference is important.
//        A reference of type Employee can refer to a Manager because a Manager is an Employee (due to inheritance)
//        A reference of type Manager can NOT refer to an Employee type object, as an employee is not a Manager
//
//        Employee emp = mgr1;  // Is this OK - why or why not?
//
//        Manager mgr  = emp1;  // Is this OK - why or why not?

//      TODO#4 Output only the Managers - use "instanceof" operator and toString()

//      TODO#5  Output only the name and bonus for all Managers (but not Employees)
        // a Cast will be required to convert the reference type from Employee to Manager
        // in order to call the getBonus() method

//      Note that an ArrayList can store a null entry, so the following is valid.
//      Employee emp10 = null;
//      employees.add(emp10);       // what happens?
//      This means that we should normally test to make sure that a reference
//      retrieved from an ArrayList is not null, before we use it.

    }
}
