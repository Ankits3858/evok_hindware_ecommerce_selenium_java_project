package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[normalize-space()='Living room']")
    WebElement livingroom;

    public WebElement get_living_room() {
        return livingroom;
    }

    @FindBy(xpath = "//ul[contains(@class,'sticker')]//a[@class='level-top']//span[contains(text(),'FURNITURE')]")
    WebElement Furniture;

    public WebElement get_Furniture() {
        return Furniture;
    }


    @FindBy(xpath = "//ul[contains(@class,'sticker')]//span[contains(text(),'SOFAS & RECLINERS')]")
    WebElement Sofa_and_recliner;

    public WebElement get_Sofa_and_recliner() {
        return Sofa_and_recliner;
    }

    @FindBy(xpath = "//ul[contains(@class,'sticker')]//span[contains(text(),'BEDS & WARDROBES')]")
    WebElement Beds_wardrobe;

    public WebElement get_Beds_wardrobe() {
        return Beds_wardrobe;
    }

    @FindBy(xpath = "//ul[contains(@class,'sticker')]//a[contains(@class,'level-top')]//span[contains(text(),'Dining')]")
    WebElement Dining;

    public WebElement get_Dining() {
        return Dining;
    }

    @FindBy(xpath = "//a[@class='logo'] / img")
    private WebElement Company_Logo;

    public WebElement get_Company_Logo() {
        return Company_Logo;
    }

    @FindBy(xpath = "//ul[contains(@class,'sticker')]//a[contains(@class,'level-top')]//span[contains(text(),'WORK FROM HOME')]")
    WebElement Work_from_home;

    public WebElement get_Work_from_home() {
        return Work_from_home;
    }

    @FindBy(xpath = "//ul[contains(@class,'sticker')]//a[@class='level-top']//span[contains(text(),'DECOR')]")
    WebElement Decor;

    public WebElement get_Decor() {
        return Decor;
    }


    @FindBy(xpath = "//ul[contains(@class,'sticker')]//span[contains(text(),'HINDWARE APPLIANCES')]")
    WebElement Hindware;

    public WebElement get_Hindware() {
        return Hindware;
    }


    @FindBy(xpath = "//span[contains(text(),'LIVING ROOM')]")
    WebElement Furniture_hover_menu;

    public WebElement getFurniture_hover_menu_attribute() {
        return Furniture_hover_menu;
    }

    @FindBy(xpath = "(//span[contains(text(),'SOFAS')])[2]")
    WebElement Sofas_and_recliners_menu;

    public WebElement get_Sofa_and_recliner_hover_menu_attribute() {
        return Sofas_and_recliners_menu;
    }

    @FindBy(xpath = "(//span[contains(text(),'Beds')])[1]")
    WebElement Beds_and_wardrobe_menu;

    public WebElement get_Beds_and_wardrobe_Hover_menu() {
        return Beds_and_wardrobe_menu;
    }


    @FindBy(xpath = "(//span[contains(text(),'Dining Set')])[1]")
    WebElement Dining_menu;

    public WebElement get_Dining_Hover_menu() {
        return Dining_menu;
    }

    @FindBy(xpath = "(//span[contains(text(),'Office Chairs')])[1]")
    WebElement WfH_menu;

    public WebElement get_WFH_Hover_Menu() {
        return WfH_menu;
    }

    @FindBy(xpath = "(//span[contains(text(),'Candle Stands & Holders')])[1]")
    WebElement Decor_Hover_menu;

    public WebElement get_Decor_Hover_menu() {
        return Decor_Hover_menu;
    }

    @FindBy(xpath = "(//span[contains(text(),'CHIMNEY')])[1]")
    WebElement Hindware_Hover_menu;

    public WebElement get_Hindware_Hover_menu() {
        return Hindware_Hover_menu;
    }


    @FindBy(xpath = "//div[@class='row']//div[1]//a[1]//button[1]")
    WebElement Read_more1;

    public WebElement get_read_more1() {
        return Read_more1;
    }

    @FindBy(xpath = "//div[@class='desktop-blog']//div[@class='row']//div[1]//a[1]")
    WebElement Read_more2;

    public WebElement get_read_more2() {
        return Read_more2;
    }


    @FindBy(xpath = "//a[@href='https://blog.evok.in/']//span[contains(text(),'Read More')]")
    WebElement Read_more3;

    public WebElement get_read_more3() {
        return Read_more3;
    }

    @FindBy(xpath = "//p[normalize-space()='Photo Frames']")
    WebElement photo_frames;

    public WebElement get_photo_frames() {
        return photo_frames;
    }

    @FindBy(xpath = "//p[normalize-space()='Figurines']")
    WebElement figurines;

    public WebElement get_figurines() {
        return figurines;
    }

    @FindBy(xpath = "//p[normalize-space()='Flower Vases']")
    WebElement flower_Vases;

    public WebElement get_flower_vases() {
        return flower_Vases;
    }

    @FindBy(xpath = "//p[normalize-space()='Ceiling Lamp']")
    WebElement ceiling;

    public WebElement get_ceiling() {
        return ceiling;
    }

    @FindBy(xpath = "//p[normalize-space()='Beanbags']")
    WebElement beanbags;

    public WebElement get_beanbags() {
        return beanbags;
    }

    @FindBy(xpath = "//p[normalize-space()='Carpets']")
    WebElement carpets;

    public WebElement get_carpets() {
        return carpets;
    }


    @FindBy(xpath = "//p[normalize-space()='Wall Hooks']")
    WebElement wall_hooks;

    public WebElement get_wall_hooks() {
        return wall_hooks;
    }


    @FindBy(xpath = "//p[normalize-space()='Wall Mirror']")
    WebElement wall_mirror;

    public WebElement get_wall_mirror() {
        return wall_mirror;
    }

    @FindBy(xpath = "//p[normalize-space()='Bed Sheets']")
    WebElement bedsheets;

    public WebElement get_bedsheets() {
        return bedsheets;
    }

    @FindBy(xpath = "//p[normalize-space()='Table Lamps']")
    WebElement table_lamps;

    public WebElement get_table_lamps() {
        return table_lamps;
    }

    @FindBy(xpath = "//p[normalize-space()='Wall Art']")
    WebElement wall_art;

    public WebElement get_wall_art() {
        return wall_art;
    }

    @FindBy(xpath = "//p[normalize-space()='WallClock']")
    WebElement wallclock;

    public WebElement get_wall_clock() {
        return wallclock;
    }

    @FindBy(xpath = "//input[@id='search']")
    WebElement searchbar;
    public WebElement get_search_bar()
    {
        return searchbar;
    }


}
