package dkit.sd2;

/* INHERITANCE Demonstration
    Manager extends Employee
   - means that the Manager class INHERITS FROM the Employee class.
   - Employee is known as the Super-Class, and Manager as the Sub-Class.
   - Manager inherits all the instance variable and methods
     from its superclass (Employee), and
     adds some of its ow and overrides getSalary()

     A Manager is a "type-of" Employee.  Manager "is-an" Employee.
     Known often as an "is-a" relationship.
 */

public class Manager extends Employee      // Manager inherits from Employee
{
                            // Manager object will inherit all Employee fields and methods
    private double bonus;   // Add one additional field called 'bonus'

    public Manager(String name, double hours, double rate, double bonus)
    {
        super(name, hours, rate);   // calls the constructor of the superclass (Employee)
                                    // to let it initialize the Employee fields.
        this.bonus = bonus;     // initialize the field defined in this class.
    }

    public Manager()       // the 'no-argument' construct
    {
        super();                // calls the no-arg constructor of the superclass (Employee)
        this.bonus = 0;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    // override (replace) the getSalary() method defined in Employee parent class.
    // The salary must be calculated in a different way for a Manager, so we must
    // override the getSalary() method from Employee and implement the new salary
    // calculation in this Manager class.
    //
    @Override
    public double getSalary()
    {
        // call the getSalary() method from the SUPERclass, i.e. Employee
        // and add the manager's bonus to that salary.
        return super.getSalary() + this.bonus;
    }

    // Note : to Generate this, select the "String concat(=) and super.toString()" template
    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                "} " + super.toString();        // prints representation of superclass field data
    }

}
