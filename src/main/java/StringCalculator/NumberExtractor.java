package StringCalculator;

public class NumberExtractor {

    public String[] extract(String input) {
        String[] numbers;
        if (hasCustomDelimiter(input))
            numbers = extractCustomSepparatedNumbers(input);
        else
            numbers = extractStandardSepparatedNumbers(input);
        return numbers;
    }

    private String[] extractStandardSepparatedNumbers(String input) {
        return input.split(",|\\n");
    }

    private String[] extractCustomSepparatedNumbers(String input) {
        String delimiter = input.substring(2, 3);
        return input.substring(4).split(delimiter);
    }

    private boolean hasCustomDelimiter(String input) {
        return input.matches("^//\\W\\n.*");
    }
}