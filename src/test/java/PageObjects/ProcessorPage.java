package PageObjects;

import BaseClass.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProcessorPage extends BasePage {
    @FindBy(xpath = "//a[@data-id = \"AMD\"]")
    private WebElement AMD;
    @FindBy(xpath = "//a[@data-id = \"BOX\"]")
    private WebElement BOX;
    @FindBy(xpath = "(//app-buy-button)[2]")
    private WebElement basket;
    @FindBy(xpath = "//span[@class=\"badge badge--green ng-star-inserted\"]")
    private WebElement basketCountSign;

    public ProcessorPage clickAmd() throws InterruptedException {
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.tagName("aside"), "class", "preloader_type_element")));
        AMD.click();
        Thread.sleep(5);
        return new ProcessorPage();
    }

    public ProcessorPage clickBox() throws InterruptedException {
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeContains(By.tagName("aside"), "class", "preloader_type_element")));
        clickButton(BOX);
        Thread.sleep(5);
        return new ProcessorPage();
    }

    public ProcessorPage addBasket() {
        clickButton(basket);
        return new ProcessorPage();
    }

    public String getBascketCount() {
        String countGoods = basketCountSign.getText();
        System.out.println(countGoods);
        return  countGoods;

    }

    public ProcessorPage() {
        PageFactory.initElements(driver, this);
    }
}
