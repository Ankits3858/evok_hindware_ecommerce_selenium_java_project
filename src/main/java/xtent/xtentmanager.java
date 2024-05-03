package xtent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class xtentmanager {
     static ExtentReports report;

    public static ExtentReports getInstance() {
        if (report == null) {

            ExtentSparkReporter spark = new ExtentSparkReporter("Evok_Hindware_TestCase_Report.html");
            report = new ExtentReports();

            spark.config().setTheme(Theme.DARK);

            spark.config().setReportName("EVOK_Automation_Test_report");
            report.attachReporter(spark);
            ExtentTest test = report.createTest("Evok");
            report.flush();
        }
        return report;
    }
}

