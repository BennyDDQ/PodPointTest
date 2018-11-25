package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;


public class TestSetup {

    public static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {

        System.setProperty("webdriver.chrome.driver", "/Users/benetta/Downloads/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://checkout.pod-point.com");
    }

    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }
}