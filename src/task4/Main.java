package task4;

/*
В строке найти количество чисел
 */
public class Main {
    public static void main(String[] args) {
        String phrase = "5 слоновб 3 кота, 33 коровы, 100 попугаев 1";
        char[] wordString = phrase.toCharArray();
        int counter = 0;

        boolean isPreviousDigit = false;

        for (char c : wordString) {
            if (c >= '0' && c <= '9') {
                if (!isPreviousDigit) {
                    counter++;
                    isPreviousDigit = true;
                }
            } else {
                isPreviousDigit = false;
            }
        }
        System.out.println("Количество чисел: " + counter);
    }
}
