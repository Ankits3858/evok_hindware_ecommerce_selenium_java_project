package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chairs_Page
{
    WebDriver driver;
    public Chairs_Page(WebDriver driver)
    {
       this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//p[normalize-space()='Chairs']")
    WebElement Chairs;
    public WebElement get_Chairs()
    {
        return Chairs;
    }

   @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement Chairs_color_dropdown;
    public WebElement get_Chairs_color_dropdown()
    {
        return Chairs_color_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Finish Type']")
    WebElement Chairs_Finish_type_dropdown;
    public WebElement get_Chairs_Finish_type_dropdown()
    {
        return Chairs_Finish_type_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Primary Material']")
    WebElement Chairs_primary_material_dropdown;
    public WebElement get_chairs_primary_material_dropdown()
    {
        return Chairs_primary_material_dropdown;
    }


    @FindBy(xpath="//select[@id='sorter']")
    WebElement Chairs_sort_by_dropdown;
    public WebElement get_chairs_sort_by_dropdown()
    {
        return Chairs_sort_by_dropdown;
    }



}
