package Base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    public WebElement findElement(By by){

        return driver.findElement(by);
    }

    public void clickElement(By by){

        findElement(by).click();

    }

    public void sendKeys(By by, String keys){
        findElement(by).sendKeys(keys);
    }

    public void waitToClickable(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void assertText(By by, String expectedText){
        String actualText = findElement(by).getText();
        Assert.assertEquals(actualText,expectedText);
    }

}
