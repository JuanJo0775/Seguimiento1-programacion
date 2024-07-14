package ByteExamples;

public class MainByteMultiple {
    public static void main(String[] args) {
        byte number = 9;
        ByteMultiple byteMultiple = new ByteMultiple(number);
        System.out.println("Is the number a multiple of 3?" + byteMultiple.isMultipleOfThree());
    }
}
