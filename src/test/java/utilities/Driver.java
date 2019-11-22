package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    private static WebDriver driver;
    private Driver(){}

    public static WebDriver getDriver(){
        if(driver==null){
            // WebDriverManager.chromedriver().setup();
           // driver=new ChromeDriver();
            String browser=  ConfigurationReader.getProperty("browser");
            switch (browser.trim()){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case"ied":
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver();
                    break;
            } }
        return driver;
    }
public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;//we need to make null otherwise next time use will give exception
        }
}


}
