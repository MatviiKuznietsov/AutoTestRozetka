package BaseClass;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseClassSelenide {
    @BeforeClass
    public void preparation() {
       // System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        Configuration.baseUrl = "https://rozetka.com.ua/";
        Configuration.browser = "firefox";
        Configuration.savePageSource = false;
        Configuration.holdBrowserOpen = true;
        Configuration.downloadsFolder = "target/download/";
        Configuration.timeout = 3000;
        Configuration.browserSize = "1500x800";
        Configuration.screenshots = true;

    }
}
