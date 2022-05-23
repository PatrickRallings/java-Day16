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
            balance = capacity;
        }
    }

    public double takeFromWarehouse(double amountToTake){
        double amountGot;
        if (amountToTake < 0){
            amountGot = 0;
        }
        else if (amountToTake <= balance){
            balance -= amountToTake;
            amountGot = amountToTake;
        } else {
            balance = 0;
            amountGot = balance;
        }
        return amountGot;
    }

    public String toString(){
        return "balance = "+this.getBalance()+", space left = "+howMuchSpaceLeft();
    }
}
