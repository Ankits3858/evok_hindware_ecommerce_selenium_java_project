package Login_Test;

import PageObjects.LoginPage;
import Utilities.CommonUtilities;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resources.Baseclass;
import xtent.extent;
import xtent.ss;
import xtent.xtentmanager;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class Login_Test001 extends Baseclass {
    public WebDriver driver;
    @Test(dataProvider = "get_Login_data")
    public void login(String email, String password, String expected_result) throws IOException {

     LoginPage lp = new LoginPage(driver);
     Actions actions = new Actions(driver);
     CommonUtilities cu = new CommonUtilities(driver);
     actions.sendKeys(Keys.ESCAPE).build().perform();
     logger.info("successfully landed to the homepage");
extent.getTest().log(Status.INFO,"successfully landed to the homepage");
     lp.getSignin().click();
    logger.info("Successfully clicked to Sign in");
        extent.getTest().log(Status.INFO,"Successfully clicked to Sign in");


     lp.getEmail().sendKeys(email);
      logger.info("Successfully entered inside email field");
        extent.getTest().log(Status.INFO,"Successfully entered inside email field");

          logger.info("Successfully clicked to password");
        extent.getTest().log(Status.INFO,"Successfully clicked to password");
        lp.getPassword().sendKeys(password);
       logger.info("Successfully entered inside password field");
        extent.getTest().log(Status.INFO,"Successfully entered inside password field");
        cu.is_clickable(lp.getLoginButton());
        lp.getLoginButton().click();
         logger.info("Successfully clicked on Login button");
        extent.getTest().log(Status.INFO,"Successfully clicked on Login button");
        actions.sendKeys(Keys.ESCAPE).build().perform();
        String actual_result;
        try
        {
            if (lp.get_Acc_Verification().isDisplayed());
            {
                actual_result = "successful";
            }
        }
        catch(Exception e)
        {
            actual_result ="Failure";
        }

        Assert.assertEquals(actual_result,expected_result);
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
    @DataProvider
    public Object[][] get_Login_data() {
       Object[][] data = {{"kumar.ankit@orangemantra.in", "Testing@1234!", "successful"}, {"dummy@Test(retryAnalyzer = My_Retry.class).com", "123456t", "Failure"},{"kumar.ankit@orangemantra.in","123456t","Failure"}};
       return data;

    }


}