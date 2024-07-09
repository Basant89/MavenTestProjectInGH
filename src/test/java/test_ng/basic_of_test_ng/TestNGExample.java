package test_ng.basic_of_test_ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGExample {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethodExample()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basant Singh\\Downloads\\DriversForAllBrowsers\\ChromedriverE\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
   public void testCase1(){

       driver.get("https://www.amazon.in/");
       driver.manage().window().maximize();
   }
    @Test
    public void testCase2(){
        driver.get("https://www.jiocinema.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethodExample()
    {
        driver.close();
    }
}
