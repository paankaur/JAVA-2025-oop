package week9.Ex18.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{
    private int maximumCapacity;
    private List<Thing> things = new ArrayList<Thing>();

    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
    }
    public boolean addThing(Thing thing){
        if (getVolume() + thing.getVolume() <= maximumCapacity){
            things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Thing thing : things) {
        volume += thing.getVolume();
        }
    return volume;
    }

    public String toString(){
        String s = "";
        int count = 0;
        for (Thing thing : things) {
            count++;

        }
        s = "things in the box: " + count + ", volume: " + getVolume() + "dm³";
        return s;
    }
}
