package dkit.sd2;
// The Employee class is a normal class (A POJO Plain Old Java Object)
//
// When it is extended by the Manager class,
// then we call this Employee class the superclass,
// and the Manger class is called the subclass.

public class Employee
{
    private String name;
    private double hours;
    private double rate;

    public Employee(String name, double hours, double rate)
    {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }

    public Employee()
    {
        this.name = "";
        this.hours = 0;
        this.rate = 0;
    }

    public String getName()
    {
        return this.name;
    }

    public double getHours()
    {
        return this.hours;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setHours(double hours)
    {
        this.hours = hours;
    }

    public double getRate()
    {
        return rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public double getSalary()
    {
        return  this.rate * this.hours;
    }

    @Override                  // overrides toString() inherited from Object class
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", rate=" + rate +
                '}';
    }
}
