package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class AppleStore extends BasePage{

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleStoreButton;

    public AppleStore(WebDriver driver) {
        super(driver);
    }
    public void clickAppleStoreButton() {
        appleStoreButton.click();
    }
}
