package StringCalculator;

public class StringCalculator {

    private final NumberExtractor numberExtractor = new NumberExtractor();

    public int add(String input) {
        if (input.isEmpty())
            return 0;
        String[] numbers = numberExtractor.extract(input);
        return addNumbers(numbers);
    }

    private int addNumbers(String[] numbers) {
        int sum = 0;
        for (String number : numbers)
            sum += Integer.valueOf(number);
        return sum;
    }
}
