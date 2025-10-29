package week10.Ex28.movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{
    private List<Organism> organisms;
    public Group(){
        organisms = new ArrayList<Organism>();
    }
    public String toString(){
        String s = "";
        for(Organism o : organisms){
            s += o.toString() + "\n";
        }
        return s;
    }
    public void addToGroup(Movable movable){
        organisms.add((Organism)movable);
    }
    public void move(int dx, int dy){
        for(Organism o : organisms){
            o.move(dx, dy);
        }
    }
}
