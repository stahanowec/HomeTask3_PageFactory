package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PresenceOfBadgeTest extends BaseTest{

    @Test(priority = 1)
    public void checkThatActionGoodsContainsBadge() {
        getHomePage().clickDiscountButton();
        assertEquals(getDiscountPage().getListOfElementsOnPage().size(), getDiscountPage().getBadgesOnPage().size());
    }
}
