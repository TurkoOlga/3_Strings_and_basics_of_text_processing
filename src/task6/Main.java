package task6;

/*
Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Main {
    public static void main(String[] args) {
        String phrase = "  5   слонов               3  кота       ";
        char[] wordString = phrase.toCharArray();

        int countFirst = 0;
        int max = 0;
        for (int current = 0; current < wordString.length - 1; current++) {
            if (wordString[current] == ' ') {
                countFirst++;
                if (!(wordString[current + 1] == ' ')) {
                    if (countFirst > max){
                        max = countFirst;
                    }
                    countFirst = 0;
                }
            }
        }
        System.out.println(max);
    }
}
