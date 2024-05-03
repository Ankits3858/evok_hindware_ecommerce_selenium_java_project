package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Storage_Page {
    WebDriver driver;
    public Storage_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[normalize-space()='Storage']")
    WebElement Storage;
    public WebElement get_Storage()
    {
        return Storage;
    }

    @FindBy(xpath = "//div[normalize-space()='Category']")
    WebElement Storage_category_dropdown;
    public WebElement get_Storage_category_dropdown()
    {
        return Storage_category_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement Storage_color_dropdown;
    public WebElement get_Storage_color_dropdown()
    {
        return Storage_color_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Finish Type']")
    WebElement Storage_Finish_type_dropdown;
    public WebElement get_Storage_Finish_type_dropdown()
    {
        return Storage_Finish_type_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Primary Material']")
    WebElement Storage_primary_material_dropdown;
    public WebElement get_Storage_primary_material_dropdown()
    {
        return Storage_primary_material_dropdown;
    }
    @FindBy(xpath="//select[@id='sorter']")
    WebElement Storage_sort_by_dropdown;
    public WebElement get_Storage_sort_by_dropdown()
    {
        return Storage_sort_by_dropdown;
    }
}
