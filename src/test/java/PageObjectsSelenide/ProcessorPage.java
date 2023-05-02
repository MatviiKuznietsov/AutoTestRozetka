package PageObjectsSelenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProcessorPage {
    private SelenideElement AMD = $(By.xpath("//a[@data-id = \"AMD\"]"));
    private SelenideElement BOX = $(By.xpath("//a[@data-id = \"BOX\"]"));
    private SelenideElement basket = $(By.xpath("(//app-buy-button)[2]"));
    private SelenideElement basketCountSign = $(By.xpath("//span[@class=\"badge badge--green ng-star-inserted\"]"));


    public ProcessorPage clickAmdAndBox() {
        AMD.click();
        BOX.click();
        return new ProcessorPage();
    }

    public ProcessorPage addBasket() {
        basket.click();
        return new ProcessorPage();
    }

    public String getBascketCount() {
        String count = basketCountSign.getText();
        return count;
    }
}
