package FloatExamples;

public class FloatAverage {
    private float num1;
    private float num2;
    private float num3;
    private float average;

    public FloatAverage(float num1, float num2, float num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.average = calculateAverage(num1, num2, num3);
    }

    private float calculateAverage(float n1, float n2, float n3) {
        return (n1 + n2 + n3) / 3; // Promedio = (n1 + n2 + n3) / 3
    }

    public float getAverage() {
        return average;
    }
}
