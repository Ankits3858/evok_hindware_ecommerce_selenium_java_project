package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Living_Room_Page {
    WebDriver driver;
    public  Living_Room_Page(WebDriver driver)
    {
         this.driver=driver;
        PageFactory.initElements(driver,this);

    }

@FindBy(id="dynamicsubtext")
    WebElement living_room_page_confirmation;
    public WebElement get_living_room_page_confirmation()
    {
        return living_room_page_confirmation;
    }

 @FindBy(xpath = "//div[normalize-space()='Category']")
    WebElement category;
    public WebElement get_category_filter()
    {
        return category;
    }

    @FindBy(xpath = "//div[normalize-space()='Color']")
    WebElement color;
    public WebElement get_color_filter()
    {
        return color;
    }

    @FindBy(xpath = "//div[normalize-space()='Finish Type']")
    WebElement finish_type;
    public WebElement get_finish_type()
    {
        return finish_type;
    }

    @FindBy(xpath = "//div[normalize-space()='Primary Material']")
    WebElement primary_material;
    public WebElement get_primary_material()
    {
        return primary_material;
    }

    @FindBy(xpath = "//div[normalize-space()='seating_capacity']")
    WebElement seating_capacity;
    public WebElement get_seating_capacity()
    {
        return seating_capacity;
    }

    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement LivingRoom_page_sort_by_filter;
    public WebElement get_LivingRoom_page_sort_by_filter()
    {
        return LivingRoom_page_sort_by_filter;
    }

    @FindBy(xpath = "//option[@value='position']")
    WebElement LivingRoom_page_sort_by_filter_position;
    public WebElement get_LivingRoom_page_sort_by_filter_position()
    {
        return LivingRoom_page_sort_by_filter_position;
    }

    @FindBy(xpath = "//option[@value='name']")
    WebElement LivingRoom_page_sort_by_filter_name;
    public WebElement get_LivingRoom_page_sort_by_filter_name()
    {
        return LivingRoom_page_sort_by_filter_name;
    }


    @FindBy(xpath = "//option[@value='price']")
    WebElement LivingRoom_page_sort_by_filter_price;
    public WebElement get_LivingRoom_page_sort_by_filter_price()
    {
        return LivingRoom_page_sort_by_filter_price;
    }

    @FindBy(xpath = "//option[@value='color']")
    WebElement LivingRoom_page_sort_by_filter_color;
    public WebElement get_LivingRoom_page_sort_by_filter_color()
    {
        return LivingRoom_page_sort_by_filter_color;
    }


    @FindBy(xpath = "//option[@value='category1']")
    WebElement LivingRoom_page_sort_by_filter_category;
    public WebElement get_LivingRoom_page_sort_by_filter_category()
    {
        return LivingRoom_page_sort_by_filter_category;
    }


@FindAll(@FindBy(xpath = "(//select[@id='sorter'])[1]"))
    List<WebElement> all_elements;
    public WebElement get_all_elements()
    {
        return (WebElement) all_elements;
    }







}
