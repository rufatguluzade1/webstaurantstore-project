package Config;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base extends CoreConfig{

    public static WebDriver driver;


    public Base(WebDriver driver){
        this.driver = driver;
    }

    public static void clickOnButton(WebElement element) throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        executor.executeScript("arguments[0].click();", element);
    }
}
