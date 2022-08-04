import org.junit.Assert;
import org.junit.Test;

public class EternityTest {

    @Test
    public void testInputIsNumber() throws Exception {
        String s = "g";
        String s1 = "10";
        boolean res = Eternity.numericInputCheck(s);
        boolean res1 = Eternity.numericInputCheck(s1);
        Assert.assertFalse(res);
        Assert.assertTrue(res1);
    }
}


