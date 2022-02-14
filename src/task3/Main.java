package task3;
/*
В строке найти количество цифр
 */

public class Main {
    public static void main(String[] args) {
        String phrase = "5 слоновб 3 кота, 33 коровы, 100 попугаев";
        char[] wordChar = phrase.toCharArray();
        int counter = 0;

        for (char c : wordChar) {
            if (c >= '0' && c <= '9') {
                counter++;
            }
        }
        System.out.println("Количество цифр в строке: " + counter);
    }
}
