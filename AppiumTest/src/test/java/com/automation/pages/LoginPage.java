package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private AppiumDriver driver; // Updated to remove MobileElement type

    // Constructor
    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Define UI Elements
    @FindBy(id = "com.shein.shopping:id/username_input")
    private WebElement usernameField; // Changed MobileElement to WebElement

    @FindBy(id = "com.shein.shopping:id/password_input")
    private WebElement passwordField; // Changed MobileElement to WebElement

    @FindBy(id = "com.shein.shopping:id/login_button")
    private WebElement loginButton; // Changed MobileElement to WebElement

    // Actions
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}
