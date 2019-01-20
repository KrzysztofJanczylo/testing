import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testAddition() {
        //given
        int a = 4;
        int b = 3;
        int expected = 7;

        //when
        int result = calculator.add(a, b);

        //then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAddition1() {
        int result = calculator.add(10, 15);
        Assert.assertEquals(25, result);
    }

    @Test
    public void testSubtracion() {
        int result = calculator.subtraction(10, 15);
        Assert.assertEquals(-5, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiplication(2, 15);
        Assert.assertEquals(30, result);
    }

    @Test
    public void testDivision() {
        int result = calculator.division(104, 5);
        Assert.assertEquals(20, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testArithmeticException() {
        //given
        int a = 4;
        int b = 0;

        //when
        int result = calculator.division(a, b);
    }

    @Test(expected = ArithmeticException.class)
    public void testArithmeticException1() {
        //given
        int a = 4;
        int b = 0;
        int resoult = -1;

        //when
        try {
            resoult = calculator.division(a, b);
        } catch (ArithmeticException ex) {
            Assert.assertTrue(true);
        }
        int result = calculator.division(a, b);

        Assert.assertEquals(-1, resoult);
    }

    @Test
    public void testArithmeticException2() {
        //given
        int a = 4;
        int b = 0;
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("/ by zero");

        //when
        int reault = calculator.division(a, b);
    }

    @Test(expected = NegativeNumberException.class)
    public void NNE() {
        //give
        int a = 6;
        int b = -2;
        int resoult = 14;

        //when
        int res = calculator.add(a, b);

        Assert.assertEquals(res, resoult);

    }


    @Test(expected = NotEvenNumberException.class)
    public void ABC() {
        //give
        int a = 6;
        int b = 4;
        int resoult = 14;

        //when
        int res = calculator.division(a, b);

        Assert.assertEquals(res, resoult);

    }

}