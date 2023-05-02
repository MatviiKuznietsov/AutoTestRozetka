package Utils;

import org.openqa.selenium.WebDriver;

public class DriverHolder {
    private static DriverHolder instance; //Class example

    private WebDriver driver;

    private DriverHolder() { //Constructor class
    }

    public static DriverHolder getInstance() {
        if (instance == null) {
            instance = new DriverHolder();
        }
        return instance;
    }

    public static WebDriver getDriver() {
        return getInstance().driver;
    }

    public static void setDriver(WebDriver driver) {
        getInstance().driver = driver;
    }
}
