package base;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

public class BaseClass {
    public WebDriver driver;

    public void launchApplication() {
        driver = DriverManager.initDriver();
        driver.get(ConfigReader.getProperty("url"));
    }

    public void waitForelement(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }

}
