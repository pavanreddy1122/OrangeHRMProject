package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static WebDriver  driver;

    public static WebDriver initDriver() {
        ConfigReader.loadConfig();
        String browser = ConfigReader.getProperty("browser");

        if(browser.equals("chrome")) {
            /*WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(); */ // this one is required if we use above WebDriverManager version 5
                                            // we can use directlly use row 22

            driver = WebDriverManager.chromedriver().create();
        } else if(browser.equals("edge")){

            driver = WebDriverManager.edgedriver().create();

        } else if(browser.equals("firefox")){
           driver =  WebDriverManager.firefoxdriver().create();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }
}
