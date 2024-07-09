package disable_and_enable_the_test_case;

import org.testng.annotations.Test;

public class disableTheTestCase {

    @Test(priority = 1)
    public void testCase_Z()
    {System.out.println("Test Case Z");}
    @Test(priority = 2)
    public void testCase_V()
    {System.out.println("Test Case V");}
    @Test(priority = 3)
    public void testCase_M()
    {System.out.println("Test Case M");}
    @Test(priority = 4, enabled = true) //how to disable the test case example
    public void testCase_Y()
    {System.out.println("Test Case Y");}
}
