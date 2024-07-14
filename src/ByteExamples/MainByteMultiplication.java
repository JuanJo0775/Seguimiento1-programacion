package ByteExamples;

public class MainByteMultiplication {
    public static void main(String[] args) {
        byte number1 = 4;
        byte number2 = 6;
        ByteMultiplication byteMultiplication = new ByteMultiplication(number1, number2);
        System.out.println("The product of the two bytes is: " + byteMultiplication.getProduct());
    }
}
