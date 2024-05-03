package xtent;

import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Btest {
    @AfterSuite
    public void tearDown()
    {
        xtentmanager.getInstance().flush();
    }

    @BeforeMethod
    public void setUp(ITestResult result)
    {
        ExtentTest test = xtentmanager.getInstance().createTest(result.getMethod().getMethodName());
        extent.setTest(test);
    }
}
