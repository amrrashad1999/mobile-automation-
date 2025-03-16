package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

    @BeforeClass
    public void setUpTest() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testSuccessfulLogin() {
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
        loginPage.clickLogin();

        // Validate successful login (you might need to check if a certain element appears)
        Assert.assertTrue(driver.getPageSource().contains("Welcome, testuser"), "Login Failed!");
    }

    @AfterClass
    public void tearDownTest() {
        driver.quit();
    }
}
