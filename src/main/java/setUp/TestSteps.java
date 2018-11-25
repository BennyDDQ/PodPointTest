package setUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static setUp.TestSetup.driver;


public class TestSteps {

    @Test
    public void checkoutTest() throws InterruptedException {

        WebElement cookiePreference = driver.findElement(By.xpath("//div[@class=\"cookie-container\"]//button"));
        cookiePreference.click();

        WebElement selectMake = driver.findElement(By.xpath("//div[@class=\"form__group \"]//select"));
        selectMake.click();
        WebElement clickMake = driver.findElement(By.xpath("//div[@class=\"form__group \"]//select/option[13]"));
        clickMake.click();
        WebElement selectModel = driver.findElement(By.cssSelector("#vehicleId"));
        selectModel.click();
        WebElement clickModel = driver.findElement(By.xpath("//select[@id=\"vehicleId\"]/option[2]"));
        clickModel.click();

        WebElement eligibilityCheckbox = driver.findElement(By.xpath("//label[@for=\"optOut\"]/span"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(eligibilityCheckbox));
        eligibilityCheckbox.click();
        TimeUnit.SECONDS.sleep(3);


        WebElement connectionType = driver.findElement(By.xpath("//label[@for=\"variant-universal\"]//p"));
        WebDriverWait wait2 = new WebDriverWait(driver, 15);
        wait2.until(ExpectedConditions.elementToBeClickable(connectionType));
        connectionType.click();
        TimeUnit.SECONDS.sleep(3);

        WebElement powerRating = driver.findElement(By.xpath("//label[@for=\"model-S7\"]"));
        WebDriverWait wait3 = new WebDriverWait(driver, 15);
        wait3.until(ExpectedConditions.elementToBeClickable(powerRating));
        powerRating.click();
        TimeUnit.SECONDS.sleep(3);

        WebElement powerRatingPrice = driver.findElement(By.xpath("//label[@for=\"model-S7\"]//span[@class=\"h3\"]"));
        powerRatingPrice.getText();

        WebElement compatibleExtra1 = driver.findElement(By.xpath("//label[@for=\"chargingCableType1\"]"));
        WebElement compatibleExtra2 = driver.findElement(By.xpath("//label[@for=\"soloKeyLock\"]"));
        WebElement compatibleExtra3 = driver.findElement(By.xpath("//label[@for=\"fiveYearWarranty\"]"));
        WebElement compatibleExtra4 = driver.findElement(By.xpath("//label[@for=\"chargingCable10mType1\"]"));
        WebElement compatibleExtra5 = driver.findElement(By.xpath("//label[@for=\"holster\"]"));
        compatibleExtra1.isDisplayed();
        compatibleExtra2.isDisplayed();
        compatibleExtra3.isDisplayed();
        compatibleExtra4.isDisplayed();
        compatibleExtra5.isDisplayed();

        WebElement selectCompatibleExtra = driver.findElement(By.xpath("//label[@for=\"soloKeyLock\"]"));
        WebDriverWait wait4 = new WebDriverWait(driver, 10);
        wait4.until(ExpectedConditions.elementToBeClickable(selectCompatibleExtra));
        selectCompatibleExtra.click();
        TimeUnit.SECONDS.sleep(3);

        WebElement compatibleExtraPrice = driver.findElement(By.xpath("//label[@for=\"soloKeyLock\"]"));
        compatibleExtraPrice.getText();

        String total = powerRatingPrice.getText() + compatibleExtraPrice.getText();
        WebElement totalPrice = driver.findElement(By.xpath("//h3[@class=\"p-b-none\"]"));
        totalPrice.getText().contentEquals(total);
    }
}