package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SignUpPage extends BasePage{
@FindBy(xpath = "//input[@id(text(),'name')]")
    WebElement nameField;
    @FindBy(xpath = "//input[@id(text(),'lastName')]")
    WebElement lastNameField;
    @FindBy(xpath = "//input[@id(text(),'email'")
    WebElement emailField;

    @FindBy(xpath = "//input[@id(text(),'password'")
    WebElement passwordField;
    @FindBy(xpath = "//input[@id(text(),'terms-of-use'")
    WebElement termsOfUseField;

    @FindBy(xpath = "//button[contains(text(),'alla')]")
    WebElement YallaButton;
    public SignUpPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
    }

}
