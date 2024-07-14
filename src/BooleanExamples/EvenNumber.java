package BooleanExamples;

public class EvenNumber {
    private boolean isEven;

    public EvenNumber(int number) {
    }

    public void EvenCheck(int number) {
        this.isEven = number % 2 == 0;
    }

    public boolean getIsEven() {
        return isEven;
    }
}
