package tests2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages2.RegisterUser;

import java.io.File;
import java.io.IOException;


public class BaseTests_Parent2 {

   // public static String configPropertyFileName =  "configData.properties" ;
    WebDriver driver;

    @BeforeMethod
    public void setup_initiateDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
          driver.get(("https://www.automationexercise.com/"));
        RegisterUser regist=new RegisterUser(driver);
        regist.clickSignup();
    }

    @AfterMethod
    public void a_takeScreenshotForFailedTests(ITestResult result) {
        String destination = "./screenshots/" + result.getName() + ".png" ;
        if (result.getStatus() == ITestResult.FAILURE) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                //To add it in the extent report
                FileUtils.copyFile(screenshot, new File(destination));
            } catch (IOException e) {
                // handle
            }
        }
    }

    @AfterMethod
    public void z_quitDriver() {
        driver.quit();
    }

}
