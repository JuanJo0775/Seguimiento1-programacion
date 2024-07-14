package FloatExamples;

public class Temperature {
    float celsius;
    float fahrenheit;

   Temperature(float celsius) {
        this.celsius = celsius;
        this.fahrenheit = convertToFahrenheit(celsius);
    }

    float convertToFahrenheit(float celsius) {
        return (celsius * 9/5) + 32; // Fórmula: F = C * (9/5) + 32
    }

    float getFahrenheit() {
        return fahrenheit;
    }
}
