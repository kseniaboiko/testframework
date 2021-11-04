package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class NavigationMenuPage extends PageObject{
    public ChromeDriver driver;

    @FindBy(className = "slds-icon-waffle")
    public WebElement navigationIcon;

    @FindBy(id = "input-64")
    public WebElement searchInput;

    public NavigationMenuPage(ChromeDriver driver){
        super(driver);
    }
}
