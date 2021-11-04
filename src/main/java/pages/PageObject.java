package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class PageObject {


        public ChromeDriver driver;

        public PageObject(ChromeDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

}
