package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wall_Decor_Page {
    WebDriver driver;
    public Wall_Decor_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[normalize-space()='Wall Decor']")
    WebElement Wall_Decor;
    public WebElement get_Wall_Decor()
    {
        return Wall_Decor;
    }

    @FindBy(xpath = "//div[normalize-space()='Category']")
    WebElement Wall_Decor_category_dropdown;
    public WebElement get_Wall_Decor_category_dropdown()
    {
        return Wall_Decor_category_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement Wall_Decor_color_dropdown;
    public WebElement get_Wall_Decor_color_dropdown()
    {
        return Wall_Decor_color_dropdown;
    }
    @FindBy(xpath = "//div[normalize-space()='Primary Material']")
    WebElement Wall_Decor_primary_material_dropdown;
    public WebElement get_Wall_Decor_primary_material_dropdown()
    {
        return Wall_Decor_primary_material_dropdown;
    }


    @FindBy(xpath="//select[@id='sorter']")
    WebElement Wall_Decor_sort_by_dropdown;
    public WebElement get_Wall_Decor_sort_by_dropdown()
    {
        return Wall_Decor_sort_by_dropdown;
    }
}
