package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class HomePage extends PageObject {

    public ChromeDriver driver;

    @FindBy(id = "setupComponent")
    public WebElement setupComponent;

    @FindBy(id = "sfdc-splitview-content")
    public WebElement leftMenu;

    @FindBy(id = "oneHeader")
    public WebElement header;

    public HomePage(ChromeDriver driver){
        super(driver);
    }

    public void assertIsOpened(){
        Assert.assertEquals(true,setupComponent.isDisplayed());
        Assert.assertEquals(true,leftMenu.isDisplayed());
        Assert.assertEquals(true,header.isDisplayed());
    }
}
