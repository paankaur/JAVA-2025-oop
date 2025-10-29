package week10.Ex31.farmSimulator;

import java.util.Collection;

public class Barn {

    private BulkTank tank;
    private MilkingRobot milkingRobot = null;

    public Barn(BulkTank tank) {
        this.tank = tank;

    }

    public BulkTank getBulkTank() {
        if (milkingRobot != null) {
            return milkingRobot.getBulkTank();
        }
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(this.tank);
    }

    public void setMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
    }



    public void takeCareOf(Cow cow) {
        checkForMilkingRobot();
        milkingRobot.milk(cow);
    }

    public void takeCareOf(@org.jetbrains.annotations.NotNull Collection<Cow> cows) {
        checkForMilkingRobot();
        for (Cow cow : cows) {
            milkingRobot.milk(cow);
        }

    }

    @Override
    public String toString() {
        this.tank = milkingRobot.getBulkTank();
        return tank.toString();
    }

    private void checkForMilkingRobot() {
        if (milkingRobot == null) {
            throw new IllegalStateException("Milking robot not installed.");
        }
    }



}