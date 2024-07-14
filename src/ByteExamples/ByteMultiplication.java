package ByteExamples;

public class ByteMultiplication {
    byte number1;
    byte number2;
    int product;

    ByteMultiplication(byte number1, byte number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.product = number1 * number2;
    }

    int getProduct() {
        return product;
    }
}
