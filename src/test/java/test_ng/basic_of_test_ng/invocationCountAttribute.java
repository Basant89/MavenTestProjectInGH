package test_ng.basic_of_test_ng;

import org.testng.annotations.Test;

public class invocationCountAttribute {

    @Test
    public void invocationCountExample(){
        System.out.println("Demo without Invocation");
    }
    //When we have to run any test case in multiple time, in this case we will use InvocationCount attribute in @Test.
    @Test(invocationCount = 10)
    public void invocationCountExample1(){
        System.out.println("Demo Invocation");
    }
}
