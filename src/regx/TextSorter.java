package regx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSorter {
    private static final String PARAGRAPH_REGEX = "\\r?\\n";
    private static final String SENTENCE_REGEX = "[^?!.][?!.]";
    private static final String WORD_REGEX = "[ !\"#$%&'()*+,-.:;<=>?@\\[\\]^_`{|}~]+";

    public String getSortedParagraphsBySentencesCount(String sourceText) {
        String[] paragraphs = sourceText.split(PARAGRAPH_REGEX);

        Map<String, Integer> paragraphToSentencesCount = new HashMap<>();
        for (String paragraph : paragraphs) {
            Integer sentences = getParagraphSentencesCount(paragraph);
            paragraphToSentencesCount.put(paragraph, sentences);
        }

        Comparator<String> sentenceComparator = (o1, o2) ->
                paragraphToSentencesCount.get(o1).compareTo(paragraphToSentencesCount.get(o2));
        Arrays.sort(paragraphs, sentenceComparator);

        return getSortedParagraphsAsText(paragraphs);
    }

    public String getSortedSentenceByWordsLength(String sourceText) {
        StringBuilder sortedParagraphs = new StringBuilder();
        String[] paragraphs = sourceText.split(PARAGRAPH_REGEX);

        for (int i = 0; i < paragraphs.length; i++) {
            String paragraph = paragraphs[i];
            StringBuilder sortedSentences = getSortedSentences(paragraph);
            sortedParagraphs.append(sortedSentences);

            if (i != paragraphs.length - 1) {
                sortedParagraphs.append(System.lineSeparator());
            }
        }
        return sortedParagraphs.toString();
    }

    private StringBuilder getSortedSentences(String paragraph) {
        StringBuilder sortedSentences = new StringBuilder();
        String[] sentences = paragraph.split(SENTENCE_REGEX);

        for (String sentence : sentences) {
            StringBuilder sortedWords = new StringBuilder();
            String[] words = sentence.split(WORD_REGEX);
            Arrays.sort(words, (w1, w2) -> Integer.compare(w1.length(), w2.length()));

            for (String word : words) {
                sortedWords.append(word).append(" ");
            }
            sortedSentences.append(sortedWords);
        }
        return sortedSentences;
    }

    private Integer getParagraphSentencesCount(String paragraph) {
        Pattern pattern = Pattern.compile(SENTENCE_REGEX);
        Matcher matcher = pattern.matcher(paragraph);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    private String getSortedParagraphsAsText(String[] paragraphs) {
        StringBuilder sortedParagraphs = new StringBuilder();

        for (int i = 0; i < paragraphs.length; i++) {
            String paragraph = paragraphs[i];
            sortedParagraphs.append(paragraph);
            if (i != paragraphs.length - 1) {
                sortedParagraphs.append(System.lineSeparator());
            }
        }
        return sortedParagraphs.toString();
    }

}
