package Dining_Page_Test;

import PageObjects.Dining_Page;
import PageObjects.LoginPage;
import Utilities.CommonUtilities;
import Utilities.My_Retry;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.Baseclass;
import xtent.extent;

import java.io.IOException;

public class Dining_Page_Test004 extends Baseclass {
    public WebDriver driver;

    @Test(retryAnalyzer = My_Retry.class)
    public void Dining_Page_Color_filter_test() {
        LoginPage lp = new LoginPage(driver);
        Actions actions = new Actions(driver);
        CommonUtilities cu = new CommonUtilities(driver);
        Dining_Page D = new Dining_Page(driver);


        actions.sendKeys(Keys.ESCAPE).build().perform();
        logger.info("successfully landed to the homepage");
extent.getTest().log(Status.INFO,"successfully landed to the homepage");
        lp.getSignin().click();
       logger.info("Successfully clicked to Sign in");
        extent.getTest().log(Status.INFO,"Successfully clicked to Sign in");


        lp.getEmail().sendKeys(properties.getProperty("email"));
         logger.info("Successfully entered inside email field");
        extent.getTest().log(Status.INFO,"Successfully entered inside email field");

          logger.info("Successfully clicked to password");
        extent.getTest().log(Status.INFO,"Successfully clicked to password");
        lp.getPassword().sendKeys(properties.getProperty("password"));
       logger.info("Successfully entered inside password field");
        extent.getTest().log(Status.INFO,"Successfully entered inside password field");
        cu.is_clickable(lp.getLoginButton());
        lp.getLoginButton().click();
         logger.info("Successfully clicked on Login button");
        extent.getTest().log(Status.INFO,"Successfully clicked on Login button");
        actions.sendKeys(Keys.ESCAPE).build().perform();
        if (lp.get_Acc_Verification().isDisplayed()) {
               logger.info("Account confirmed landed to homepage successfully");
            extent.getTest().log(Status.INFO,"Account confirmed landed to homepage successfully");
        } else {
                logger.info("Account not confirmed,unable to land on homepage");
            extent.getTest().log(Status.INFO,"Account not confirmed,unable to land on homepage");
        }
       // cu.scroll_down();
        cu.click_on_element(D.get_Dining());
        logger.info("successfully clicked on the Dining");
        cu.click_on_element(D.get_Dining_color_dropdown());
        logger.info("successfully clicked on the Dining color dropdown");
        logger.info("VERIFYING the checkboxes inside 'Dining color dropdown' are displayed or not");
        cu.are_checkboxes_dispalyed("//div[@data-role='ln_collapsible' and @attribute='color']//child::input");
        logger.info("ALL checkboxes inside 'Dining color type dropdown' are displayed");
        logger.info("VERIFYING the checkboxes inside 'Dining color type dropdown' enabled or not");
        cu.are_checkboxes_enabled("//div[@data-role='ln_collapsible' and @attribute='color']//child::input");
        logger.info("ALL checkboxes inside 'Dining color dropdown' are enabled");


    }

    @BeforeMethod
    public void Open_Application() throws IOException {
        driver = initializer();
        driver.get(properties.getProperty("url"));

    }

    @AfterMethod
    public void closure() {
        driver.close();
    }
}

