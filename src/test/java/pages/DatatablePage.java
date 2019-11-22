package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatatablePage {
    WebDriver driver;
    public DatatablePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
   @ FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;
    @FindBy(xpath = "//div[@class='DTE_Header']")
    public WebElement header;
    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;
    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement position;
    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement office;
    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extention;
    @FindBy(id = "DTE_Field_start_date")
    public WebElement startDate;
    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salary;
    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;
    @FindBy(xpath = "//input[@type='search']")
    public  WebElement search;
    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement firstResult;


}
