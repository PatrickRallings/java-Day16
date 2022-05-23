package Warehouse;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    public ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.balance  = initialBalance;
        history = new ChangeHistory(initialBalance);
    }

    @Override
    public void addToWarehouse(double amountToAdd){
        if (amountToAdd < 0){
        }
        else if (amountToAdd <= howMuchSpaceLeft()){
            balance += amountToAdd;
            history.add(getBalance());
        } else {
            balance = getCapacity();
            history.add(getBalance());
        }
    }

    @Override
    public void takeFromWarehouse(double amountToTake){
        if (amountToTake < 0){
            System.out.println("Amount can't be negative.");
        }
        else if (amountToTake <= balance){
            balance -= amountToTake;
            history.add(getBalance());
        } else {
            balance = 0;
            history.add(getBalance());
        }
    }

    public void printAnalysis(){
        System.out.println(history.toString());
    }



}
