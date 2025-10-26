package week8.Ex09;

import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    public VehicleRegister() {
        this.owners = new HashMap<>();
    }
    public boolean add(RegistrationPlate regPlate, String owner) {
        if (owners.get(regPlate) == null) {
            owners.put(regPlate, owner);
            return true;
        }
        return false;
    }
    public String get(RegistrationPlate plate){
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }
    public  boolean delete(RegistrationPlate plate) {
        if (owners.get(plate) != null) {
            owners.remove(plate);
            return true;
        }
        return false;
    }
    public void printRegistrationPlates() {
        for (RegistrationPlate regPlate : owners.keySet()) {
            System.out.println(regPlate);
        }
    }
    public void printOwners() {
        for (String owner : new HashSet<>(owners.values())) {
            System.out.println(owner);
        }
    }
}
