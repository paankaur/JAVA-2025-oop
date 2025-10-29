package week10.Ex31.farmSimulator;



public class MilkingRobot extends BulkTank {

    private BulkTank tank;

    public MilkingRobot() {
        this.tank = null;
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    public void milk(Milkable milkable) {
        if (tank == null) {
            throw new IllegalStateException("The milking robot has not been installed");
        } else {
            double toBeAdded = milkable.milk();
            tank.addToTank(toBeAdded);
        }

    }





}