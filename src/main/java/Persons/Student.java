package Persons;

public class Student extends Person{

    int credits;

    public Student(String fullName, String address) {
        super(fullName, address);
        this.credits = 0;
    }

    public String getCredits(){
        return String.valueOf(this.credits);
    }

    public void study(){
        credits++;
    }

    @Override
    public String toString(){
        return  "-----\n"+
                "Name: " + fullName + '\n' +
                "Address: " + address + '\n' +
                "Credits: " + getCredits() + "\n";
    }
}
