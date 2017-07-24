package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {


    public HomePage(WebDriver webDriver) {
        super( webDriver );
    }

    @FindBy(xpath = ".//img[@class='user-image']")
    WebElement rightAvatar;

    public boolean isAvatarPresent() {
        return actionsWithOurElements.isElementPresent( rightAvatar );
    }
}