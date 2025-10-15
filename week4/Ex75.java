package week4;

public class Ex75 {
    // read like: Ex75 is DecreasingCounter
    private int value;
    private int initialValue;
    public Ex75(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }
    public void printValue(){
        System.out.println("Value: " + this.value);
    }
    public void decrease(){
        //value remains positive
        if (this.value > 0){
            this.value--;
        }else {return;}
    }
    public void reset(){
        this.value = 0;
    }
    public void setInitial(){
       this.value = initialValue;
    }
}
class CounterApp {
    public static void main(String[] args) {
        // read like: Ex75 is DecreasingCounter
    Ex75 counter = new Ex75(15);
    counter.printValue();

    counter.decrease();
    counter.printValue();

    counter.decrease();
    counter.printValue();

    counter.decrease();
    counter.printValue();

    counter.reset();
    counter.printValue();

    counter.setInitial();
    counter.printValue();
    }
}