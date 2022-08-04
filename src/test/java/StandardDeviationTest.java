import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;
//import junit.framework.Assert;

public class StandardDeviationTest {
    DecimalFormat df = new DecimalFormat("#.#############");
    double arrSinglenumber[] = new double[1];
    double arrMultipleNumbers[] = new double[5];
    public StandardDeviationTest(){

    }

    @Test
    public void testZero() throws Exception {
        arrSinglenumber[0]=0;
        double res = StandardDeviation.calculateSD(arrSinglenumber);
        double expectres = 0;
        Assert.assertTrue(res==expectres);
    }

    @Test
    public void testSingleNumber() throws Exception {
        arrSinglenumber[0]=5;
        double res = StandardDeviation.calculateSD(arrSinglenumber);
        double expectres = 0;
        Assert.assertTrue(res==expectres);
    }

    @Test
    public void testSameNumbers() throws Exception {
        for(int i=0;i<arrMultipleNumbers.length;i++)
            arrMultipleNumbers[i] = 8;
        double res = StandardDeviation.calculateSD(arrMultipleNumbers);
        double expectres = 0;
        Assert.assertTrue(res==expectres);
    }

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

}