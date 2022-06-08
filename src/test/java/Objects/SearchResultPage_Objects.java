package Objects;

import org.openqa.selenium.By;

public class SearchResultPage_Objects {
    public static By nextPage = By.xpath("//li[@class = 'rc-pagination-next']");
    public static By itemDetails = By.xpath("//*[@id='details']//a[@data-testid = 'itemDescription']");
    public static By notAvailable = By.xpath("//*[@id='unavailableContainer']/label");
}
