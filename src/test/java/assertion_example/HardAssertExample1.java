package assertion_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample1 {

    @Test
    public void verifyHardAssert()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basant Singh\\Downloads\\DriversForAllBrowsers\\ChromedriverE\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        String textTitle=driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        Assert.assertEquals(textTitle, "Create a Rediffmail account", "Text  should be -Create a Rediffmail account");
        WebElement userNameTextBox=driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
        Assert.assertTrue(userNameTextBox.isDisplayed(), "User name text box should display");
        driver.close();
    }
}
