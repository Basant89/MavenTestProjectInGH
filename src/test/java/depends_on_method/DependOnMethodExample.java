package depends_on_method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethodExample {

    @Test
    public void verifiedLogin()
    {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test
    public void createNewUser()
    {
        System.out.println("Create a New User");
    }
    @Test(dependsOnMethods = "verifiedLogin")
    public void fundTransfer()
    {
        System.out.println("Funds Transfer");
    }

}
