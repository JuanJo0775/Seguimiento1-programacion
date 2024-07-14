package DoubleExamples;

public class Exponential {
    double x;
    double result;

    Exponential(double x) {
        this.x = x;
        this.result = calculateExponential(x);
    }

    double calculateExponential(double x) {
        return Math.exp(x); // e^x
    }

    double getResult() {
        return result;
    }
}

