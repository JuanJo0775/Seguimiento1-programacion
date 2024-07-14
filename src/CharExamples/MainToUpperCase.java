package CharExamples;

public class MainToUpperCase {
    public static void main(String[] args) {
        char character = 'g';
        ToUpperCase upperCaseConverter = new ToUpperCase(character);
        System.out.println("The uppercase of " + character + " is: " + upperCaseConverter.getUpperCase());
    }
}
