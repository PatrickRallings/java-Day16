package Herds;

import java.util.ArrayList;

public class Herd implements Movable{

    ArrayList<Movable> herdList;

    public Herd(){
        herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        herdList.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable movable : herdList)
            movable.move(dx, dy);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Movable movable : herdList){
            s.append(movable.toString()).append("\n");
        }
        return s.toString();
    }
}
