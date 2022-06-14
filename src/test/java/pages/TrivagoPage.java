package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrivagoPage {

    public TrivagoPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[4]/header/div[1]/nav/ul/li[3]/a/span[2]")
    public WebElement flightsClick;
    @FindBy(xpath = "//*[@id=\"__next\"]/footer/div[3]/div/div/ul[2]/li[2]/a")
    public WebElement asagı;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/header/div[1]/nav/ul/li[3]/a/span[2]")
    public WebElement yukarı;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/ul/li[2]/div/label")
    public WebElement hotelClick;
    @FindBy(xpath = "//*[@id=\"input-auto-complete\"]")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[1]/div[4]/div/form/div[4]/div/div/div[2]/div/div[4]/button[2]/span/strong")
    public WebElement applyClick;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[1]/div[4]/div/form/div[3]/button/span/span")
    public WebElement search;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div[3]/div/button")
    public WebElement guestRating;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div[3]/div/div/div/div[2]/section/div/button[2]/span[2]")
    public WebElement veryGood;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div[5]/div/button")
    public WebElement moreFilters;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div[5]/div/div/div/div[2]/section/div[1]/div/button[4]/span[1]")
    public WebElement dortYıldız;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div[5]/div/div/div/div[2]/section/div[1]/div/button[5]/span[1]")
    public WebElement besYıldız;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div[5]/div/div/div/div[2]/section/ul/li[4]/div/label/span[2]")
    public WebElement beach;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[1]/div[4]/div/form/fieldset/div/div[1]/button/span/div/span/span[2]")
    public WebElement checkIn;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[1]/div[4]/div/form/fieldset/div/div[2]/button/span/div/span")
    public WebElement checkOut;
    @FindBy(xpath = "//*[@id=\"calendar-checkin-date\"]")
    public WebElement yirmiikiHaziran;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[1]/div[4]/div/form/div[4]/div/div/div[2]/div/div[3]/div/div/div/div[2]/table/tbody/tr[2]/td[4]/time/button/span")
    public WebElement altıTemmuz;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/main/div[1]/div[4]/div/form/div[2]/button/span/span[2]")
    public WebElement guestClick;




}
