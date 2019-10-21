package Genreric_Module.DriverManager;

import Genreric_Module.Pages.Pages;
import iSource.Utilities.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestBaseClass {

    public WebDriver driver;
    public Pages page;

    public void initialization(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/");
        page=new Pages(driver);

        DriverManager.setWebDriver(driver);
    }

}
