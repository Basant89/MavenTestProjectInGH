package take_screenshot_with_dynamic_name;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotWithDynamicName {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Basant Singh\\Downloads\\DriversForAllBrowsers\\ChromedriverE\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("D:\\fileClassesExampleFiles\\_"+timeStamp()+".png");
        FileUtils.copyFile(src, dest);

        driver.close();
    }
    public static String timeStamp()
    {return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());}
}
