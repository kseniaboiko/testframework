package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateContactRecordTest extends SalesforceFixture {

    @BeforeClass
    public void login(){
        super.login();
    }

    @Test
    public void createRecord(){
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        Assert.assertEquals(true,navigationMenuPage.navigationIcon.isDisplayed());
//        navigationMenuPage.navigationIcon.click();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        Assert.assertEquals(true,navigationMenuPage.searchInput.isDisplayed());
//        navigationMenuPage.searchInput.sendKeys("Contacts");
//        navigationMenuPage.searchInput.sendKeys(Keys.ENTER);

        driver.get("https://university57-dev-ed.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[text()='New']")).click();
        driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("rty");
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
    }
}
