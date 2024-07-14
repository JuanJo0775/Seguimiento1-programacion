package IntExamples;

public class MainAverage {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 8};
        Average intAverage = new Average(numbers);
        System.out.println("The average of the given numbers is: " + intAverage.getAverage());
    }
}
