import org.junit.Assert;
import org.junit.Test;
import java.text.DecimalFormat;

/**
 * Class implementing Unit Test cases
 */
public class StandardDeviationTest {
    DecimalFormat df = new DecimalFormat("#.#############");
    double arrSinglenumber[] = new double[1];
    double arrMultipleNumbers[] = new double[5];
    public StandardDeviationTest(){

    }

    /**
     * Test Case: F8_UnitTestCase_1
     * Test ID: F8_TestInputZero
     * Unit test for Function Requirement: R1
     * @throws Exception
     */
    @Test
    public void testZero() throws Exception {
        arrSinglenumber[0]=0;
        double res = StandardDeviation.calculateSD(arrSinglenumber);
        double expectres = 0;
        Assert.assertTrue(res==expectres);
    }
    /**
     * Test Case: F8_UnitTestCase_2
     * Test ID: F8_TestSingleNumber
     * Unit test for Function Requirement: R2
     * @throws Exception
     */
    @Test
    public void testSingleNumber() throws Exception {
        arrSinglenumber[0]=5;
        double res = StandardDeviation.calculateSD(arrSinglenumber);
        double expectres = 0;
        Assert.assertTrue(res==expectres);
    }
    /**
     * Test Case: F8_UnitTestCase_3
     * Test ID: F8_TestSameNumbers
     * Unit test for Function Requirement: R3
     * @throws Exception
     */
    @Test
    public void testSameNumbers() throws Exception {
        for(int i=0;i<arrMultipleNumbers.length;i++)
            arrMultipleNumbers[i] = 8;
        double res = StandardDeviation.calculateSD(arrMultipleNumbers);
        double expectres = 0;
        Assert.assertTrue(res==expectres);
    }
    /**
     * Test Case: F8_UnitTestCase_4
     * Test ID: F8_TestNegativeNumbers
     * Unit test for Function Requirement: R4.
     * @throws Exception
     */
    @Test
    public void testNegativeNumbers() throws Exception {
        arrMultipleNumbers[0] = -8;
        arrMultipleNumbers[1] = -6;
        arrMultipleNumbers[2] = 9;
        arrMultipleNumbers[3] = -10;
        arrMultipleNumbers[4] = 5;
        double res = StandardDeviation.calculateSD(arrMultipleNumbers);
        double expectres = 7.5630681604756;
        Assert.assertTrue(Double.valueOf(df.format(res))==expectres);
    }

    /**
     * Test Case: F8_UnitTestCase_5
     * Test ID: F8_TestPositiveNumbers
     * Unit test for Function Requirement: R5
     * @throws Exception
     */
    @Test
    public void testPositiveNumbers() throws Exception {
        arrMultipleNumbers[0] = 8;
        arrMultipleNumbers[1] = 6;
        arrMultipleNumbers[2] = 9;
        arrMultipleNumbers[3] = 10;
        arrMultipleNumbers[4] = 5;
        double res = StandardDeviation.calculateSD(arrMultipleNumbers);
        double expectres = 1.8547236990991407;
        Assert.assertTrue(Double.valueOf(res)==expectres);
    }
    /**
     * Test Case: F8_UnitTestCase_6
     * Test ID: F8_TestDecimalNumbers
     * Unit test for Function Requirement: R6
     * @throws Exception
     */
    @Test
    public void testDecimalNumbers() throws Exception {
        arrMultipleNumbers[0] = 8.2;
        arrMultipleNumbers[1] = 6.4;
        arrMultipleNumbers[2] = 1.9;
        arrMultipleNumbers[3] = 7.5;
        arrMultipleNumbers[4] = 5;
        double res = StandardDeviation.calculateSD(arrMultipleNumbers);
        double expectres = 2.2297981971472;
        Assert.assertTrue(Double.valueOf(df.format(res))==expectres);
    }
    /**
     * Test Case: F8_UnitTestCase_7
     * Test ID: F8 TestDecimalNumbers
     * Unit test for Function Requirement: R7
     * @throws Exception
     */
    @Test
    public void testSquareRoot() throws Exception {
        double input = 2;
        double res = StandardDeviation.squareRoot(input);
        double expectres = 1.4142135623746899;
        Assert.assertTrue(res==expectres);
    }
    /**
     * Test Case: F8_UnitTestCase_8
     * Test ID: F8_TestPower
     * Unit test for Function Requirement: R8
     * @throws Exception
     */
    @Test
    public void testPower() throws Exception {
        double base = 5;
        double exponent = 2;
        double res = StandardDeviation.power(base,exponent);
        double expectres = 25;
        Assert.assertTrue(res==expectres);
    }
    /**
     * Test Case: F8_UnitTestCase_9
     * Test ID: F8_TestInputisNumber
     * Unit test for Function Requirement: R9
     * @throws Exception
     */
    @Test
    public void testInputIsNumber() throws Exception {
        String s = "g";
        String s1 = "10";
        boolean res = Eternity.numericInputCheck(s);
        boolean res1 = Eternity.numericInputCheck(s1);
        Assert.assertFalse(res);
        Assert.assertTrue(res1);
    }
    /**
     * Test Case: F8_UnitTestCase_10
     * Test ID: F8_TestAvailability
     * Unit test for Function Requirement: R10
     * @throws Exception
     */
    @Test
    public void testAvailability() throws Exception {
        //takes around 969ms
        Eternity e = new Eternity();
    }

}