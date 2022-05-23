package Persons;

public class Teacher extends Person{

    int classTaught;
    public Teacher(String fullName, String address, int classTaught) {
        super(fullName, address);
        this.classTaught = classTaught;
    }

    public String getClassTaught(){
        return String.valueOf(this.classTaught);
    }

    @Override
    public String toString(){
        return  "-----\n"+
                "Name: " + fullName + '\n' +
                "Address: " + address + '\n' +
                "Class Taught (#): " + getClassTaught() + "\n";
    }
}
