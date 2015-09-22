package calculator;

import StringCalculator.StringCalculator;
import junit.framework.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void givenEmptyStringItReturnsZero() throws Exception {

        StringCalculator stringCalculator = new StringCalculator();

        Assert.assertEquals(0,stringCalculator.add(""));
    }

}
