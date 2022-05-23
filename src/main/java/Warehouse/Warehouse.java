package Warehouse;

public class Warehouse {
    double capacity;
    double balance;

    public Warehouse(double capacity){
        this.capacity = capacity;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double howMuchSpaceLeft(){
        return balance - capacity;
    }

    public void addToWarehouse(double amountToAdd){
        if (amountToAdd < 0){
            System.out.println("You can't add a negative amount.");
        }
        else if (amountToAdd <= howMuchSpaceLeft()){
            balance += amountToAdd;
        } else {
            balance = capacity;
            System.out.println((capacity-howMuchSpaceLeft())+" was thrown away.");
        }
    }

}
