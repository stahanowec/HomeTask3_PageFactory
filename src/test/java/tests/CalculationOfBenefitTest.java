package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculationOfBenefitTest extends BaseTest{

    @Test(priority = 4)
    public void checkCorrect–°alculationBenefit() {
        getHomePage().clickCatalogButton();
        getAppleStore().clickAppleStoreButton();
        getIphonePage().clickIphoneButton();
        getIphonePage().waitForPageLoadComplete(30);
        assertEquals(getIphonePage().benefit(), getIphonePage().expectedBenefit());
    }
}
