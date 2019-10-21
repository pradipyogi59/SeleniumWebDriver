package iSource.Pages;

import iSource.Locators.RegisterPageLocatore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    private WebDriver driver;
    private RegisterPageLocatore locatore;

    public RegisterPage(WebDriver driver){

        this.driver=driver;
        locatore=new RegisterPageLocatore();
        PageFactory.initElements(this.driver,locatore);
    }

    public void FormFillup(){
        locatore.firstName.sendKeys("pradip");
    }
}
