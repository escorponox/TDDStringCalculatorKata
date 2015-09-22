package calculator;

import StringCalculator.StringCalculator;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void givenEmptyStringItReturnsZero() throws Exception {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void givenOneNumberItReturnsTheNumber() throws Exception {
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(2, stringCalculator.add("2"));
        assertEquals(3, stringCalculator.add("3"));
    }

    @Test
    public void givenOneNumberComaOneNumberItReturnsTheSum() throws Exception {
        assertEquals(2, stringCalculator.add("1,1"));
        assertEquals(12, stringCalculator.add("10,2"));
    }
}
