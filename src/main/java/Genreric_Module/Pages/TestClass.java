package Genreric_Module.Pages;

import Genreric_Module.DriverManager.TestBaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestClass extends TestBaseClass {

    @Test
    public void loginCheck(){
        initialization();
        page.getPageObject(HomePage.class).signIn();
    }

}
