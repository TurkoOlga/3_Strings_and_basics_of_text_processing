package regx;
/*
Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.

 */

import java.io.IOException;

public class Text {

    public static void main(String[] args) throws IOException {
        TextReader textReader = new TextReader();
        String sourceText = textReader.readTextFromFile("src/stringsandtextprocessing/regx/Text.txt");

        TextSorter textSorter = new TextSorter();
        String sortedParagraph = textSorter.getSortedParagraphsBySentencesCount(sourceText);
        System.out.println("Sorted by paragraphs:");
        System.out.println(sortedParagraph + System.lineSeparator());

        String sortedSentences = textSorter.getSortedSentenceByWordsLength(sourceText);
        System.out.println("Sorted by words length:");
        System.out.println(sortedSentences);
    }

}


