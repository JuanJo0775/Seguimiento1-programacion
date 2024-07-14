package BooleanExamples;

import java.util.Scanner;

public class MainEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        EvenNumber evenCheck = new EvenNumber(number);
        System.out.println("Is the number even? " + evenCheck.getIsEven());

        scanner.close();
    }
}

