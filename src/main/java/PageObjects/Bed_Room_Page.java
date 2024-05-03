package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Baseclass;

public class Bed_Room_Page extends Baseclass
{
    WebDriver driver;
    public Bed_Room_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[normalize-space()='Bed Room']")
    WebElement Bed_Room;
    public WebElement get_Bed_Room()
    {
        return Bed_Room;
    }

    @FindBy(xpath = "//div[normalize-space()='Category']")
    WebElement Bed_Room_category_dropdown;
    public WebElement get_Bed_Room_category_dropdown()
    {
        return Bed_Room_category_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement Bed_Room_color_dropdown;
    public WebElement get_Bed_Room_color_dropdown()
    {
        return Bed_Room_color_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Finish Type']")
    WebElement Bed_Room_Finish_type_dropdown;
    public WebElement get_Bed_Room_Finish_type_dropdown()
    {
        return Bed_Room_Finish_type_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Primary Material']")
    WebElement Bed_Room_primary_material_dropdown;
    public WebElement get_Bed_Room_primary_material_dropdown()
    {
        return Bed_Room_primary_material_dropdown;
    }


    @FindBy(xpath="//select[@id='sorter']")
    WebElement Bed_Room_sort_by_dropdown;
    public WebElement get_Bed_Room_sort_by_dropdown()
    {
        return Bed_Room_sort_by_dropdown;
    }
}
