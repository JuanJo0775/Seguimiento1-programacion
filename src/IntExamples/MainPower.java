package IntExamples;

public class MainPower {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        Power power = new Power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + power.getResult());
    }
}
