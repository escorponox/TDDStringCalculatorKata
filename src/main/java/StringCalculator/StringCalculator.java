package StringCalculator;

public class StringCalculator {

    public int add(String s) {
        if (s.length() > 0)
            return Integer.valueOf(s);
        return 0;
    }
}
