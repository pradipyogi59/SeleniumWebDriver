package iSource.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocatore {

    @FindBy (id = "SubmitCreate")
    public WebElement register;

    @FindBy(id = "email_create")
    public WebElement email;

    @FindBy(id = "email")
    public WebElement loginEmail;

    @FindBy(id = "passwd")
    public WebElement loginpass;

    @FindBy(id = "SubmitLogin")
    public WebElement loginButton;
}
