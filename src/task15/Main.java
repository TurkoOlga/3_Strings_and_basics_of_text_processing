package task15;
/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.

 */

public class Main {
    public static void main(String[] args) {
        String input = "Три кота. Три хвоста? Три кота! Три кота.";
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.' || input.charAt(i) == '!' || input.charAt(i) == '?'){
                counter++;
            }
        }
        System.out.println("Количество предложений " + counter);
    }
}
