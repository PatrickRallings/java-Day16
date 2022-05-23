package Warehouse;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity) {
        super(productName, capacity);
    }



}
