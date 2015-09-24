package calculator;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractor {

    private static final String ONE_OR_MORE_DIGITS = "-?\\d+";
    private static final Pattern NUMBERS_PATTERN = Pattern.compile(ONE_OR_MORE_DIGITS);

    public List<Integer> extract(String input) {
        List<Integer> numbers = new LinkedList<>();
        if (input != null && !input.isEmpty()) {
            numbers = extractNumbers(input);
        }
        return numbers;
    }

    private List<Integer> extractNumbers(String input) {
        Matcher matcher = NUMBERS_PATTERN.matcher(input);
        List<Integer> extractedNumbers = new LinkedList<>();
        while (matcher.find()) {
            extractedNumbers.add(Integer.parseInt(matcher.group()));
        }
        return extractedNumbers;
    }
}