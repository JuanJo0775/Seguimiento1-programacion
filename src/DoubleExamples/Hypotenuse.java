package DoubleExamples;

public class Hypotenuse {
    double sideA;
    double sideB;
    double hypotenuse;

    Hypotenuse(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotenuse = calculateHypotenuse(sideA, sideB);
    }

    double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b); // Fórmula: c = √(a² + b²)
    }

    double getHypotenuse() {
        return hypotenuse;
    }
}

