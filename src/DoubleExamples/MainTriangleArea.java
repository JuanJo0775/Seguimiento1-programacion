package DoubleExamples;

public class MainTriangleArea {
    public static void main(String[] args) {
        double base = 5.0;
        double height = 10.0;
        TriangleArea triangleArea = new TriangleArea(base, height);
        System.out.println("The area of the triangle is: " + triangleArea.getArea());
    }
}
