package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import pages.RediffPage;
import utilities.Driver;

public class RediffStepDefinitions {
     RediffPage redif=new RediffPage();
    @Then("kullanici en alt sayfaya  gelip bussines butonunu tıklar")
    public void kullanici_en_alt_sayfaya_gelip_bussines_butonunu_tıklar() {

        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse. executeScript ( "arguments[0].scrollIntoView(true);" , redif.bussinesClick ) ;
        jse.executeScript("arguments[0].click();",redif.bussinesClick);
    }
    @Then("kullanici tekrar geri gelir")
    public void kullanici_tekrar_geri_gelir() {

    }
    @Then("kullanici div conteiner'lar icinden tab yardimiyla searchbox kismina gelip dolar kurunu arat")
    public void kullanici_div_conteiner_lar_icinden_tab_yardimiyla_searchbox_kismina_gelip_dolar_kurunu_arat() {

    }
    @Then("kullanici kur iframe'i icinde dolar'in guncel kurunu aratır")
    public void kullanici_kur_iframe_i_icinde_dolar_in_guncel_kurunu_aratır() {

    }
    @Then("kullanici cıkan sonucu yazdırır")
    public void kullanici_cıkan_sonucu_yazdırır() {

    }
    @Then("kullanici diger iframe gecip sag altta bulunan google advertisemnt'a gidip cikan ürünün title ve degerini yazdir")
    public void kullanici_diger_iframe_gecip_sag_altta_bulunan_google_advertisemnt_a_gidip_cikan_ürünün_title_ve_degerini_yazdir() {

    }
    @Then("kullanici  reddif sitesine geri gelir")
    public void kullanici_reddif_sitesine_geri_gelir() {

    }
}
