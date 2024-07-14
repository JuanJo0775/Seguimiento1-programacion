package DoubleExamples;

public class MainHypotenuse {
    public static void main(String[] args) {
        double sideA = 3.0;
        double sideB = 4.0;
        Hypotenuse triangle = new Hypotenuse(sideA, sideB);
        System.out.println("The hypotenuse of the triangle is: " + triangle.getHypotenuse());
    }
}
