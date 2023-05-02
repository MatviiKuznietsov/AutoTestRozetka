package PageObjectsSelenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ComputersParts  {
    private SelenideElement processorSign = $(By.xpath ("//span[.=\" Процесори \"][@class = \"portal-navigation__link-text\"]"));
   // @FindBy(xpath = "//span[.=\" Процесори \"][@class = \"portal-navigation__link-text\"]")
   // private WebElement processorSign;

    public ProcessorPage processorSign() {
        processorSign.click();
        return new ProcessorPage();
    }

}
