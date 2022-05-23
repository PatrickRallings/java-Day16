import ABC.C;
import Persons.Person;

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
        //Persons and Subclasses Assignment --- End
    }
}
