package DoubleExamples;

public class TriangleArea {
    double base;
    double height;
    double area;

    TriangleArea(double base, double height) {
        this.base = base;
        this.height = height;
        this.area = calculateArea(base, height);
    }

    double calculateArea(double base, double height) {
        return (base * height) / 2; // Fórmula: Área = (base * altura) / 2
    }

    double getArea() {
        return area;
    }
}

