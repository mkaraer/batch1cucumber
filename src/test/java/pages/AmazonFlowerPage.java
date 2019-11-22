package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



    public class AmazonFlowerPage {
        WebDriver driver;
        public AmazonFlowerPage() {
            driver = Driver.getDriver();
            PageFactory.initElements(driver, this);
        }
            @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
                    public WebElement researchBox;
        @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
        public WebElement headtitle;





}
