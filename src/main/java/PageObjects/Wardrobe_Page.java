package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Baseclass;

public class Wardrobe_Page extends Baseclass {
    WebDriver driver;
    public Wardrobe_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//p[normalize-space()='Wardrobe']")
    WebElement Wardrobe;
    public WebElement get_Wardrobe()
    {
        return Wardrobe;
    }

    @FindBy(xpath = "//div[normalize-space()='Category']")
    WebElement Wardrobe_category_dropdown;
    public WebElement get_Wardrobe_category_dropdown()
    {
        return Wardrobe_category_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement Wardrobe_color_dropdown;
    public WebElement get_Wardrobe_color_dropdown()
    {
        return Wardrobe_color_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Finish Type']")
    WebElement Wardrobe_Finish_type_dropdown;
    public WebElement get_Wardrobe_Finish_type_dropdown()
    {
        return Wardrobe_Finish_type_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Primary Material']")
    WebElement Wardrobe_primary_material_dropdown;
    public WebElement get_Wardrobe_primary_material_dropdown()
    {
        return Wardrobe_primary_material_dropdown;
    }


    @FindBy(xpath="//select[@id='sorter']")
    WebElement Wardrobe_sort_by_dropdown;
    public WebElement get_Wardrobe_sort_by_dropdown()
    {
        return Wardrobe_sort_by_dropdown;
    }
}
