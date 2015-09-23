package calculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    private final NumberExtractor numberExtractor = new NumberExtractor();

    public int add(String input) throws NegativeNumberException {
        if (input.isEmpty())
            return 0;
        String[] numbers = numberExtractor.extract(input);
        checkNegatives(numbers);
        return addNumbers(numbers);
    }

    private void checkNegatives(String[] numbers) throws NegativeNumberException {
        List<Integer> negativeNumbers = new ArrayList<Integer>();
        for (String numberString : numbers) {
            Integer number = Integer.valueOf(numberString);
            if (number < 0)
                negativeNumbers.add(number);
        }
        if (negativeNumbers.size() > 0)
            throw new NegativeNumberException(negativeNumbers.toString());
    }

    private int addNumbers(String[] numbers) {
        int sum = 0, number;
        for (String numberString : numbers) {
            number = Integer.valueOf(numberString);
            if (number <= 1000)
                sum += number;
        }
        return sum;
    }
}
