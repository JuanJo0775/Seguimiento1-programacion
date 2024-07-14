package FloatExamples;

public class MainCircleArea {
    public static void main(String[] args) {
        float radius = 3.5f;
        CircleArea circleArea = new CircleArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + circleArea.getArea());
    }
}
