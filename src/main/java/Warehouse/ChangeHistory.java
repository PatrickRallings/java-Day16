package Warehouse;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    ArrayList<Double> changes;

    public ChangeHistory(){
        changes = new ArrayList<>();
    }

    public ChangeHistory(double initialBalance){
        changes = new ArrayList<>();
        changes.add(initialBalance);
    }

    public void add(double status){
        changes.add(status);
    }

    public double maxValue() {
        return Collections.max(changes);
    }

    public double minValue() {
        return Collections.min(changes);
    }

    public double average() {
        return changes.stream().mapToDouble(Double :: doubleValue).average().getAsDouble();
    }

    public void clear(){
        changes.clear();
    }

    public String toString(){
        String s = "";
        for (Double change : changes){
            s += String.valueOf(change) + " ";
        }
        return s;
    }
}
