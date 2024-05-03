package xtent;

import com.aventstack.extentreports.ExtentTest;

public class extent {
    public static ExtentTest test;
   // private  static  final ThreadLocal<ExtentTest> Extenttest = new ThreadLocal<ExtentTest>();
    public static ExtentTest getTest()
    {
        return test;
    }
    public static ExtentTest geturl(String s)
    {
        return test;
    }
    public static void setTest(ExtentTest test)
    {
        //test.set(test);
       extent.test = test;

    }
}
