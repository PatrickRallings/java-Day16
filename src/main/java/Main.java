import ABC.C;
import Persons.Person;
import Persons.Student;
import Persons.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

    //ABC Assignment --- Start
        C c = new C();
        c.a();
        c.b();
        c.c();
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
        //Persons and Subclasses Assignment --- End
    }
    public static void printPersons(ArrayList<Person> persons){
        String s = "";
        for (Person person : persons){
            s += person.toString();
        }
        System.out.println(s);
    }
}
