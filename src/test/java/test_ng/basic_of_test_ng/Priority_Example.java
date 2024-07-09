package test_ng.basic_of_test_ng;

import org.testng.annotations.Test;

public class Priority_Example {

    //If The test case is not priorities, in this case that test for case execute first.
    //Priority starts from 0 value.
    //We can declare priority in minus value like -1, -2 and so on...
    //We can declare priority in character as well, but in this case it will execute as per the ASCII value assigned to that particular character.
    @Test(priority = 1)
    public void testCase_Z()
    {System.out.println("Test Case Z");}
    @Test(priority = 2)
    public void testCase_V()
    {System.out.println("Test Case V");}
    @Test(priority = 3)
    public void testCase_M()
    {System.out.println("Test Case M");}
    @Test(priority = 4)
    public void testCase_Y()
    {System.out.println("Test Case Y");}
}
