package PageObjects;

import BaseClass.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersParts extends BasePage {

    @FindBy(xpath = "//img[@src = \"https://content1.rozetka.com.ua/goods/top/original/228453357.jpg\"]")
    private WebElement processorSign;

    public ProcessorPage processorSign() {

        clickButton(processorSign);
        return new ProcessorPage();

    }

    public ComputersParts() {
        PageFactory.initElements(driver, this);
    }
}
