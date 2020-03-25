import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber(){
        int localNumber = this.getLocalNumber();
        int expectedNumber = 14;

        Assert.assertEquals("Local number not equal to" + expectedNumber, localNumber, expectedNumber);
    }

    @Test
    public void testGetClassNumber(){
        int classNumber = this.getClassNumber();

        Assert.assertTrue("Number less than 45", classNumber > 45);
    }

    @Test
    public void testGetClassString(){
        String classString = this.getClassString();
        boolean result1, result2;

        result1 = classString.contains("Hello");
        result2 = classString.contains("hello");
        Assert.assertTrue("Strings 'hello' or 'Hello' are not contained in a string: " + classString, result1||result2);
    }

}
