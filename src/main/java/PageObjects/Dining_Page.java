package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dining_Page {
    
    WebDriver driver;
    public Dining_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[normalize-space()='Dining']")
    WebElement Dining;
    public WebElement get_Dining()
    {
        return Dining;
    }

    @FindBy(xpath = "//div[normalize-space()='Category']")
    WebElement Dining_category_dropdown;
    public WebElement get_Dining_category_dropdown()
    {
        return Dining_category_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement Dining_color_dropdown;
    public WebElement get_Dining_color_dropdown()
    {
        return Dining_color_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Finish Type']")
    WebElement Dining_Finish_type_dropdown;
    public WebElement get_Dining_Finish_type_dropdown()
    {
        return Dining_Finish_type_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Primary Material']")
    WebElement Dining_primary_material_dropdown;
    public WebElement get_Dining_primary_material_dropdown()
    {
        return Dining_primary_material_dropdown;
    }


    @FindBy(xpath="//select[@id='sorter']")
    WebElement Dining_sort_by_dropdown;
    public WebElement get_Dining_sort_by_dropdown()
    {
        return Dining_sort_by_dropdown;
    }
}
