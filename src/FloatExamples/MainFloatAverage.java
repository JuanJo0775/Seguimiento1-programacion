package FloatExamples;

public class MainFloatAverage {
    public static void main(String[] args) {
        float num1 = 5.5f;
        float num2 = 7.0f;
        float num3 = 9.3f;
        FloatAverage averageCalculator = new FloatAverage(num1, num2, num3);
        System.out.println("The average of the numbers is: " + averageCalculator.getAverage());
    }
}
