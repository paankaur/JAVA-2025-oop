package week5.Ex86;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens

        if(cashGiven >= 2.50) {
            this.economicalSold++;
            this.cashInRegister += 2.50;
            return cashGiven - 2.50;
        } return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
        if(cashGiven >= 4.00) {
            this.gourmetSold++;
            this.cashInRegister += 4.00;
            return cashGiven - 4.00;
        } return cashGiven;
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= 2.50) {
            this.economicalSold++;
        //    this.cashInRegister += 2.50;
            card.pay(2.50);
            return true;
        }return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= 4.00) {
            this.gourmetSold++;
        //    this.cashInRegister += 4.00;
            card.pay(4.00);
            return true;
        }return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
//        To complete the assignment, extend the cash register with a method that can be used to load CASH to Lyyra Cards.
//        When a certain amount is loaded to the card, the amount stored in the register increases correspondingly.
//                Remember that the amount to be loaded needs to be positive!
        if (sum > 0) {
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }
}
