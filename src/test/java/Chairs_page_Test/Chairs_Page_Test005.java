package Chairs_page_Test;

import PageObjects.Chairs_Page;
import PageObjects.HomePage;
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

public class Chairs_Page_Test005 extends Baseclass
{
public WebDriver driver;
@Test(retryAnalyzer = My_Retry.class)
public void Chairs_page_primary_material_checkboxes()
{
    LoginPage lp = new LoginPage(driver);
    Actions actions = new Actions(driver);
    CommonUtilities cu = new CommonUtilities(driver);
    HomePage H = new HomePage(driver);
    Chairs_Page cp = new Chairs_Page(driver);

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
   //cu.scroll_down();
    cu.click_on_element(cp.get_Chairs());
    logger.info("successfully clicked on the Chairs");
    cu.scroll_down();
    cu.click_on_element(cp.get_chairs_primary_material_dropdown());
    logger.info("successfully clicked on the primary_material dropdown");
    logger.info("VERIFYING the checkboxes inside 'primary_material dropdown' are enabled or not");
    cu.are_checkboxes_enabled("//div[@data-role='ln_collapsible' and @attribute='primary_material']//child::input");
    logger.info("all checkboxes inside 'primary_material dropdown' are enabled");
    logger.info("VERIFYING the checkboxes inside 'primary_material dropdown' displayed or not");
    cu.are_checkboxes_dispalyed("//div[@data-role='ln_collapsible' and @attribute='primary_material']//child::input");
    logger.info("all checkboxes inside 'Chairs primary material dropdown' are displayed");
    cu.click_on_element(cp.get_chairs_primary_material_dropdown());
    logger.info("Successfully close the Chairs primary material dropdown");


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
