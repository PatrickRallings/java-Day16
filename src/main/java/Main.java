import ABC.C;
import Persons.Person;
import Persons.Student;

public class Main {
    public static void main(String[] args){

    //ABC Assignment --- Start
        C c = new C();
        c.a();
        c.b();
        c.c();
    //ABC Assignment --- End

    //Persons and Subclasses Assignment --- Start
        Person patrick = new Person("Patrick Rallings", "3633 Nancy Creek Rd");
        Person matt = new Person("Matt Pachapa", "123 Ansley Rd");
        System.out.println(patrick.toString()+matt.toString());

        Student patrick2 = new Student("Patrick Rallings", "3633 Nancy Creek Rd");
        Student matt2 = new Student("Matt Pachapa", "123 Ansley Rd");
        System.out.println(patrick2.toString()+matt2.toString());
        patrick2.study();
        System.out.println(patrick2.toString()+matt2.toString());
        //Persons and Subclasses Assignment --- End
    }
}
