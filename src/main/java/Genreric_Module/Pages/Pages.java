package Genreric_Module.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pages{

    public WebDriver driver;
    //Constructor calling
    public Pages(WebDriver driver) {
        this.driver = driver;
    }

    //it creates new generic page and return it
    public <TPage extends BasePage> TPage getPageObject(Class<TPage> pageClass) {
        try {
            //Initialize the all page elements and return them.
            return PageFactory.initElements(driver, pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
