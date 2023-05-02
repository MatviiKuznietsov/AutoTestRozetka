package PageObjects;

import BaseClass.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class СomputersNotebooksPage extends BasePage {
    @FindBy(css = "[title = \"Комп'ютерні комплектуючі\"]")
    private WebElement computers1;

    public ComputersParts clickСomputersNotebooks() throws InterruptedException {
        clickButton(computers1);
        Thread.sleep(100);
        return new ComputersParts();
    }

    public СomputersNotebooksPage() {
        PageFactory.initElements(driver, this);
    }
}
