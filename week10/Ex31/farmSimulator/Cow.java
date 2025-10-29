package week10.Ex31.farmSimulator;

import java.util.Random;

public class Cow implements Alive, Milkable {
    private Random random = new Random();
    private String name;
    private double amount;
    private double capacity = 15 + random.nextInt(26);
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this.name = NAMES[random.nextInt(NAMES.length)];
    }
    public Cow(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public double getCapacity() {
        return this.capacity;
    }
    public double getAmount() {
        return this.amount;
    }
    @Override
    public String toString() {
        return name + " " + Math.ceil(amount) + "/" + Math.ceil(capacity);
    }

    @Override
    public double milk() {
        double toBeReturned = amount;
        amount = 0;
        return toBeReturned;
    }

    @Override
    public void liveHour() {
        double randomValue = 0.7 + (2.0 - 0.7) * random.nextDouble();
        if (amount + randomValue >= capacity) {
            amount = capacity;
        } else {
            amount += randomValue;
        }
    }
}
