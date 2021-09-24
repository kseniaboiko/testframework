package login;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class SalesforceFixture {

    public static ChromeDriver driver;
    LoginPage loginPage = new LoginPage(driver);
    public String login = "boikodegree@yourcompany.com";
    public String password = "qwerty123";

    @BeforeClass
    public void openCRM(){
        System.setProperty("webdriver.chromedriver.driver", "/Users/kseniia/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
    }

    public void login(){
        loginPage.email.sendKeys(login);
        loginPage.password.sendKeys(password);
    }
}
