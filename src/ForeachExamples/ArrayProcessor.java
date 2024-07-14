package ForeachExamples;

public class ArrayProcessor {
    String[] fruits;

    ArrayProcessor(String[] fruits) {
        this.fruits = fruits;
    }

    void printFruits() {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
