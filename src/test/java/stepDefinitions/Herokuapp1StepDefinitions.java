package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Herokuapp1Page;
import utilities.Driver;

import java.util.Set;

public class Herokuapp1StepDefinitions {
    Actions action=new Actions(Driver.getDriver());
    Herokuapp1Page hrokpge=new Herokuapp1Page();
    String ilkhandleDeger=Driver.getDriver().getWindowHandle();

    @Then("kullanici draganddrop mouse action ile sağ tıklayıp yeni sekmede açar")
    public void kullanici_draganddrop_mouse_action_ile_sağ_tıklayıp_yeni_sekmede_açar() {
       String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
       hrokpge.draganddrop.sendKeys(selectLinkOpeninNewTab);
        //hrokpge.draganddrop.sendKeys(Keys.CONTROL + "t");

        String ilkhandleDeger=Driver.getDriver().getWindowHandle();
        Set<String> tumHandleDegerler=Driver.getDriver().getWindowHandles();
        String ikiniciHandledeger="";
        for (String each:tumHandleDegerler
             ) {
            if(!each.equals(ilkhandleDeger)){
                ikiniciHandledeger=each;
            }
        }
        Driver.getDriver().switchTo().window(ikiniciHandledeger);
    }

    @Then("kullanici drag and drop islemini yap mouse action ile degisen degerleri test et")
    public void kullanici_drag_and_drop_islemini_yap_mouse_action_ile_degisen_degerleri_test_et() throws InterruptedException {

        String ilkboxDeger=hrokpge.boxA.getText();
        System.out.println(ilkboxDeger);
        Thread.sleep(2);
        action.dragAndDrop(hrokpge.boxA, hrokpge.boxB).perform();
        String ilkboxİkiniciDeger=hrokpge.boxA.getText();
        System.out.println(ilkboxİkiniciDeger);

    }

    @Then("kullanici elemenatal selenium ile yeni acılan sekmenin windowhandle değerini yazar")
    public void kullanici_elemenatal_selenium_ile_yeni_acılan_sekmenin_windowhandle_değerini_yazar() {
        action.click(hrokpge.elemenatalSeleniumClick).perform();
        String ikinciHandledeger=Driver.getDriver().getWindowHandle();
        String ucuncuHandleDeger="";
        Set<String>tumHandleDegerler=Driver.getDriver().getWindowHandles();
        for (String each:tumHandleDegerler
             ) {
            if(!each.equals(ikinciHandledeger)){
                ucuncuHandleDeger=each;
            }
        }
        Driver.getDriver().switchTo().window(ucuncuHandleDeger);
    }

    @Then("kullanici ponsored by Sauce Labs'a log_in_yazisina_tiklar")
    public void kullanici_ponsored_by_sauce_labs_a_log_in_yazisina_tiklar() {
        String ucuncuHandleDeger=Driver.getDriver().getWindowHandle();
        hrokpge.sauceLabsClick.click();
        String dorduncuHandleDeger="";
        Set<String>tumHandleDegerler=Driver.getDriver().getWindowHandles();
        for (String each:tumHandleDegerler
             ) {
            if(!each.equals(ucuncuHandleDeger)){
                dorduncuHandleDeger=each;
            }
        }
        Driver.getDriver().switchTo().window(dorduncuHandleDeger);
    }

    @Then("kullanici contact'in üzerine gelip contact support'u tiklar")
    public void kullanici_contact_in_üzerine_gelip_contact_support_u_tiklar() {
    action.moveToElement(hrokpge.contact).click(hrokpge.contactSupport).perform();

    }

    @Then("kullanici ilk sayfaya geri döner")
    public void kullanici_ilk_sayfaya_geri_döner() {
    Driver.getDriver().switchTo().window(ilkhandleDeger);
    }
}
