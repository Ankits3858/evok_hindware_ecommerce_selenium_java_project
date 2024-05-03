package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Photo_frames {
    WebDriver driver;
    public Photo_frames(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

 //   @FindBy(xpath = "//div[@attribute='brands_filter']")
   // WebElement brands;
    //p
}
