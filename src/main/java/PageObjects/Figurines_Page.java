package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Figurines_Page {
    WebDriver driver;
    public Figurines_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //@FindBy(xpath = "")
    //WebElement
}
