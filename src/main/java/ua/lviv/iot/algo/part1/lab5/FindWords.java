package ua.lviv.iot.algo.part1.lab5;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindWords {
    private final String text;
    private final int length;
    public FindWords(String text, int length) {
        this.text = text;
        this.length = length;
    }
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Need: java Main <text> <length>");
            System.exit(1);
        }
        String text = args[0];
        int length = Integer.parseInt(args[1]);
        FindWords findWords = new FindWords(text, length);
        HashSet<String> result = findWords.findWordsWithLength();
        System.out.println(result);
    }
    public HashSet<String> findWordsWithLength() {
        String regex = "\\b\\w{" + length + "}\\b";
        Pattern pattern = Pattern.compile(regex);
        HashSet<String> someWords = new HashSet<>();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            someWords.add(matcher.group());
        }
        return someWords;
    }
}