package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Herokuapp1Page {
    public Herokuapp1Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[10]/a")
    public WebElement draganddrop;
    @FindBy(xpath = "//*[text()='A']")
    public WebElement boxA;
    @FindBy(xpath = "//*[text()='B']")
    public WebElement boxB;
    @FindBy(xpath = "//*[@id=\"page-footer\"]/div/div/a")
    public WebElement elemenatalSeleniumClick;
    @FindBy(xpath = "/html/body/header/div/div/p/a")
    public WebElement sauceLabsClick;
    @FindBy(xpath = "//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[6]/div[1]/div/a")
    public WebElement contact;
    @FindBy(xpath = "//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[2]/li[6]/div[2]/div/div/div/ul/li/div/ul/li[2]/div/ul/li[1]/div/ul/li/a/span")
    public WebElement contactSupport;

}
