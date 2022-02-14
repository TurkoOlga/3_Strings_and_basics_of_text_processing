package task9;
/*
 С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”
 */

public class Main {
    public static void main(String[] args) {
        String computerScience = "информатика";

        int indexOfT = computerScience.indexOf("т");
        int indexOfO = computerScience.indexOf("о");
        int indexOfP = computerScience.indexOf("р");

        String result = computerScience.charAt(indexOfT)
                + computerScience.substring(indexOfO, indexOfO + 1)
                + computerScience.charAt(indexOfP)
                + computerScience.charAt(indexOfT);

        System.out.println(result);
    }
}
