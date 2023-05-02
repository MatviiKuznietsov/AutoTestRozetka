package BaseClass;

import Utils.DriverHolder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    protected JavascriptExecutor javascriptExecutor;

    public BasePage() {
        this.driver = DriverHolder.getDriver();
        this.actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        javascriptExecutor = (JavascriptExecutor) driver;
    }

    protected void clickButton(WebElement button) {
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();
        //wait.until(ExpectedConditions.elementToBeClickable(button)).click();
    }

    protected void getText(WebElement button) {
        wait.until(ExpectedConditions.elementToBeClickable(button)).getText();
    }
}
