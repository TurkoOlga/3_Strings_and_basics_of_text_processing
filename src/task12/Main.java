package task12;
/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу ");
        String inputPhrase = scanner.nextLine();
        String phraseWithoutSpace = inputPhrase.replaceAll(" ", "");

        StringBuilder outputPhrase = new StringBuilder();

        for (int current = 0; current < phraseWithoutSpace.length(); ) {
            String currentChar = String.valueOf(phraseWithoutSpace.charAt(current));
            String subPhrase = phraseWithoutSpace.substring(current + 1);
            phraseWithoutSpace = subPhrase.replaceAll(currentChar, "");
            outputPhrase.append(currentChar);
        }
        String output = outputPhrase.toString();
        System.out.println(output);
    }
}
