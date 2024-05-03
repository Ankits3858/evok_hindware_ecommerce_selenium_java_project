package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hindware_Page {
    WebDriver driver;
    public Hindware_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[contains(@class,'sticker')]//span[contains(text(),'HINDWARE APPLIANCES')]")
    WebElement Hindware;
    public WebElement get_Hindware()
    {
        return Hindware;
    }

    @FindBy(xpath = "//div[normalize-space()='Category']")
    WebElement Hindware_category_dropdown;
    public WebElement get_Hindware_category_dropdown()
    {
        return Hindware_category_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement Hindware_color_dropdown;
    public WebElement get_Hindware_color_dropdown()
    {
        return Hindware_color_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='Finish Type']")
    WebElement Hindware_Finish_type_dropdown;
    public WebElement get_Hindware_Finish_type_dropdown()
    {
        return Hindware_Finish_type_dropdown;
    }

    @FindBy(xpath = "//div[normalize-space()='material_type']")
    WebElement Hindware_material_type_dropdown;
    public WebElement get_Hindware_material_type_dropdown()
    {
        return Hindware_material_type_dropdown;
    }


    @FindBy(xpath="//select[@id='sorter']")
    WebElement Hindware_sort_by_dropdown;
    public WebElement get_Hindware_sort_by_dropdown()
    {
        return Hindware_sort_by_dropdown;
    }

    @FindBy(xpath="//div[normalize-space()='Capacity']")
    WebElement Hindware_Capacity_dropdown;
    public WebElement get_Hindware_Capacity_dropdown()
    {
        return Hindware_Capacity_dropdown;
    }

    @FindBy(xpath="//div[normalize-space()='tank_type']")
    WebElement Hindware_Tank_Type_dropdown;
    public WebElement get_Hindware_Tank_Type_dropdown()
    {
        return Hindware_Tank_Type_dropdown;
    }

    @FindBy(xpath="//div[normalize-space()='wattage']")
    WebElement Hindware_Wattage_dropdown;
    public WebElement get_Hindware_Wattage_dropdown()
    {
        return Hindware_Wattage_dropdown;
    }

    @FindBy(xpath="//div[normalize-space()='cooling_pad']")
    WebElement Hindware_Cooling_pad_dropdown;
    public WebElement get_Hindware_Cooling_pad_dropdown()
    {
        return Hindware_Cooling_pad_dropdown;
    }

    @FindBy(xpath="//div[normalize-space()='Control Type']")
    WebElement Hindware_Control_type_dropdown;
    public WebElement get_Hindware_Control_type_dropdown()
    {
        return Hindware_Control_type_dropdown;
    }

    @FindBy(xpath="//div[normalize-space()='Suction']")
    WebElement Hindware_Suction_dropdown;
    public WebElement get_Hindware_Suction_dropdown()
    {
        return Hindware_Suction_dropdown;
    }

    @FindBy(xpath="//div[normalize-space()='Filter Technology']")
    WebElement Hindware_Filter_technology_dropdown;
    public WebElement get_Hindware_Filter_technology_dropdown()
    {
        return Hindware_Filter_technology_dropdown;
    }

    @FindBy(xpath="//div[normalize-space()='burner']")
    WebElement Hindware_Burner_dropdown;
    public WebElement get_Hindware_Burner_dropdown()
    {
        return Hindware_Burner_dropdown;
    }

    @FindBy(xpath="//div[normalize-space()='Size']")
    WebElement Hindware_Size_dropdown;
    public WebElement get_Hindware_Size_dropdown()
    {
        return Hindware_Size_dropdown;
    }

    @FindBy(xpath="//div[normalize-space()='gas_type']")
    WebElement Hindware_gas_type_dropdown;
    public WebElement get_Hindware_gas_type_dropdown()
    {
        return Hindware_gas_type_dropdown;
    }


    @FindBy(xpath="//div[normalize-space()='display']")
    WebElement Hindware_Display_dropdown;
    public WebElement get_Hindware_Display_dropdown()
    {
        return Hindware_gas_type_dropdown;
    }

    @FindBy(xpath="//select[@id='sorter']")
    WebElement Hindware_Sort_By_dropdown;
    public WebElement get_Hindware_Sort_By_dropdown()
    {
        return Hindware_Sort_By_dropdown;
    }

}
