package calculator;

import java.util.LinkedList;
import java.util.List;

public class NegativeChecker {

    public void check(List<Integer> numbers) throws NegativeNumberException {
        List<Integer> negativeNumbers = new LinkedList<>();
        for (Integer number : numbers) {
            if (number < 0)
                negativeNumbers.add(number);
        }
        if (negativeNumbers.size() > 0)
            throw new NegativeNumberException(negativeNumbers.toString());
    }
}