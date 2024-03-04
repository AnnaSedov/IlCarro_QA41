package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LetPage extends BasePage{
    @FindBy(xpath = "//input[@id='pickUpPlace']")
    WebElement pickUpPlaceField;
    @FindBy(xpath="//input[@id='make']") ////input[@id="pickUpPlace"]
    WebElement makeField;
    @FindBy(xpath = "//input[@id='model']")
    WebElement modelField;
    @FindBy(xpath="//input[@id='year']") ////input[@id="pickUpPlace"]
    WebElement yearField;
    @FindBy(xpath = "//input[@id='seats']")
    WebElement seatsField;
    @FindBy(xpath="//input[@id='class']") ////input[@id="pickUpPlace"]
    WebElement classField;
    @FindBy(xpath = "//input[@id='serialNumber']")
    WebElement serialNumberField;
    @FindBy(xpath="//input[@id='price']") ////input[@id="pickUpPlace"]
    WebElement priceField;
    @FindBy(xpath = "//input[@id='photo']")
    WebElement photoField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement YallaButton;
    public LetPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
    }
}
