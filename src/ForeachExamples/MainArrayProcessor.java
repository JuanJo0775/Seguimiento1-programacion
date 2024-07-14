package ForeachExamples;

public class MainArrayProcessor {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        ArrayProcessor processor = new ArrayProcessor(fruits);
        processor.printFruits();
    }
}
