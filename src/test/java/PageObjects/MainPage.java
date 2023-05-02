package PageObjects;

import BaseClass.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(xpath = "//a[@class='menu-categories__link'][.='Ноутбуки та комп’ютери']")
    private WebElement computers;

    public СomputersNotebooksPage clickComputersSign(){
        computers.click();
        return new СomputersNotebooksPage();
    }

    public MainPage() {
        PageFactory.initElements(driver, this);
    }
}
