package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accessories_Decor_Page {
    WebDriver driver;
    public Accessories_Decor_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[normalize-space()='Decor Accessories']")
    WebElement Accessories_Decor;
    public WebElement get_Accessories_Decor()
    {
        return Accessories_Decor;
    }

    @FindBy(xpath = "//div[normalize-space()='Category']")
    WebElement Accessories_Decor_category_dropdown;
    public WebElement get_Accessories_Decor_category_dropdown()
    {
        return Accessories_Decor_category_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement Accessories_Decor_color_dropdown;
    public WebElement get_Accessories_Decor_color_dropdown()
    {
        return Accessories_Decor_color_dropdown;
    }
    @FindBy(xpath = "//div[normalize-space()='Primary Material']")
    WebElement Accessories_Decor_primary_material_dropdown;
    public WebElement get_Accessories_Decor_primary_material_dropdown()
    {
        return Accessories_Decor_primary_material_dropdown;
    }


    @FindBy(xpath="//select[@id='sorter']")
    WebElement Accessories_Decor_sort_by_dropdown;
    public WebElement get_Accessories_Decor_sort_by_dropdown()
    {
        return Accessories_Decor_sort_by_dropdown;
    }

}
