package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
    static ExtentReports extentReport;
    public static ExtentReports getExtentReport()
    {
        String extentReportPath = System.getProperty("user.dir")+"\\reports\\extentreport.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
        reporter.config().setReportName("Automation results");
        reporter.config().setDocumentTitle("Test results");
        extentReport =  new ExtentReports();
        extentReport.attachReporter(reporter);
        extentReport.setSystemInfo("Operating System","windows 10");
        extentReport.setSystemInfo("Tested By","Ankit");
        return extentReport;
    }
}
