package iSource.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocatore {

    @FindBy (linkText = "Sign in")
    public WebElement signin;
}
