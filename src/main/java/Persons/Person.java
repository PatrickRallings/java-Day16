package Persons;

public class Person {
    String fullName;
    String address;

    public Person(String fullName, String address){
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public String toString() {
        return  "-----\n"+
                "Name: " + fullName + '\n' +
                "Address: " + address + '\n';
    }
}
