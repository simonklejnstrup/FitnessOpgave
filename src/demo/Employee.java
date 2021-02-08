package demo;

public class Employee extends Person {
    protected int hours;
    protected int salary;
    protected int vacation;

    public Employee(String name, String cpr, int hours, int salary) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }

    public Employee(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }

    public Employee(String name, String cpr) {
        super(name, cpr);

    }



    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


}
