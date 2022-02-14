package task14;
/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу ");
        String inputPhrase = scanner.nextLine();

        String inputPhraseInLowerCase = inputPhrase.toLowerCase();

        int numberOfUpperLetters = 0;
        int numberOfLowerLetters = 0;
        for (int i = 0; i < inputPhrase.length(); i++) {
            char input = inputPhrase.charAt(i);
            char inputInLowerCase = inputPhraseInLowerCase.charAt(i);
            boolean equal = (input == inputInLowerCase)
                    && (('a' <= input && inputInLowerCase <= 'z') || ('A' <= input && inputInLowerCase <= 'Z'));
            if (equal) {
                numberOfLowerLetters++;
            } else {
                numberOfUpperLetters++;
            }
        }
        System.out.println("Количество маленьких букв " + numberOfLowerLetters);
        System.out.println("Количество больших букв " + numberOfUpperLetters);
    }
}
