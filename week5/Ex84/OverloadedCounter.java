package week5.Ex84;

public class OverloadedCounter {
    private int value;
    private boolean check;
    private int startingValue;

    public OverloadedCounter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.value = startingValue;
        this.check = check;
    }
    public OverloadedCounter(int  startingValue) {
        this.startingValue = 0;
        this.value = startingValue;
        this.check = false;
    }
    public OverloadedCounter(boolean  check) {
        this.value = 0;
        this.check = check;
    }
    public OverloadedCounter() {
        this.value = 0;
        this.check = false;
    }

    public int value() {
        return this.value;
    }
    public void increase() {
            this.value++;
    }
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease() {
        if (this.check) {if (this.value > 0){this.value--;}} else {this.value--;}
    }
    public void decrease(int decreaseAmount) {
       if (decreaseAmount > 0) {
           if (this.check){
               this.value = (this.value > decreaseAmount) ? this.value - decreaseAmount : 0;
           } else {this.value -= decreaseAmount;}
       }
    }
    public boolean check() {
        return this.check;
    }
}
