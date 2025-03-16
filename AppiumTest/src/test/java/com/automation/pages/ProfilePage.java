package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    private AppiumDriver driver; // Updated to remove MobileElement type

    // Constructor
    public ProfilePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Define UI Elements
    @FindBy(id = "com.shein.shopping:id/profile_username")
    private WebElement profileUsername; // Changed MobileElement to WebElement

    @FindBy(id = "com.shein.shopping:id/logout_button")
    private WebElement logoutButton; // Changed MobileElement to WebElement

    // Actions
    public String getProfileUsername() {
        return profileUsername.getText();
    }

    public void logout() {
        logoutButton.click();
    }
}
