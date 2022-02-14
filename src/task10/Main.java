package task10;
/*
 Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Main {
    public static void main(String[] args) {
        String phrase = "а  ";
        int counter = 0;

        for (int i = 0; i < phrase.length() + counter; i++) {
            int indexFirst = phrase.indexOf("а");
            if (indexFirst >= 0) {
                phrase = phrase.substring(indexFirst + 1);
                counter++;
            }
        }
        System.out.println(counter);
    }
}
