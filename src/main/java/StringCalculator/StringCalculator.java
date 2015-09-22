package StringCalculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.length() > 0) {
            String[] splitted = numbers.split(",|\\n");
            int sum = 0;
            for (String number : splitted)
                sum += Integer.valueOf(number);
            return sum;
        }
        return 0;
    }
}
