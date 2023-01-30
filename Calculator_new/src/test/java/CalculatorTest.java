import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    private Object NullPointerException;

    @Test
    public void add100_200_Expect_300() {
        Assert.assertEquals(calculator.addition(100,200),300,0.0);
    }
    @Test
    public void add100_min200_Expect_min100() {
        Assert.assertEquals(calculator.addition(100,-200),-100,0.0);
    }
    @Test
    public void addMin100_min200_Expect_min300() {
        Assert.assertEquals(calculator.addition(-100,-200),-300,0.0);
    }
    @Test
    public void addMin200_min200_Expect_min400() {
        Assert.assertEquals(calculator.addition(-200,-200),-400,0.0);
    }
    @Test
    public void subMin200_min200_Expect_0() {
        Assert.assertEquals(calculator.subtraction(-200,-200),0,0.0);}

    @Test
    public void multi200_100_Expect_20000() {
        Assert.assertEquals(calculator.multiplication(200,100),20000,0.0);
    }
    @Test
    public void multi200_min100_Expect_min20000() {
        Assert.assertEquals(calculator.multiplication(200,-100),-20000,0.0);
    }
    @Test (expected = NullPointerException.class)
    public void div200_0_Expect_exc() {
        Assert.assertEquals(calculator.division(200,0), (Double) NullPointerException,0.0);
    }
    @Test
    public void div200_100_Expect_2() {
        Assert.assertEquals(calculator.division(200,100),2,0.0);
    }
    @Test
    public void div200_min100_Expect_min2() {
        Assert.assertEquals(calculator.division(200,-100),-2,0.0);
    }
}
