package StringCalculator;

public class StringCalculator {

    public int add(String input) {
        if (input.isEmpty())
            return 0;
        String[] numbers = extractNumbers(input);
        return addNumbers(numbers);
    }

    private String[] extractNumbers(String input) {
        String[] numbers;
        if (hasCustomDelimiter(input))
            numbers = extractCustomSepparatedNumbers(input);
        else
            numbers = extractStandardSepparatedNumbers(input);
        return numbers;
    }

    private int addNumbers(String[] numbers) {
        int sum = 0;
        for (String number : numbers)
            sum += Integer.valueOf(number);
        return sum;
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
