import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParamertizerTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Parameters({"2, 2, 4" , "10, 3, 13" ,  "2, 5, 7"})

    @Test
    public void testAddmition(int a, int b, int expected) {
        //give
        int result = calculator.add(a,b);

        //then
        assertThat(result).isEqualTo(expected);
        //Assert.assertEquals(expected,result);
    }

    @Parameters({"2, 2, 0" , "10, 3, 7" ,  "27, 5, 22"})

    @Test
    public void testSubtraction(int a, int b, int expected) {
        //give
        int result = calculator.subtraction(a,b);

        //then
        assertThat(result).isEqualTo(expected);

        //Assert.assertEquals(expected,result);
    }

    @Parameters({"2, 2, 4" , "10, 3, 30" ,  "2, 5, 10"})

    @Test
    public void testMultipliocation(int a, int b, int expected) {
        //give
        int result = calculator.multiplication(a,b);

        //then
        assertThat(result).isEqualTo(expected);
        //Assert.assertEquals(expected,result);
    }


    @Parameters({"2, 2, 1" , "10, 2, 5" ,  "21, 4, 5"})
    @Test
    public void testDivition(int a, int b, int expected) {
        //give
        int result = calculator.division(a,b);

        //then
        assertThat(result).isEqualTo(expected);
        //Assert.assertEquals(expected,result);
    }


    @Parameters (method = "adultValues()")
//    @Parameters({"{1,3,4,5,6,7,8,9} , {2,6,8}", "{2,2,2,2,2,2,2,1} , {2,2,2,2,2,2,2}"})
    @Test
    public void testParzysta(ArrayList<Integer> a, ArrayList<Integer> expected[]){
        ArrayList<Integer> result = calculator.parzysta(a);

        assertThat(result).isEqualTo(expected);
    }}
//    private Object[] adultValues() {
//                new Object[]{new ArrayList<Integer>().add()},
//
//                new Object[]{17, false},
//                new Object[]{18, true},
//                new Object[]{22, true}
//        }; return null ;
//}null
