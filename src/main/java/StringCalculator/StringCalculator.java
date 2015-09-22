package StringCalculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.length() > 0) {
            String[] splitted = numbers.split(",");
            int sum = 0;
            for (int i = 0; i < splitted.length; i++)
                sum += Integer.valueOf(splitted[i]);
            return sum;
        }
        return 0;
    }
}
