package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeClass
    public void setUpTest() {
        homePage = new HomePage(driver);
    }

    @Test
    public void testHomeScreenLoaded() {
        Assert.assertTrue(homePage.isHomeScreenDisplayed(), "Home screen is NOT displayed!");
    }
}
