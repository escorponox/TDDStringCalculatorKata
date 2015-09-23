package calculator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

    @Test
    public void givenAnyCommaSepparatedNumbersItReturnsTheSum() throws Exception {
        assertEquals(15, stringCalculator.add("10,2,3"));
    }
    
    @Test
    public void handleNewLines() throws Exception {
        assertEquals(6, stringCalculator.add("1\n2,3"));
        assertEquals(6, stringCalculator.add("1\n2\n3"));
        assertEquals(6, stringCalculator.add("1,2\n3"));
    }

    @Test
    public void customDelimiter() throws Exception {
        assertEquals(6, stringCalculator.add("//;\n1;2;3"));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void negativeNumbersThrowNegativeNumberException() throws Exception {

        thrown.expect(NegativeNumberException.class);
        thrown.expectMessage("negatives not allowed: [-3]");
        stringCalculator.add("//;\n1;2;-3");

        thrown.expect(NegativeNumberException.class);
        thrown.expectMessage("negatives not allowed: [-2, -3]");
        stringCalculator.add("//;\n1;-2;-3");
    }
}
