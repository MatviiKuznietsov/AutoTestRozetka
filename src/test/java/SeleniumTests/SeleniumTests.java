package SeleniumTests;

import BaseClass.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumTests extends BaseTest {
    @Test
    public void FirstTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String countGoods = openMainPage()
                .clickComputersSign()
                .clickСomputersNotebooks()
                .processorSign()
                .clickAmd()
                .clickBox()
                .addBasket()
                .getBascketCount();
        Assert.assertEquals(countGoods, "1");
    }
}
