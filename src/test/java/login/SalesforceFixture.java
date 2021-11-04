package login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.NavigationMenuPage;

import java.util.concurrent.TimeUnit;

public class SalesforceFixture {

    public ChromeDriver driver;
    LoginPage loginPage;
    NavigationMenuPage navigationMenuPage;

    public String login = "boikodegree@yourcompany.com";
    public String password = "qwerty123";

    @BeforeClass
    public void openCRM(){
        System.setProperty("webdriver.chrome.driver", "/Users/boiko/Documents/chromedriver/chromedriver");
        driver = new ChromeDriver();
        navigationMenuPage = new NavigationMenuPage(driver);
        driver.get("https://login.salesforce.com/");

    }

    public void login(){
        loginPage = new LoginPage(driver);
        loginPage.email.sendKeys(login);
        loginPage.password.sendKeys(password);
        loginPage.loginButton.click();


    }
}
