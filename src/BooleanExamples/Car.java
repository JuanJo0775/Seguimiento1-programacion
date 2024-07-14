package BooleanExamples;

public class Car {
    boolean carStarted = true;

    void carStatus(boolean status) {
        this.carStarted = status;
    }

    boolean getStatus() {
        return carStarted;
    }
}
