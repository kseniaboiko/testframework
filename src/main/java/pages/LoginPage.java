package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.Element;

public class LoginPage {
    public static ChromeDriver driver;


    public LoginPage(ChromeDriver driver){
        this.driver = driver;
    }

    public WebElement email = driver.findElement(By.cssSelector("#username"));
    public WebElement password = driver.findElement(By.cssSelector("#password"));
    public WebElement loginButton = driver.findElement(By.cssSelector("#Login"));
}
