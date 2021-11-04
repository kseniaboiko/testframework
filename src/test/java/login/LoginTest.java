package login;

import pages.*;
//import java.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest extends SalesforceFixture {


    //public static ChromeDriver driver;

//    public LoginTest(ChromeDriver driver){
//        this.driver = driver;
//    }

//    @BeforeClass
//    public void before(){
//
//
//
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }

    @Test
    public void login(){
        super.login();
        HomePage homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        homePage.assertIsOpened();
    }

    @AfterClass
    public void after(){
       // driver.quit();
    }

}
