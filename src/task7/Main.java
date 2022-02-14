package task7;
/*
. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Main {
    public static void main(String[] args) {
        String phrase = "a fj a kl a a a a a a a a a a";
        System.out.println(phrase.replaceAll("a", "ab"));
    }
}
