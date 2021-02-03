package demo;

public abstract class Person {
    protected String name;
    protected String cpr;

    public Person() {
    }

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }
}
