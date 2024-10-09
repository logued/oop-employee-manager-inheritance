package dkit.sd2;               // October 2024
import java.util.ArrayList;
/**
 * Demonstrates INHERITANCE
 * An Employee class is defined to store employee details and salary information.
 * A Manager class is defined to EXTEND the Employee class thus inheriting its
 * data fields and its methods. Additional fields and methods can be added in the Manager class.
 * We can override (redefine) methods in Manager that already exist in Employee in order to change
 * their behaviour. E.g. getSalary()  and toString()
 * The Manager class is a specialisation of the Employee (usually having extra or different
 * behaviour as defined in its methods)
 *
 * Manager class inherits from (extends) Employee class.
 * Use of:
 * - extends             - create inheritance relationship between classes
 * - super()             - call superclass constructor
 * - super.methodName()  - call a superclass method
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\n*** Inheritance Demo - Manager \"is an\" Employee ***");
        App app = new App();
        app.start();
    }

    public void start() {
        Employee emp1 = new Employee("John Brady", 35, 123.45);
        Employee emp2 = new Employee("Mary Ryan", 20, 198.45);
        System.out.println(emp1);
        System.out.println(emp2.toString());

        Manager mgr1 = new Manager("Bob", 40, 123.5, 300);
        Manager mgr2 = new Manager("Martin", 35, 113.5, 200);
        System.out.println(mgr1.toString());
        System.out.println(mgr2.toString());

        System.out.println("emp1 salary = " + emp1.getSalary());
        System.out.println("mgr1 salary = " + mgr1.getSalary());

        // A reference of type Employee can be used to refer to a Manager object,
        // as a Manager is an Employee. However, a reference of type Employee can only be used
        // to call methods defined in the Employee class.
        // The reference type determines which methods are callable.
        // (e.g. getBonus() can not be called using an Employee type reference.)
        //
        Employee emp3 = new Manager("Louis", 38, 123.5, 600);

        System.out.println("emp3 = " + emp3.toString() );
        // note: toString() method defined in the Manager object is called,
        // as the object is of type Manager (even though the reference is of type Employee)
        // (this is called polymorphism)

        // We can NOT call emp3.getBonus(), because it is not defined in Employee
        // and the emp3 reference is of type Employee, and Employee does not define getBonus()

        // We can CAST the reference type from one type to another.
        // Here, we can cast a reference of type Employee to type Manager, because
        // we know that the object in question is a Manager type.
        // When we 'cast' the reference, its type changes, and the new reference
        // has access to the methods defined for a Manager.
        Manager mgr3 = (Manager) emp3; // cast the reference type to type Manager
        System.out.println("mgr3.getSalary() = " + mgr3.getSalary());
            // calls the getSalary() for the object (i.e. for the Manager class)

        // Before we make a cast we should test to see if the object is of the required type.
        // Here, emp3 refers to a Manager type object.  We can test to see what type of object
        // the reference emp3 is referring to.  If it is an instance of Manager, then it is safe to
        // cast the reference type from Employee to type Manager.

        // POLYMORPHISM
        // An ArrayList of Employee type can store references to both Employee and Manager objects,
        // because a Manager is a "type-of" Employee.
        // The ArrayList elements are actually references of type Employee that
        // refer to Employee (or Manager) objects.

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(emp1);    // Employees
        employees.add(emp2);
        employees.add(mgr1);    // Managers
        employees.add(mgr2);

//      TODO#1 Write a loop to output details of all objects from the ArrayList (use toString())
        // Note that the version of toString() called is dependent on the object (not the reference)
        System.out.println("\nDetails from Arraylist:");

//      TODO#2 Write code to display only the name & salaries of all employees from the list
        System.out.println("\nNames & salaries:");


//      TODO#3 Examine the following commented out code
//        The TYPE of a reference is important.
//        A reference of type Employee can refer to a Manager because a Manager is an Employee (due to inheritance)
//        A reference of type Manager can NOT refer to an Employee type object, as an employee is not a Manager
//
//        Employee emp = mgr1;  // Is this OK - why or why not?
//
//        Manager mgr  = emp1;  // Is this OK - why or why not? How to fix it?

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
