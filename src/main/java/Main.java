import ABC.C;
import Persons.Person;
import Persons.Student;
import Persons.Teacher;
import Warehouse.ProductWarehouse;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

    //ABC Assignment --- Start
        C c = new C();
        c.a();
        c.b();
        c.c();
        System.out.println("--------------------------------------");
    //ABC Assignment --- End

    //Persons and Subclasses Assignment --- Start
        Student patrick = new Student("Patrick Rallings", "3633 Nancy Creek Rd");
        Student matt = new Student("Matt Pachapa", "123 Ansley Rd");
        Teacher hector = new Teacher("Hector Gonzalez", "123 Ansley Rd", 104);
        int i = 0;
        while (i < 25){
            patrick.study();
            i++;
        }
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(patrick);
        persons.add(matt);
        persons.add(hector);
        printPersons(persons);
        System.out.println("--------------------------------------");
        //Persons and Subclasses Assignment --- End

        //Warehouse Assignment --- Start
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);
        System.out.println("--------------------------------------");
        //Warehouse Assignment --- End
    }
    public static void printPersons(ArrayList<Person> persons){
        StringBuilder s = new StringBuilder();
        for (Person person : persons){
            s.append(person.toString());
        }
        System.out.println(s);
    }
}
