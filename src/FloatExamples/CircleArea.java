package FloatExamples;

public class CircleArea {
    float radius;
    float area;

    CircleArea(float radius) {
        this.radius = radius;
        this.area = calculateArea(radius);
    }

    float calculateArea(float r) {
        return (float) (Math.PI * r * r); // Area = π * r²
    }

    float getArea() {
        return area;
    }
}
