package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lightning_Decor_Page {
    WebDriver driver;
    public Lightning_Decor_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[normalize-space()='lighting']")
    WebElement Lightning_Decor;
    public WebElement get_Lightning_Decor()
    {
        return Lightning_Decor;
    }

    @FindBy(xpath = "//div[normalize-space()='Category']")
    WebElement Lightning_Decor_category_dropdown;
    public WebElement get_Lightning_Decor_category_dropdown()
    {
        return Lightning_Decor_category_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement Lightning_Decor_color_dropdown;
    public WebElement get_Lightning_Decor_color_dropdown()
    {
        return Lightning_Decor_color_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Custom Product']")
    WebElement Lightning_Decor_Custom_product_dropdown;
    public WebElement get_Lightning_Decor_Custom_product_dropdown()
    {
        return Lightning_Decor_Custom_product_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Primary Material']")
    WebElement Lightning_Decor_primary_material_dropdown;
    public WebElement get_Lightning_Decor_primary_material_dropdown()
    {
        return Lightning_Decor_primary_material_dropdown;
    }


    @FindBy(xpath="//select[@id='sorter']")
    WebElement Lightning_Decor_sort_by_dropdown;
    public WebElement get_Lightning_Decor_sort_by_dropdown()
    {
        return Lightning_Decor_sort_by_dropdown;
    }
}
