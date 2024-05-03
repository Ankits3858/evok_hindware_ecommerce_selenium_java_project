package Utilities;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.Baseclass;
import xtent.extent;
import xtent.xtentmanager;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class CommonUtilities extends Baseclass {
    public WebDriver driver;

    public CommonUtilities(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void move_to_element(WebElement webElement) {

        Actions act = new Actions(driver);
        act.moveToElement(webElement).click().build().perform();
    }


    public void Hover(WebElement element) {

        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }


    public void Broken_url() {
        String ANSI_RESET = "\u001B[0m";

        String ANSI_RED = "\u001B[41m";

        List<WebElement> elements = driver.findElements(By.tagName("a"));

        for (WebElement element : elements) {

            String URL = element.getAttribute("href");

            System.out.println("-------------------------");


            if (URL == null || URL.isEmpty()) {

                System.out.println("URL is empty");

                continue;

            }

            HttpURLConnection huc;
            try {
                huc = (HttpURLConnection) (new URL(URL).openConnection());
                huc.connect();

                if (huc.getResponseCode() >= 400) {

                    System.out.println(ANSI_RED + URL + " is broken link/url" + ANSI_RESET);
                    extent.geturl(URL + " is broken link/url");
                    extent.getTest().log(Status.WARNING, "This a broken url:   " + URL);


                } else {

                    System.out.println(URL + " is a valid link/url");

                }
            } catch (MalformedURLException e) {

                e.printStackTrace();
            } catch (IOException e) {

                e.printStackTrace();
            }


        }

    }

    public void Broken_image() {
        String ANSI_RESET = "\u001B[0m";

        String ANSI_RED = "\u001B[41m";

        List<WebElement> elements = driver.findElements(By.tagName("img"));

        for (WebElement element : elements) {
            String URL = element.getAttribute("src");
            System.out.println("-------------------------");

            if (URL == null || URL.isEmpty()) {
                System.out.println("URL is empty");
                continue;
            }

            HttpURLConnection huc;
            try {
                huc = (HttpURLConnection) (new URL(URL).openConnection());
                huc.connect();

                if (huc.getResponseCode() >= 400) {

                    System.out.println(ANSI_RED + URL + " is broken image" + ANSI_RESET);
                    // ExtentTest log = extent.getTest().log(Status.INFO, +URL + "This is a broken image");
                    extent.getTest().log(Status.WARNING, "This a broken image link:   " + URL);

                } else {
                    System.out.println(URL + " is a valid image");
                }
            } catch (MalformedURLException e) {

                e.printStackTrace();
            } catch (IOException e) {

                e.printStackTrace();
            }


        }
        xtentmanager.getInstance().flush();
    }

    public void Scroll_till_webelement_found(WebElement ele) throws InterruptedException {
        WebElement element = ele;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);


    }

    public void click_on_element(WebElement element) {
        element.click();
    }

    //checkbox is enabled or not
    public void is_enabled(WebElement ele) {
        if (ele.isEnabled()) System.out.println("Webelement is enabled");
        else System.out.println("Webelement is not enabled");
    }


    //checkbox is displayed or not
    public void is_displayed(WebElement ele) {
        if (ele.isDisplayed()) System.out.println("Webelement is enabled");
        else System.out.println("Webelement is not enabled");
    }

    //checkbox is selectable or not
    public void is_selectable(WebElement ele) {
        if (ele.isSelected()) System.out.println("Webelement is enabled");
        else System.out.println("Webelement is not enabled");
    }

    //Webelement is clickable or not
    public boolean is_clickable(WebElement ele) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void scroll_down() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,500)", "");

    }

    public void scroll_down_as_needed(String s, String m) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript(s, m);

    }






    public void scroll_up() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,-500)", "");

    }

    public void are_checkboxes_enabled(String xpath) {

        String ANSI_RESET = "\u001B[0m";

        String ANSI_RED = "\u001B[41m";
        String ANSI_GREEN = "\u001B[42m";
        List<WebElement> checkboxes = driver.findElements(By.xpath(xpath));
        int size = checkboxes.size();
        int i = 0;
        System.out.println("Total checkboxes/option present in this filter are:    " + size);
        for (WebElement options : checkboxes) {
            if (options.isEnabled()) {
                System.out.println(ANSI_GREEN + ++i + "  -checkbox/option enabled" + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + ++i + "  -checkbox/option not enabled" + ANSI_RESET);
            }
        }
    }
    // method to check whether the checkboxes are enabled
    public void are_checkboxes_dispalyed(String xpath) {

        String ANSI_RESET = "\u001B[0m";

        String ANSI_RED = "\u001B[41m";
        String ANSI_GREEN = "\u001B[42m";


        List<WebElement> checkboxes = driver.findElements(By.xpath(xpath));
        int size = checkboxes.size();
        System.out.println("Total checkboxes/options present in this filter are:    " + size);
        extent.getTest().log(Status.INFO, "Total checkboxes/option present in this filter  " + size);
        for (WebElement options : checkboxes) {
            int i = 0;
            if (options.isDisplayed()) {
                System.out.println(ANSI_GREEN + ++i + "  -checkbox/option displayed" + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + ++i + "  -checkbox/option not displayed" + ANSI_RESET);
            }
        }
    }

}
