package ua.lviv.iot.algo.part1.lab5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindWordsTest {
    @Test
    public void testFindWordsWithLength() {
        String text = "It contains unique words of length 5.";
        FindWords findWords = new FindWords(text, 5);
        Set<String> expectedSomeWords = new HashSet<>(List.of("words"));

        Set<String> actualSomeWords = findWords.findWordsWithLength();

        assertEquals(expectedSomeWords, actualSomeWords);
    }

    @Test
    public void testFindUniqueWordsOfLength_withNoMatches() {
        String text = "This sentence does not contain any unique words of length 10.";
        FindWords findWords = new FindWords(text, 10);
        Set<String> expectedSomeWords = new HashSet<>();

        Set<String> actualSomeWords = findWords.findWordsWithLength();

        assertEquals(expectedSomeWords, actualSomeWords);
    }

    @Test
    public void testFindUniqueWordsOfLength_withQuestionMarks() {
        String text = "Does it contain unique words of length 5?";
        FindWords findWords = new FindWords(text, 5);
        Set<String> expectedSomeWords = new HashSet<>(List.of("words"));

        Set<String> actualSomeWords = findWords.findWordsWithLength();

        assertEquals(expectedSomeWords, actualSomeWords);
    }
}
