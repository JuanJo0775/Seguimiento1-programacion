package ByteExamples;

public class ByteSum {
    byte number1;
    byte number2;
    int sum;

    ByteSum(byte number1, byte number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.sum = number1 + number2;
    }

    int getSum() {
        return sum;
    }
}
