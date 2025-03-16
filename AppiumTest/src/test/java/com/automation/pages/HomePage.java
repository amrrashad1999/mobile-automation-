package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private AppiumDriver driver;

    // Constructor
    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Define UI Elements
    @FindBy(id = "com.shein.shopping:id/home_search_bar")
    private WebElement searchBar;

    @FindBy(id = "com.shein.shopping:id/home_category_button")
    private WebElement categoryButton;

    // Actions
    public void clickSearchBar() {
        searchBar.click();
    }

    public void openCategory() {
        categoryButton.click();
    }

    // ✅ FIX: Added this method to check if home screen is displayed
    public boolean isHomeScreenDisplayed() {
        return searchBar.isDisplayed(); // Checking if search bar is visible as a sign of home screen
    }
}


