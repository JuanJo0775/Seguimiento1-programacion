package Increment_Decrement;

public class MainIncrementer {
    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer(5);
        incrementer.increment();
        System.out.println("The incremented number is: " + incrementer.getNumber());
    }
}
