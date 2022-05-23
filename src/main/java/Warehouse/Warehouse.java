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
        return capacity - balance;
    }

    public void addToWarehouse(double amountToAdd){
        if (amountToAdd < 0){
        }
        else if (amountToAdd <= howMuchSpaceLeft()){
            balance += amountToAdd;
        } else {
            balance = getCapacity();
        }
    }

    public void takeFromWarehouse(double amountToTake){
        if (amountToTake < 0){
            System.out.println("Amount can't be negative.");
        }
        else if (amountToTake <= balance){
            balance -= amountToTake;
        } else {
            balance = 0;
        }
    }

    public String toString(){
        return "balance = "+this.getBalance()+", space left = "+howMuchSpaceLeft();
    }
}
