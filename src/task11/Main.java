package task11;
/*
 Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Main {
    public static void main(String[] args) {
        String phrase = "Три кота";
        StringBuilder phraseChange = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {
            char current = phrase.charAt(i);
            phraseChange.append(current).append(current);
        }

        String letterTwice = phraseChange.toString();
        System.out.println(letterTwice);
    }
}
