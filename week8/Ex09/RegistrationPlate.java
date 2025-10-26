package week8.Ex09;

import java.util.ArrayList;
import java.util.Objects;

public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;
    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }
    public String getRegCode() {
        return regCode;
    }
    public String getCountry() {
        return country;
    }


    @Override
    public String toString(){
        return country+ " "+regCode;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationPlate that = (RegistrationPlate) o;
        return Objects.equals(regCode, that.regCode) && Objects.equals(country, that.country);
    }
    public int hashCode(){
        return Objects.hash(regCode, country);
    }

}

