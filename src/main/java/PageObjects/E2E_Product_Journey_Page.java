package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E2E_Product_Journey_Page {
    WebDriver driver;
    public E2E_Product_Journey_Page(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'please donot place order for this product')]")
    WebElement one_rs_product;
    public WebElement getOne_rs_product()
    {
        return one_rs_product;
    }
    @FindBy(xpath = "//input[@id='txtPincode']")
    WebElement pincode_verification;
    public WebElement getPincode_verification()
    {
        return pincode_verification;
    }

    @FindBy(xpath = "//label[@id='check-txt']")
    WebElement check;
    public WebElement getCheck()
    {
        return check;
    }

    @FindBy(xpath = "//div[@class='buynow-button']")
    WebElement buynow;
    public WebElement getBuynow()
    {
        return buynow;
    }

    @FindBy(xpath = "//button[@title='Place Order']")
    WebElement place_order;
    public WebElement getPlace_order()
    {
        return place_order;
    }
}
