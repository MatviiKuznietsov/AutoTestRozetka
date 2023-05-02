package SelenideTests;

import BaseClass.BaseClassSelenide;
import PageObjectsSelenide.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideTests extends BaseClassSelenide {
    @Test
    public void FirstTest() {

        open("/ua");

        MainPage mainPage = new MainPage();
        String count = mainPage
                .clickComputersSign()
                .clickСomputersNotebooks()
                .processorSign()
                .clickAmdAndBox()
                .addBasket()
                .getBascketCount();
        System.out.println(count);
        Assert.assertEquals(count, "1");

    }
}
