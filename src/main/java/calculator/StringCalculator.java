package calculator;

import java.util.LinkedList;
import java.util.List;

public class StringCalculator {

    public static final int MAX_VALUE = 1000;
    private final NumberExtractor numberExtractor = new NumberExtractor();

    public int add(String input) throws NegativeNumberException {
        if (input == null || input.isEmpty())
            return 0;
        List<Integer> numbers = numberExtractor.extract(input);
        checkNegatives(numbers);
        numbers = filterBiggerThanLimit(numbers);
        return addNumbers(numbers);
    }

    private List<Integer> filterBiggerThanLimit(List<Integer> numbers) {
        List<Integer> filteredNumbers = new LinkedList<>();
        for (Integer number : numbers)
            if (number <= MAX_VALUE)
                filteredNumbers.add(number);
        return filteredNumbers;
    }

    private void checkNegatives(List<Integer> numbers) throws NegativeNumberException {
        List<Integer> negativeNumbers = new LinkedList<>();
        for (Integer number : numbers) {
            if (number < 0)
                negativeNumbers.add(number);
        }
        if (negativeNumbers.size() > 0)
            throw new NegativeNumberException(negativeNumbers.toString());
    }

    private int addNumbers(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers)
            sum += number;
        return sum;
    }
}
