package FloatExamples;

public class MainTemperature {
    public static void main(String[] args) {
        float celsius = 25.0f;
        Temperature converter = new Temperature(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + converter.getFahrenheit() + " degrees Fahrenheit.");
    }
}
