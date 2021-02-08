package demo;

public class Instructor extends Employee {

    public final int hourSalary = 199;

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr, hours);
        this.vacation = 0;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getSalary(){
        return this.hours * hourSalary;
    }

    @Override
    public String toString() {
        return String.format("%-13s%-15s%-16s%-13s%s", name, cpr, hours, getSalary(), vacation);
    }
}
