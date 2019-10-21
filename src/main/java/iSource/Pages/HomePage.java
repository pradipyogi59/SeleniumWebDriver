package iSource.Pages;


import iSource.Base.BasePage1;
import iSource.Locators.HomePageLocatore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage{

    private WebDriver driver;
    private HomePageLocatore locatore;

    public HomePage(WebDriver driver){

        this.driver=driver;
        locatore=new HomePageLocatore();
        PageFactory.initElements(driver, locatore);


    }
    public LoginPage Clicklogin(){
        locatore.signin.click();
        return new LoginPage(driver);
    }

    public void le(){
        System.out.println("h");
    }

}
