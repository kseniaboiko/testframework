package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageObject {
    public ChromeDriver driver;

    @FindBy(id = "username")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "Login")
    public WebElement loginButton;

    public LoginPage(ChromeDriver driver){
        super(driver);
    }

}
