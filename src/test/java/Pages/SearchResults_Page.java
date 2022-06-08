package Pages;

import Config.Base;
import Config.CoreConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Objects.SearchResultPage_Objects.nextPage;

public class SearchResults_Page extends Base {

    public static WebDriver driver;

    public SearchResults_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public static SearchResults_Page clickNextPageButton(){
        WebElement nextPageButton = CoreConfig.driver.get().findElement(nextPage);
        nextPageButton.click();
        return new SearchResults_Page(driver);
    }

    public static Boolean isNextPageButtonEnabled() {
        Boolean result = false;
        String disabled = CoreConfig.driver.get().findElement(nextPage).getAttribute("aria-disabled");


        boolean bool = Boolean.parseBoolean(disabled);
        if (!bool) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}