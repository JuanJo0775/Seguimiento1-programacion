package ByteExamples;

public class MainByteSum {
    public static void main(String[] args) {
        byte number1 = 12;
        byte number2 = 7;
        ByteSum byteSum = new ByteSum(number1, number2);
        System.out.println("The sum of the two numbers is:" + byteSum.getSum());
    }
}
