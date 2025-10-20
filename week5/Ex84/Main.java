package week5.Ex84;

public class Main {
    public static void main(String[] args) {
        OverloadedCounter counter1 = new OverloadedCounter();
        System.out.println("counter1 testing starts here");
        System.out.println(counter1.value());
        counter1.increase();
        System.out.println(counter1.value());
        counter1.increase();
        System.out.println(counter1.value());
        counter1.decrease();
        System.out.println(counter1.value());
        counter1.decrease();
        System.out.println(counter1.value());
        counter1.decrease();
        System.out.println(counter1.value());
        counter1.decrease();
        System.out.println(counter1.value());

        counter1.decrease(100);
        System.out.println(counter1.value());
        counter1.increase(110);
        System.out.println(counter1.value());

        System.out.println("counter2 testing starts here");
        OverloadedCounter counter2 = new OverloadedCounter(5, true);
        System.out.println(counter2.value());
        counter2.increase();
        System.out.println(counter2.value());
        counter2.increase();
        System.out.println(counter2.value());
        counter2.decrease();
        System.out.println(counter2.value());
        counter2.decrease();
        System.out.println(counter2.value());
        counter2.decrease();
        System.out.println(counter2.value());
        counter2.decrease();
        System.out.println(counter2.value());

        counter2.decrease(100);
        System.out.println(counter2.value());
        counter2.increase(110);
        System.out.println(counter2.value());
    }


}
