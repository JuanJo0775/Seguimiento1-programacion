package CharExamples;

public class Count {
    String input;
    char character;
    int count;

    Count(String input, char character) {
        this.input = input;
        this.character = character;
        this.count = countCharacter(input, character);
    }

    int countCharacter(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count; // Cuenta cuántas veces aparece el carácter
    }

    int getCount() {
        return count;
    }
}
