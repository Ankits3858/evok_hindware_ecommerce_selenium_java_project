package xtent;

import com.aventstack.extentreports.ExtentTest;

public class xtentReport {
    public static ExtentTest test;
    public static final ThreadLocal<ExtentTest> extest = new ThreadLocal<ExtentTest>();
    public static ExtentTest getTest()
    {
        return extest.get();
    }
    public static void setTest(ExtentTest test)
    {
        extest.set(test);
    }
}
