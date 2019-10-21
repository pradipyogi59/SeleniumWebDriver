package Genreric_Module.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(linkText = "Sign in")
    public WebElement signin;

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public void signIn(){
        signin.click();
    }
}
