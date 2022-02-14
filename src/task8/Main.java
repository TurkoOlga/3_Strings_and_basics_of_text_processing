package task8;
/*
 Проверить, является ли заданное слово палиндромом.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");

        String word = scanner.nextLine();
        StringBuilder wordReverse = new StringBuilder(word);
        wordReverse.reverse();
        if (wordReverse.toString().equals(word)) {
            System.out.println("Слово является палиндромом");
        }
    }
}
