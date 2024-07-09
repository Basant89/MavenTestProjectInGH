package test_ng.basic_of_test_ng;

import org.testng.annotations.Test;

public class invocationTimeOutAttribute {

    //Whenever we are running any test case multiple time, and we want to declare a time frame in this case, we have to use invocationTimeOut attribute in @Test.
    //If our test cases are not able to execute within the given invocation time for invocation count, then we will get ThreadAndException.
    @Test(invocationCount = 10, invocationTimeOut = 1000)
    public void invocationCountExample1(){
        System.out.println("Demo Invocation");
    }
}
