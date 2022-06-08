package Config;

import Pages.Home_Page;
import WebDriver_Manager.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CoreConfig {
    protected static ThreadLocal <WebDriver> driver = new ThreadLocal<>();

    public void driver(){
        WebDriverFactory webDriverFactory =new WebDriverFactory();
        webDriverFactory.setDriver();
        driver.set(webDriverFactory.getDriver());
    }

    public Home_Page openWebStaurantStore(){
        driver();
        driver.get().get("https://www.webstaurantstore.com/");
        driver.get().manage().window().maximize();
        return new Home_Page(driver.get());

    }

    public void softAssert(){
    }
}