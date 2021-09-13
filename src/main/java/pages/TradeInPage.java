package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TradeInPage extends BasePage {

    @FindBy(xpath = "//button[text()='Вперед']")
    private WebElement forwardButton;

    @FindBy(xpath = "//div[@style='display: block;']//button[text()='Да']")
    private WebElement yesButton;

    @FindBy(xpath = "(//button[@class='main-btn main-btn--tradein is-fullwidth'])[1]")
    private WebElement conditionButton1;

    @FindBy(xpath = "(//button[@class='main-btn main-btn--tradein is-fullwidth'])[3]")
    private WebElement conditionButton2;

    @FindBy(xpath = "//h2")
    private WebElement estimatedValue;

    public TradeInPage(WebDriver driver) {
        super(driver);
    }

    public void clickForwardButton() {
        forwardButton.click();
    }

    public void clickYesButton() {
        yesButton.click();
    }

    public void clickConditionButton1() {
        conditionButton1.click();
    }

    public void clickConditionButton2() {
        conditionButton2.click();
    }

    public int getValueOfEstimation() {
        var strings = estimatedValue.getText().split(" ");
        return Integer.valueOf(strings[0]);
    }
}
