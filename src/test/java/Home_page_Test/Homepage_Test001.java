package Home_page_Test;

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

public class Homepage_Test001 extends Baseclass {
     public WebDriver driver;
    @Test(retryAnalyzer = My_Retry.class)
    public void Homepage_hover_test()
    {
        LoginPage lp = new LoginPage(driver);
        HomePage H = new HomePage(driver);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).build().perform();
        lp.getSignin().click();
        lp.getEmail().sendKeys(properties.getProperty("email"));
        lp.getPassword().sendKeys(properties.getProperty("password"));
        lp.getLoginButton().click();
        actions.sendKeys(Keys.ESCAPE).build().perform();
        CommonUtilities cl = new CommonUtilities(driver);
        cl.Hover(H.get_Furniture());
        if(H.getFurniture_hover_menu_attribute().isDisplayed())
            logger.info("Successfully hover to Furniture");
        else
            logger.info("Hover to furniture not working");
        cl.Hover(H.get_Sofa_and_recliner());
        if(H.get_Sofa_and_recliner_hover_menu_attribute().isDisplayed())
            logger.info("Successfully hover to sofas and recliners");
        else
            logger.info("Hover to sofas and recliners not working");
        cl.Hover(H.get_Dining());
        if(H.get_Dining_Hover_menu().isDisplayed())
            logger.info("Successfully hover to Dining");
        else
            logger.info("Hover to Dining not working");


       //cl.Hover(H.get_Work_from_home());

      //if(H.get_WFH_Hover_Menu().isDisplayed())
      //logger.info("Successfully hover to work from home");
      //else
      //logger.info("Hover to work from home not working");
        cl.Hover(H.get_Decor());
        if(H.get_Decor_Hover_menu().isDisplayed())
            logger.info("Successfully hover to Decor");
        else
            logger.info("Hover to Decor not working");


        cl.move_to_element(H.get_Hindware());
        if(H.get_Hindware_Hover_menu().isDisplayed())
            logger.info("Successfully hover to Hindware");
        else
            logger.info("Hover to Hindware not working");
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
