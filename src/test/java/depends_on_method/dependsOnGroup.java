package depends_on_method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnGroup {

    @Test(groups = "smoke")
    public void verifyFundTransfer()
    {
        Assert.assertTrue(false); //Due to this line this test case will not execute.
        System.out.println("Verify Fund Transfer");
    }
    @Test(groups = "smoke")
    public void verifyFundTransferWithSaving()
    {
        System.out.println("Verify fund transfer with saving");
    }
    @Test(dependsOnGroups = "smoke")
    public void verifyCaseBackOffer()
    {
        System.out.println("Verify case bank offer");
    }
}
