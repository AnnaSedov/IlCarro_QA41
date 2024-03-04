package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;
    @FindBy(xpath="//input[@id='dates']")
    WebElement datesField;
    @FindBy(xpath = "//button[contains(text(),'alla')]")
    WebElement YallaButton;

    public SearchPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
    }
    public SearchPage fillCityFields(String city){
        cityField.sendKeys(city);
        return this;
    }
    public SearchPage fillEmailField(String dates){
        datesField.sendKeys(dates);
        return this;
    }

}
