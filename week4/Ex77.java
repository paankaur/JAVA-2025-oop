package week4;

public class Ex77 {
    public class LyyraCard {
        private double balance;
        public LyyraCard(double balance) {
            this.balance = balance;
        };
        public String toString() {
            return  "The card has " + balance + " EUR";
        }
        public void payEconomical() {
            if (balance >= 2.5) {balance -= 2.5;}

        }

        public void payGourmet() {
            if (balance >= 4) {balance -= 4;}
        }
        public void loadMoney(double amount) {
            if (amount > 0) {balance += amount;}

        }
    }
    public static void main(String[] args) {
        Ex77 ex = new Ex77();
        Ex77.LyyraCard card = ex.new LyyraCard(10);
        System.out.println(card);

        Ex77.LyyraCard cardPekka = ex.new LyyraCard(20);
        Ex77.LyyraCard cardBrian = ex.new LyyraCard(30);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);



    }
}



