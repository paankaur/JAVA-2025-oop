package week7.Ex04;

import java.util.ArrayList;

public class Suitcase {
    private int maxKg;
    private ArrayList<Thing> things;

    public Suitcase(int maxKg) {
        this.maxKg = maxKg;
        this.things = new ArrayList<>();
    }
    public int totalKg(){
        int total = 0;
        for (Thing  thing : things) {
            total += thing.getWeight();
        }
        return total;
    }

    public void addThing(Thing thing) {
        if(totalKg() +  thing.getWeight() <= maxKg) {
            things.add(thing);
        } else {System.out.println("Suitcase is too full for this thing..");}

    }
    public String toString(){
        if(things.isEmpty()){
            return "empty (" + totalKg() + " kg)";
        }else{return things.size() + " things (" + totalKg() + " kg)";}
    }
    public String printThings(){
        String list = "";
        if(things.isEmpty()){return "nothing to print";}
        else{
            for(Thing thing : things){
                list += thing.getName() + " (" + thing.getWeight() + " kg) \n";
            } return list;
        }
    }
    public Thing heaviestThing() {
        if(!things.isEmpty()){
            Thing heaviestThing = things.get(0);
            for(Thing thing : things){
                if(thing.getWeight() > heaviestThing.getWeight()){
                    heaviestThing = thing;
                }
            }
            return heaviestThing;
        } else {return null;}
    }
}
