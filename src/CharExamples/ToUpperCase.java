package CharExamples;

public class ToUpperCase {
    char character;
    char upperCase;

    ToUpperCase(char character) {
        this.character = character;
        this.upperCase = convertToUpperCase(character);
    }

    char convertToUpperCase(char c) {
        return Character.toUpperCase(c); // Convierte a mayúscula
    }

    char getUpperCase() {
        return upperCase;
    }
}
