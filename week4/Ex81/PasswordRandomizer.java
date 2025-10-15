package week4.Ex81;

import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private String password;
    private String letters;
    private Random random;


    public PasswordRandomizer(int length) {
        // Format the variable here
        this.length = length;
        this.letters = "mzenoaduxpqbcghrsvwtyfijkl";

        this.random = new Random();
    }

    public String createPassword() {
        // Write the code here which returns the new password
        this.password = "";
        for (int i = 0; i < this.length; i++) {
            this.password += this.letters.charAt(this.random.nextInt(26));
        }
        return password;


    }
}
