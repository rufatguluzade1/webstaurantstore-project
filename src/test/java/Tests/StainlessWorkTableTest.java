package Tests;

import Config.CoreConfig;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static Objects.HomePage_Objects.searchFieldOnHomePage;
import static Objects.HomePage_Objects.searchSubmit;
import static Objects.SearchResultPage_Objects.itemDetails;
import static Objects.SearchResultPage_Objects.notAvailable;

public class StainlessWorkTableTest extends CoreConfig {

    @Test
    public void stainlessWorkTable() throws InterruptedException {
        openWebStaurantStore();
        WebElement searchField = driver.get().findElement(searchFieldOnHomePage);
        searchField.click();
        searchField.sendKeys("stainless work table");
        WebElement submit = driver.get().findElement(searchSubmit);
        submit.click();

        int pageCount = 1;

        List<WebElement> allItemDetails = driver.get().findElements(itemDetails);
        System.out.println("The count of search results on page: " + pageCount + " is " + allItemDetails.size());
            for (int i = 0; i < allItemDetails.size(); i++) {
                if (allItemDetails.get(i).getText().contains("Table")) {
                    System.out.println("This search result include the keyword: Table. The search result is: " + allItemDetails.get(i).getText());
                }
                Assert.assertTrue(allItemDetails.get(i).getText().contains("Table"), "This description doesn't include the keyword: Table. Please see the description:" + allItemDetails.get(i).getText());
            }

            allItemDetails.get(allItemDetails.size()-1).click();
        WebElement orderSection = driver.get().findElement(notAvailable);
        if(orderSection.getText().contains("Notify me when this product is back in stock")){
                Assert.fail("This item couldn't be added to the Cart");
            }
        driver.get().close();
        driver.get().quit();
            }
}