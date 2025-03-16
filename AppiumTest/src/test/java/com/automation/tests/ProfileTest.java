package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ProfilePage;
import utils.BaseTest;

public class ProfileTest extends BaseTest {
    ProfilePage profilePage;

    @BeforeClass
    public void setUpTest() {
        profilePage = new ProfilePage(driver);
    }

    @Test
    public void testProfileDetails() {
        String username = profilePage.getProfileUsername();
        
        // Validate correct username is displayed
        Assert.assertEquals(username, "testuser", "Username does not match!");
    }

    @Test
    public void testLogout() {
        profilePage.logout();

        // Validate successful logout (Check if login screen is displayed again)
        Assert.assertTrue(driver.getPageSource().contains("Login"), "Logout Failed!");
    }

    @AfterClass
    public void tearDownTest() {
        driver.quit();
    }
}
