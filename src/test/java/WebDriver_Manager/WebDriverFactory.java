package WebDriver_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

    private static WebDriver driver;

    public void setDriver() {
        this.driver = createWebDriver();
    }

    public WebDriver getDriver () {
        return this.driver;
    }

    public WebDriver createWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        this.driver = new ChromeDriver(chromeOptions);
        return this.driver;
    }
}