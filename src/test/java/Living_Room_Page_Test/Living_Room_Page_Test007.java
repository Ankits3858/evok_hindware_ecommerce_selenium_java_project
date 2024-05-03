package Living_Room_Page_Test;

import PageObjects.HomePage;
import PageObjects.Living_Room_Page;
import PageObjects.LoginPage;
import Utilities.CommonUtilities;
import Utilities.My_Retry;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.Baseclass;
import xtent.extent;
import xtent.ss;
import xtent.xtentmanager;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Living_Room_Page_Test007 extends Baseclass {
     public WebDriver driver;
    @Test(retryAnalyzer = My_Retry.class)
    public void seating_type_filter()
    {
        LoginPage lp = new LoginPage(driver);
        Actions actions = new Actions(driver);
        CommonUtilities cu = new CommonUtilities(driver);
        HomePage H = new HomePage(driver);
        Living_Room_Page lr = new Living_Room_Page(driver);
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

        if(lp.get_Acc_Verification().isDisplayed())
        {
               logger.info("Account confirmed landed to homepage successfully");
            extent.getTest().log(Status.INFO,"Account confirmed landed to homepage successfully");
        }
        else
        {
                logger.info("Account not confirmed,unable to land on homepage");
            extent.getTest().log(Status.INFO,"Account not confirmed,unable to land on homepage");
        }
        cu.click_on_element(H.get_living_room());
        logger.info("successfully clicked on living room");
        cu.scroll_down();
        cu.click_on_element(lr.get_seating_capacity());
        logger.info("successfully clicked on seating capacity filter");
        cu.are_checkboxes_enabled("//div[@data-role='ln_collapsible' and @attribute='seatingcapacity']//child::input");
        logger.info("all the checkboxes of seating capacity filter are enabled");
        cu.are_checkboxes_dispalyed("//div[@data-role='ln_collapsible' and @attribute='seatingcapacity']//child::input");
        logger.info("all the checkboxes of seating capacity filter are displayed");
        cu.click_on_element(lr.get_seating_capacity());
        logger.info("successfully closed the seating capacity filter");
    }

    @BeforeMethod
    public void Open_Application(ITestResult result) throws IOException {
        driver= initializer();
        driver.get(properties.getProperty("url"));
        ExtentTest test = xtentmanager.getInstance().createTest(result.getMethod().getMethodName());
        extent.setTest(test);

    }
     @AfterMethod
    public void closure(ITestResult result) throws IOException {

        if(!result.isSuccess())
        {
            extent.getTest().log(Status.FAIL,"Test case got failed" +result.getThrowable());
            String screenshotpath = ss.getscreenshots(result.getMethod().getMethodName(),driver);
            byte[] file = FileUtils.readFileToByteArray(new File(screenshotpath));
            String base64img = new String(Base64.encodeBase64(file), StandardCharsets.UTF_8);
            extent.getTest().fail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64img).build());
        }

        driver.quit();
        logger.info("Browser closed successfully");
         
        extent.getTest().log(Status.INFO,"Browser closed successfully");
        xtentmanager.getInstance().flush();
    }
}