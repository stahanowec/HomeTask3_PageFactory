package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DiscountPage extends BasePage {

    @FindBy(xpath = "//div[@class='prod-cart height']")
    private List<WebElement> elementsOnPage;

    @FindBy(xpath = "//div[@class='prod-cart height']//img[@data-src='https://avic.ua/assets/cache/badges/aktsiya-2-badge_sm.png']")
    private List<WebElement> badgesOnPage;

    public DiscountPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getListOfElementsOnPage() {
        return elementsOnPage;
    }

    public List<WebElement> getBadgesOnPage() {
        return badgesOnPage;
    }
}
