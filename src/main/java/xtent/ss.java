package xtent;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ss
{

    public  static String getscreenshots(String imagename,WebDriver driver) throws IOException
    {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File f = ts.getScreenshotAs(OutputType.FILE);
        String filepath = "./screenshot_path/" +imagename +".jpg";
        FileUtils.copyFile(f,new File(filepath));
        return filepath;



    }


}
