package E2E_Product_Journey;

import PageObjects.E2E_Product_Journey_Page;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.CommonUtilities;
import Utilities.My_Retry;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.Baseclass;
import xtent.extent;
import xtent.xtentmanager;

import java.io.IOException;

public class E2E_Product_Journey001 extends Baseclass {
    public WebDriver driver;
    @Test(retryAnalyzer = My_Retry.class)
    public void Homepage_Broken_links() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        Actions actions = new Actions(driver);
        CommonUtilities cu = new CommonUtilities(driver);
        HomePage hp = new HomePage(driver);
        E2E_Product_Journey_Page ep = new E2E_Product_Journey_Page(driver);
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
        hp.get_search_bar();
        hp.get_search_bar().sendKeys("please do not");
        hp.get_search_bar().sendKeys(Keys.ENTER);
        ep.getOne_rs_product().click();
        System.out.println("clicked1");
        logger.info("Successfully clicked on 1 rs product");
        ep.getPincode_verification().sendKeys("110034");
        System.out.println("clicked2");
        ep.getCheck();
        System.out.println("clicked3");
        ep.getBuynow();
        System.out.println("clicked4");
        Thread.sleep(3000);
        ep.getPlace_order();
        System.out.println("clicked5");
        logger.info("order placed successfully");
    }

    @BeforeMethod
    public void Open_Application(ITestResult result) throws IOException {
        driver= initializer();
        driver.get(properties.getProperty("url"));
        ExtentTest test = xtentmanager.getInstance().createTest(result.getMethod().getMethodName());
        extent.setTest(test);

    }
    @AfterMethod
    public void closure() {
        driver.quit();
        logger.info("Browser closed successfully");

        extent.getTest().log(Status.INFO,"Browser closed successfully");
        xtentmanager.getInstance().flush();
    }
}

