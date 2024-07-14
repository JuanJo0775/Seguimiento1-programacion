package Increment_Decrement;

public class Incrementer {
    int number;

    Incrementer(int number) {
        this.number = number;
    }

    void increment() {
        number++; // Incrementa el número en 1
    }

    int getNumber() {
        return number;
    }
}
