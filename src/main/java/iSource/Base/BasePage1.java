package iSource.Base;

import iSource.Utilities.DriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public  class BasePage1{
    //<T> means class can hold any type of object

    protected WebDriver driver=DriverManager.getDriver();

    //public T : return type of T
    //pageOpen : method name
    //Class<T> : accept class of generic type


    public <T extends BasePage1> T openPage(Class<T> clazz) {
        T page = null;
        try {
            driver = DriverManager.getDriver();
          return  page = PageFactory.initElements(driver, clazz);

        } catch (NoSuchElementException e) {
        }
        return page;
    }

}
