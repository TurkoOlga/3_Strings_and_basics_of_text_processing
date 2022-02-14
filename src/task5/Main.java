package task5;
/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */

public class Main {
    public static void main(String[] args) {
        String phraseAsString = "  5    слонов      3      кота   ";
        char[] phrase = phraseAsString.toCharArray();
        StringBuilder output = new StringBuilder();

        int indexFirst = getIndexFirst(phrase);
        int indexLast = getIndexLast(phrase);

        boolean isPreviousSpace = false;
        for (int current = indexFirst; current <= phrase.length - indexLast - 1; current++) {
            if (phrase[current] == ' ') {
                if (!isPreviousSpace) {
                    isPreviousSpace = true;
                    output.append(phrase[current]);
                }
            } else {
                output.append(phrase[current]);
                isPreviousSpace = false;
            }
        }
        System.out.println(output);
    }

    private static int getIndexLast(char[] wordString) {
        int indexLast = 0;
        for (int current = wordString.length - 1; current > 0; current--) {
            if (wordString[current] != ' ') {
                break;
            }
            indexLast++;
        }
        return indexLast;
    }

    private static int getIndexFirst(char[] wordString) {
        int indexFirst = 0;
        for (char current : wordString) {
            if (current != ' ') {
                break;
            }
            indexFirst++;
        }
        return indexFirst;
    }
}

