package task13;
/*
 Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фразу ");
        String inputPhrase = scanner.nextLine();

        String []  inputArray = inputPhrase.split(" ");
        int max = 0;

        String outputMaxWord = null;
        for (String word: inputArray) {
            if (word.length() > max){
                outputMaxWord = word;
                max = word.length();
            }
        }
        System.out.println(outputMaxWord);
    }
}
