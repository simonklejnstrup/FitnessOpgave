package demo;

public class Admin extends Employee {
    private int vacation;

    public Admin(String name, String cpr) {
        super(name, cpr);
        this.hours = 37;
        this.salary = 33000;
        this.vacation = 5;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }
}
