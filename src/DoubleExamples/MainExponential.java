package DoubleExamples;

public class MainExponential {
    public static void main(String[] args) {
        double x = 1.0;
        Exponential exponentialCalculator = new Exponential(x);
        System.out.println("The value of e^" + x + " is: " + exponentialCalculator.getResult());
    }
}
