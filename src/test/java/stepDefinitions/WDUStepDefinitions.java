package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WDUPage;
import utilities.Driver;

import java.util.Set;

public class WDUStepDefinitions {

    WDUPage wduPage = new WDUPage();
    String ilkSayfaHandle;
    String ikinciSayfaHandle = "";
    Faker faker = new Faker();

    @Then("kullanici Login portala kadar asagi iner")
    public void kullanici_login_portala_kadar_asagi_iner() {
        Actions actions = new Actions(Driver.getDriver());


    }

    @Then("kullanici login portal butonuna basar")
    public void kullanici_login_portal_butonuna_basar() {
        ilkSayfaHandle = Driver.getDriver().getWindowHandle();
         Set<String> tumHandledeger= Driver.getDriver().getWindowHandles();
        for (String each:tumHandledeger
             ) {
            if(!each.equals(ilkSayfaHandle)){
                ikinciSayfaHandle=each;
            }
        }
    }

    @Then("kullanici diger window'a gecer")
    public void kullanici_diger_window_a_gecer() {
    Driver.getDriver().switchTo().window(ikinciSayfaHandle);
    }
    @Then("kullanici bir username girer")
    public void kullanici_bir_username_girer() {
    wduPage.username.sendKeys(faker.name().username());
    }
    @Then("kullanici bir password girer")
    public void kullanici_bir_password_girer() {
    wduPage.password.sendKeys(faker.internet().password());
    }
    @Then("kullanici login butonuna basar")
    public void kullanici_login_butonuna_basar() {
    wduPage.loginButon.click();
    }
    @Then("kullanici Popup'ta cikan")
    public void kullanici_popup_ta_cikan() {
    String YazıText=Driver.getDriver().switchTo().alert().getText();
        System.out.println(YazıText);
    }


}
