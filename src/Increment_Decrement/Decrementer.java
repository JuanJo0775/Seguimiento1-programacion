package Increment_Decrement;

public class Decrementer {
    int number;

    Decrementer(int number) {
        this.number = number;
    }

    void decrement() {
        number--; // Decrementa el número en 1
    }

    int getNumber() {
        return number;
    }
}
