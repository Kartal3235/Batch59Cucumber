package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WDUPage {
    public WDUPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//div[@class='section-title'])[2]")
    public WebElement loginPortal;

    @FindBy (xpath = "//input[@id='text']")
    public WebElement username;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement loginButon;

}
