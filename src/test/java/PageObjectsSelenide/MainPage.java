package PageObjectsSelenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement computers = $(By.xpath("//a[@class='menu-categories__link'][.='Ноутбуки та комп’ютери']"));

    public СomputersNotebooksPage clickComputersSign() {
        computers.click();
        return new СomputersNotebooksPage();
    }


}
