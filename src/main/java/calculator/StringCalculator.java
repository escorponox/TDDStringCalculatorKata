package calculator;

import java.util.List;

public class StringCalculator {

    public static final int MAX_VALUE = 1000;

    private final NumberExtractor numberExtractor;
    private final BiggerThanLimitFilter biggerThanLimitFilter;
    private final NegativeChecker negativeChecker;

    public StringCalculator() {
        numberExtractor = new NumberExtractor();
        biggerThanLimitFilter = new BiggerThanLimitFilter(MAX_VALUE);
        negativeChecker = new NegativeChecker();
    }

    public int add(String input) throws NegativeNumberException {
        if (input == null || input.isEmpty())
            return 0;
        List<Integer> numbers = numberExtractor.extract(input);
        negativeChecker.check(numbers);
        numbers = biggerThanLimitFilter.filter(numbers);
        return addNumbers(numbers);
    }

    private int addNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers)
            sum += number;
        return sum;
    }
}
