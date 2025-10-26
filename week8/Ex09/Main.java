package week8.Ex09;

import java.util.*;

//public class Main {
//    public static void main(String[] args) {
//        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
//        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
//        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");
//
//        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
//        finnish.add(reg1);
//        finnish.add(reg2);
//
//        RegistrationPlate newReg = new RegistrationPlate("FI", "ABC-123");
//        if (!finnish.contains(newReg)) {
//            finnish.add(newReg);
//        }
//        System.out.println("Finnish: " + finnish);
//        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list
//
//        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
//        owners.put(reg1, "Arto");
//        owners.put(reg3, "Jürgen");
//
//        System.out.println("owners:");
//        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
//        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
//        // if the hashCode hasn't been overwritten, the owners are not found
//
//
//    }
//}




public class Main {
    public static void main(String[] args) {

        // --- Test RegistrationPlate equality and HashMap behavior ---
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newReg = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newReg)) {
            finnish.add(newReg);
        }

        System.out.println("Finnish: " + finnish);
        // if equals() hasn't been overwritten, the same registration plate is repeated

        HashMap<RegistrationPlate, String> owners = new HashMap<>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("\nowners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        // if hashCode() hasn't been overwritten, the owners are not found


        // --- Test VehicleRegister methods ---
        System.out.println("\n--- Testing VehicleRegister ---");

        VehicleRegister register = new VehicleRegister();

        // Add some plates and owners
        System.out.println("\nAdding plates...");
        register.add(reg1, "Arto");
        register.add(reg2, "Matti");
        register.add(reg3, "Jürgen");

        // Try to add duplicate
        boolean added = register.add(new RegistrationPlate("FI", "ABC-123"), "Someone Else");
        System.out.println("Trying to add duplicate: " + added); // should print false

        // Print all registration plates
        System.out.println("\nAll registration plates:");
        register.printRegistrationPlates();

        // Print all owners
        System.out.println("\nAll owners:");
        register.printOwners();

        // Get owner by plate
        System.out.println("\nGetting owner of FI ABC-123:");
        System.out.println(register.get(new RegistrationPlate("FI", "ABC-123")));

        // Delete one plate
        System.out.println("\nDeleting plate FI UXE-465...");
        boolean deleted = register.delete(new RegistrationPlate("FI", "UXE-465"));
        System.out.println("Deleted: " + deleted);

        // Print again after deletion
        System.out.println("\nRegistration plates after deletion:");
        register.printRegistrationPlates();

        System.out.println("\nOwners after deletion:");
        register.printOwners();
    }
}
