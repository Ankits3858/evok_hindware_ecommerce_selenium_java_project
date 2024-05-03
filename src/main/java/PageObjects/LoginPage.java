package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="email")
    WebElement email;

    public WebElement getEmail() {
        return email;
    }
    @FindBy(id = "pass")
    WebElement password;
    public WebElement getPassword()
    {
        return password;
    }
    @FindBy(xpath= "//*[@id=\"send2\"]/span")
    WebElement loginButton;
    public WebElement getLoginButton()
    {
        return loginButton;
    }
    @FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
    WebElement Signin;
    public WebElement getSignin()
    {
        return Signin;
    }
    @FindBy(id ="(//button[@data-role='closeBtn'])[1]")
    WebElement popup;

    public WebElement get_popup() {
        return popup;
    }

    @FindBy(xpath = "//body/div[@class='page-wrapper']/header[@class='page-header']/div[@class='panel wrapper']/div[@class='panel header']/ul[@class='header links']/li[1]")
    WebElement AccountVerification;
    public WebElement get_Acc_Verification()
    {
        return AccountVerification;
    }

    @FindBy(xpath = "//span[normalize-space()='Forgot Your Password']")
    WebElement Forget_password;
    public WebElement getForgot_password()
    {
        return Forget_password;
    }


    @FindBy(xpath = "//span[normalize-space()='New User? Register']")
    WebElement new_user;
    public WebElement get_new_user_register()
    {
        return new_user;
    }
}
