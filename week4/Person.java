package week4;

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
    }

    public void printPerson() {
        System.out.println("Person " + this.name + " is " + this.age + " years old.");
    }

}
