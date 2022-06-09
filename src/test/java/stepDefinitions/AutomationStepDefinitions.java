package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepDefinitions {
    AutomationPage automationPage=new AutomationPage();
    Faker fake=new Faker();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
    automationPage.singInButton.click();
    }
    @Given("user Create and account bölümüne email adresi girer")
    public void user_create_and_account_bölümüne_email_adresi_girer() {
    automationPage.emailTextBox.sendKeys(fake.internet().emailAddress());
    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
    automationPage.createAccountButton.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

        Actions action=new Actions(Driver.getDriver());
        action.click(automationPage.gender).sendKeys(Keys.TAB)
                .sendKeys(fake.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(fake.name().lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(fake.internet().password()).sendKeys(Keys.TAB).
                sendKeys("10").sendKeys(Keys.TAB).
                sendKeys("January").sendKeys(Keys.TAB).
                sendKeys("2000").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(fake.company().name()).sendKeys(Keys.TAB).
                sendKeys(fake.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(fake.address().city()).sendKeys(Keys.TAB).
                sendKeys("Alaska").sendKeys(Keys.TAB).sendKeys(fake.address().zipCode()).sendKeys(Keys.TAB).
                sendKeys(fake.country().name()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(fake.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).
                sendKeys(fake.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).sendKeys("ALSK").perform();
    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
    automationPage.registerButton.click();
    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        Assert.assertTrue(automationPage.positiveResultText.isDisplayed());
    }
}
