package week7.Ex04;

import java.util.ArrayList;

public class Container {
    private int maxKg;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxKg) {
        this.maxKg = maxKg;
        this.suitcases = new ArrayList<>();
    }
    public int totalKg() {
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalKg();
        }
        return total;
    }
    public void addSuitcase(Suitcase suitcase){
        if(maxKg >= suitcase.totalKg() + totalKg() ){this.suitcases.add(suitcase);}
    }
    @Override
    public String toString() {
       return suitcases.size() + " suitcases (" + totalKg() + " kg)";
    }
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            System.out.println(suitcase.printThings());
        }
    }
}
