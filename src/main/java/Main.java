import ABC.C;
import Herds.Herd;
import Herds.Organism;
import Persons.Person;
import Persons.Student;
import Persons.Teacher;
import Warehouse.ProductWarehouse;
import Warehouse.ProductWarehouseWithHistory;

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
//        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
//        juice.addToWarehouse(1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        juice.addToWarehouse(1.0);
//        System.out.println(juice);
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        juice.printAnalysis();
        System.out.println("--------------------------------------");
//Warehouse Assignment --- End

//Herds Assignment --- Start
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);

        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);
//Herds Assignment --- End
    }
    public static void printPersons(ArrayList<Person> persons){
        StringBuilder s = new StringBuilder();
        for (Person person : persons){
            s.append(person.toString());
        }
        System.out.println(s);
    }
}
