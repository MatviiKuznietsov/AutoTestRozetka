package PageObjectsSelenide;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class СomputersNotebooksPage {

    private WebElement computers1 = $("[title = \"Комп'ютерні комплектуючі\"]");

    public ComputersParts clickСomputersNotebooks() {
        computers1.click();
        return new ComputersParts();
    }


}
