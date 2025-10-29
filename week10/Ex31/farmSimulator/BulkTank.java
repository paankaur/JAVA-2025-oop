package week10.Ex31.farmSimulator;

public class BulkTank {
    private double maxVol;
    private double volume;

    public BulkTank() {
        this.maxVol = 2000.0;
        this.volume = 0.0;
    }
    public BulkTank(double maxVol) {
        this.maxVol = maxVol;
        this.volume = 0.0;
    }
    public double getCapacity(){
        return this.maxVol;
    }
    public double getVolume(){
        return this.volume;
    }
    public double howMuchFreeSpace(){
        return this.maxVol - this.volume;
    }
    public void addToTank(double amount) {
        if (amount <= 0) {
            return;
        }
        double newVolume = this.volume + amount;
        this.volume = Math.min(newVolume, this.maxVol);
    }
    public double getFromTank(double amount) {
        if (amount <= 0) {
            return 0.0;
        }else if (amount > this.volume) {
            double newVolume = this.volume;
            this.volume = 0.0;
            return newVolume;
        }else{
            this.volume -= amount;
            return amount;
        }

    }
    @Override
    public String toString(){
        return this.volume+" / "+ this.maxVol;
    }
}
