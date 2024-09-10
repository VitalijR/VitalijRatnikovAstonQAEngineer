package Lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Factorial2TestngTest {

    Factorial2 f2 = new Factorial2();
    @Test
    public void factorial2Test1 (){
        Assert.assertEquals(f2.getFactorial(5), 120);
    }

    @Test
    public void factorial2Test2 () {
        Assert.assertEquals(f2.getFactorial(-5), 0);
    }

    @Test
    public void factorial2Test3 () {
        Assert.assertEquals(f2.getFactorial(0), 1);
    }
}
