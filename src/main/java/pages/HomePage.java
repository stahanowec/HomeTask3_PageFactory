package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//a[contains(@href, 'skidki')])[1]")
    private WebElement discountButton;

    @FindBy(xpath = "//div[contains(@class, 'header')]//a[@href='/tradein']")
    private WebElement tradeinButton;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement catalogButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickDiscountButton() {
        discountButton.click();
    }

    public void clickTradeinButton() {
        tradeinButton.click();
    }

    public void clickCatalogButton() {
        catalogButton.click();
    }
}
