package depends_on_method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class alwaysRunAttribute {

    @Test
    public void verifiedLogin()
    {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test(groups = "smoke")
    public void createNewUser()
    {
        System.out.println("Create a New User");
    }
    @Test(dependsOnMethods = "verifiedLogin", alwaysRun = true)//due to alwaysRun attribute our test case always run any how.
    public void fundTransfer()
    {
        System.out.println("Funds Transfer");
    }
}
