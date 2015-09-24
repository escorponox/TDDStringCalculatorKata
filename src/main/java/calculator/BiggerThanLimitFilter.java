package calculator;

import java.util.LinkedList;
import java.util.List;

public class BiggerThanLimitFilter {

    private int limit;

    public BiggerThanLimitFilter(int limit) {
        this.limit = limit;
    }

    public List<Integer> filter(List<Integer> numbers) {
        List<Integer> filteredNumbers = new LinkedList<>();
        for (Integer number : numbers)
            if (number <= limit)
                filteredNumbers.add(number);
        return filteredNumbers;
    }
}