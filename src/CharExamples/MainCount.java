package CharExamples;

public class MainCount {
    public static void main(String[] args) {
        String input = "hello world";
        char character = 'o';
        Count charCounter = new Count(input, character);
        System.out.println("The character '" + character + "' appears " + charCounter.getCount() + " times in \"" + input + "\".");
    }
}
