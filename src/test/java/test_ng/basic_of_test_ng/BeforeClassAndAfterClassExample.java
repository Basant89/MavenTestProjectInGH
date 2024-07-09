package test_ng.basic_of_test_ng;

import org.testng.annotations.*;

public class BeforeClassAndAfterClassExample {

    @BeforeClass
    public void beforeClassDemo(){
        System.out.println("Before Class Demo");
    }
        @BeforeMethod
        public void beforeMethodDemo()
        {System.out.println("Before method Demo");}

        @Test
        public void testCase1()
        {System.out.println("Name Test 1");}
        @Test
        public void testCase2()
        {System.out.println("Name Test 2");}
        @Test
        public void testCase3()
        {System.out.println("Name Test 3");}

        @AfterMethod
        public void afterMethodDemo()
        {System.out.println("After method Demo");}
    @AfterClass
    public void afterClassDemo(){
        System.out.println("After class Demo");
    }
}
