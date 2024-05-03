package Utilities;

import PageObjects.LoginPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import resources.Baseclass;

import java.io.IOException;

public class Login_class extends Baseclass {
    public WebDriver driver;
    public void Login_class() throws IOException {
        driver= initializer();
        driver.get(properties.getProperty("url"));
    LoginPage lp = new LoginPage(driver);
    Actions actions = new Actions(driver);
    CommonUtilities cu = new CommonUtilities(driver);
        actions.sendKeys(Keys.ESCAPE).build().perform();
        logger.info("successfully landed to the homepage");
        lp.getSignin().click();
        logger.info("Successfully clicked to Sign in");

        lp.getEmail().sendKeys(properties.getProperty("email"));
        logger.info("Successfully entered inside email field");

        lp.getPassword().sendKeys(properties.getProperty("password"));
        logger.info("Successfully entered inside email field");
        lp.getLoginButton().click();
        logger.info("Successfully clicked on Login button");
        actions.sendKeys(Keys.ESCAPE).build().perform();
        System.out.println(lp.get_Acc_Verification().isDisplayed());
}}
