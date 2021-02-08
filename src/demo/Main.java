package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee claus = new Admin("Claus", "123456-1234");
        Employee anna = new Admin("Anna", "123456-1234");

        Employee tove = new Instructor("Tove", "123456-1234", 20);
        Employee henning = new Instructor("Henning", "123456-1234", 15);

        Member morten = new Member("Morten", "123456-1234", false);
        Member martin = new Member("Martin", "123456-1234", true);
        Member martina = new Member("Martina", "123456-1234", false);
        Member marcel = new Member("Marcel", "123456-1234", true);

        ArrayList<Person> people = new ArrayList<>();

        Collections.addAll(people, claus, anna, tove, henning, morten, martin, martina, marcel);


        System.out.println("FITNESS EMPLOYEES\n");
        System.out.println("Name         Cpr          Hours         Salary       Vacation");
        System.out.println("******************************************************************");
        for (Person p: people) {
            if (p instanceof Employee){
                System.out.println(p);
            }
        }
        System.out.println("===========================================\n\n\n");
        System.out.println("FITNESS MEMBERS\n");
        System.out.println("Name         Cpr            Membertype      Fee");
        System.out.println("******************************************************************");
        for (Person p : people) {
            if (p instanceof Member){
                System.out.println(p);
            }
        }
        System.out.println("===========================================\n\n\n");

        System.out.println("EMPLOYEES & MEMBERS\n");
        System.out.println("Name         Cpr");
        System.out.println("******************************************************************");
        for (Person p : people) {
            System.out.printf("%-13s%s\n", p.getName(), p.getCpr() );
        }






    }
}
