package parameterization_in_test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

   public WebDriver driver;

   @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodExample(String browserName)
    {
        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basant Singh\\Downloads\\DriversForAllBrowsers\\ChromedriverE\\chromedriver-win64\\chromedriver.exe");
            driver=new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("fireFox"))
        {
            FirefoxOptions firefoxOptions=new FirefoxOptions();
            firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Basant Singh\\Downloads\\DriversForAllBrowsers\\FireFoxDriver\\geckodriver.exe");
            driver=new FirefoxDriver(firefoxOptions);
        } else if (browserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Basant Singh\\Downloads\\DriversForAllBrowsers\\EdgeDriver\\msedgedriver.exe");
            driver=new EdgeDriver();
        }else {
            throw new RuntimeException("Please select the correct browser");
        }
    }

    @Parameters({"courseName", "cityName"})
    @Test
    public void verifyBestInstitute(String courseName, String cityName) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basant Singh\\Downloads\\DriversForAllBrowsers\\ChromedriverE\\chromedriver-win64\\chromedriver.exe");
        //WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchTextBox=driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName+" "+cityName);
        searchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();

    }
}
