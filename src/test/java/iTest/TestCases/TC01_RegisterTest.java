package iTest.TestCases;

import iSource.Base.BaseClass;
import iSource.Pages.HomePage;
import iSource.Pages.LoginPage;
import iSource.Pages.RegisterPage;
import iSource.Utilities.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC01_RegisterTest {

    private WebDriver driver;
    BaseClass base;
    RegisterPage register;
    LoginPage login;

    @Test(priority = 1)
    public void initialization(){

        base=new BaseClass();
        base.initialization();
        driver= DriverManager.getDriver();
    }

    @Test(priority = 2)
    public void navigateToRegister(){

        login=new HomePage(driver).Clicklogin();
        login.typeEmail("pradip.manual1@gmail.com");
        register=login.clickOnRegister();
    }

    @Test(priority = 3)
    public void close(){
        driver.quit();
    }

}
