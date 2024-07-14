package CharExamples;

public class MainVowel {
    public static void main(String[] args) {
        char character = 'e';
        Vowel vowelCheck = new Vowel(character);
        System.out.println(character + " is a vowel: " + vowelCheck.isVowel());
    }
}
