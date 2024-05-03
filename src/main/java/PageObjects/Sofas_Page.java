package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sofas_Page

{
    WebDriver driver;
    public Sofas_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[normalize-space()='Sofas']")
    WebElement Sofas;
    public WebElement get_Sofas()
    {
        return Sofas;
    }

    @FindBy(xpath = "//div[normalize-space()='Category']")
    WebElement Sofas_category_dropdown;
    public WebElement get_sofas_category_dropdown()
    {
        return Sofas_category_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement Sofas_color_dropdown;
    public WebElement get_Sofas_color_dropdown()
    {
        return Sofas_color_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Finish Type']")
    WebElement Sofas_Finish_type_dropdown;
    public WebElement get_Sofas_Finish_type_dropdown()
    {
        return Sofas_Finish_type_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Primary Material']")
    WebElement Sofas_primary_material_dropdown;
    public WebElement get_Sofas_primary_material_dropdown()
    {
        return Sofas_primary_material_dropdown;
    }


    @FindBy(xpath="//select[@id='sorter']")
    WebElement Sofas_sort_by_dropdown;
    public WebElement get_Sofas_sort_by_dropdown()
    {
        return Sofas_sort_by_dropdown;
    }




}


