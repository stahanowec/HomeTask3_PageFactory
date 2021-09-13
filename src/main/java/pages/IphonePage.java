package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class IphonePage extends BasePage{

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'iphone')]")
    private WebElement iphoneButton;

    @FindBy(xpath = "(//div[@class='prod-cart__status-box bg-orange'])[1]")
    private WebElement benefit;

    @FindBy(xpath = "(//div[@class='prod-cart__prise']//div[contains(@class,'old')])[1]")
    private WebElement oldPrice;

    @FindBy(xpath = "(//div[@class='prod-cart__prise-new'])[1]")
    private WebElement newPrice;

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void clickIphoneButton() {
        iphoneButton.click();
    }

    public int benefit() {
        var str1 = benefit.getText().split(" ");
        return Integer.valueOf(str1[2]);
    }

    public int expectedBenefit() {
        var str2 = oldPrice.getText().split(" ");
        var str3 = newPrice.getText().split(" ");
        return Integer.valueOf(str2[0])-Integer.valueOf(str3[0]);
    }

}
