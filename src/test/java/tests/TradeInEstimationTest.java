package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TradeInEstimationTest extends BaseTest{

    @Test(priority = 2)
    public void checkThatTradeinEstimatesMonetaryValue() {
        getHomePage().clickTradeinButton();
        getTradeinPage().waitForPageLoadComplete(30);
        getTradeinPage().clickForwardButton();
        getTradeinPage().clickForwardButton();
        getTradeinPage().clickYesButton();
        getTradeinPage().clickForwardButton();
        getTradeinPage().clickYesButton();
        getTradeinPage().clickForwardButton();
        getTradeinPage().clickConditionButton1();
        getTradeinPage().clickForwardButton();
        getTradeinPage().clickConditionButton2();
        getTradeinPage().clickForwardButton();
        assertEquals(getTradeinPage().getValueOfEstimation(), 1550);
    }
}
