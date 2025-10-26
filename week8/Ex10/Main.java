package week8.Ex10;

public class Main {
    public static void main(String[] args) {

        // Test 1: CivilService
        System.out.println("=== CivilService Test ===");
        NationalService civil = new CivilService();
        System.out.println("Days left (start): " + civil.getDaysLeft());

        for (int i = 0; i < 5; i++) {
            civil.work();
        }

        System.out.println("Days left (after 5 days of work): " + civil.getDaysLeft());
        System.out.println();

        // Test 2: MilitaryService with custom number of days
        System.out.println("=== MilitaryService Test ===");
        NationalService military = new MilitaryService(12);
        System.out.println("Days left (start): " + military.getDaysLeft());

        for (int i = 0; i < 30; i++) {
            military.work();
        }

        System.out.println("Days left (after 30 days of work): " + military.getDaysLeft());

        // Try working until it reaches zero
        while (military.getDaysLeft() > 0) {
            military.work();
        }

        System.out.println("Days left (after finishing service): " + military.getDaysLeft());
    }
}
