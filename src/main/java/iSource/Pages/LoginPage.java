package iSource.Pages;


import iSource.Locators.LoginPageLocatore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    private LoginPageLocatore locatore;

    public LoginPage(WebDriver driver){

        this.driver=driver;
        locatore=new LoginPageLocatore();
        PageFactory.initElements(driver, locatore);
    }

    public void typeEmail(String s){
        locatore.email.sendKeys(s);
    }

    public RegisterPage clickOnRegister(){
        locatore.register.click();
        return new RegisterPage(this.driver);
    }

    public void Validlogin(String id,String pass){
        locatore.loginEmail.sendKeys(id);
        locatore.loginpass.sendKeys(pass);
        locatore.loginButton.click();
    }
}
