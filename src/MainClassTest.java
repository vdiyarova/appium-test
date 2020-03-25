import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber(){
        int localNumber = this.getLocalNumber();
        int expectedNumber = 14;
        Assert.assertEquals("Local number not equal to" + expectedNumber, localNumber, expectedNumber);
    }
}
