package CharExamples;

public class Vowel {
    char character;
    boolean isVowel;

    Vowel(char character) {
        this.character = character;
        this.isVowel = checkVowel(character);
    }

    boolean checkVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1; // Verifica si es una vocal
    }

    boolean isVowel() {
        return isVowel;
    }
}
