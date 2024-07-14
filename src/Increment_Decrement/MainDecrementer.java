package Increment_Decrement;

public class MainDecrementer {
    public static void main(String[] args) {
        Decrementer decrementer = new Decrementer(10);
        decrementer.decrement();
        System.out.println("The decremented number is: " + decrementer.getNumber());
    }
}
