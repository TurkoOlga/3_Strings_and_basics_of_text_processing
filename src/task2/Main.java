package task2;
/*
Замените в строке все вхождения 'word' на 'letter'.
 */

public class Main {
    public static void main(String[] args) {
        String word = "The word is unknown, one word word";

        char[] wordChar = word.toCharArray();
        StringBuilder outPut = new StringBuilder();
        String rename = "letter";

        for (int j = 0; j < wordChar.length; j++) {
            if (wordChar[j] == 'w' && wordChar[j + 1] == 'o' && wordChar[j + 2] == 'r' && wordChar[j + 3] == 'd') {
                outPut.append(rename);
                j += 3;
            } else {
                outPut.append(wordChar[j]);
            }
        }

        System.out.println(outPut);
    }
}
