package ByteExamples;

public class ByteMultiple {
    byte number;
    private boolean isMultipleOfThree;

    ByteMultiple(byte number) {
        this.number = number;
        this.isMultipleOfThree = number % 3 == 0;
    }

    boolean isMultipleOfThree() {
        return isMultipleOfThree;
    }
}
