package BaseClass;

import PageObjects.MainPage;
import Utils.DriverHolder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void SetUp() {
        WebDriverManager.firefoxdriver().setup();
        this.driver = new FirefoxDriver();
        /*
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        this.driver = new ChromeDriver(chromeOptions)

         */
        driver.manage().window().maximize();
        DriverHolder.setDriver(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            //   driver.quit();
        }
    }

    public MainPage openMainPage() {
        driver.get("https://rozetka.com.ua/");
        return new MainPage();
    }

}
