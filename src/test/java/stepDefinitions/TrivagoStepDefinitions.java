package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrivagoPage;
import utilities.Driver;

import java.util.Set;

public class TrivagoStepDefinitions {

    TrivagoPage trivago=new TrivagoPage();
    Actions action=new Actions(Driver.getDriver());
    String ilkHandle=Driver.getDriver().getWindowHandle();
    @Then("kullanici Tepe menüdeki Flights linkine tıklar")
    public void kullanici_tepe_menüdeki_flights_linkine_tıklar() {
        String ilkHandle=Driver.getDriver().getWindowHandle();
        trivago.flightsClick.click();
    }
    @Then("kullanici  yeni sekmede açılacak. Oraya gidecek.")
    public void kullanici_yeni_sekmede_açılacak_oraya_gidecek() {
        String ikinciHandle="";
        Set<String>tumHandle=Driver.getDriver().getWindowHandles();
        for (String each:tumHandle
             ) {
            if(!each.equals(ilkHandle)){
                ikinciHandle=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciHandle);

    }
    @Then("kullanici sayfayi asağiya kaydır sonra tekrar en yukarı kaydır")
    public void kullanici_sayfayi_asağiya_kaydır_sonra_tekrar_en_yukarı_kaydır() {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",trivago.asagı);
        jse.executeScript("arguments[0].scrollIntoView(true);",trivago.yukarı);
    }
    @Then("kullanici {string} anasayfasina gider")
    public void kullanici_anasayfasina_gider(String string) {
    Driver.getDriver().switchTo().window(ilkHandle);
    }
    @Then("kullanici All stays - Hotel - House \\/ Apartment sekmelerinden Hotel sekmesine tıklar")
    public void kullanici_all_stays_hotel_house_apartment_sekmelerinden_hotel_sekmesine_tıklar() {
    trivago.hotelClick.click();
    }
    @Then("kullanici Arama kutusuna Seychelles yazar")
    public void kullanici_arama_kutusuna_seychelles_yazar() {
    trivago.aramaKutusu.sendKeys("Seychelles"+ Keys.TAB);
    }
    @Then("kullanici {int} yazı için {int} haftalık bir tarih aralığı seçer")
    public void kullanici_yazı_için_haftalık_bir_tarih_aralığı_seçer(Integer int1, Integer int2) {
    trivago.checkIn.sendKeys(trivago.yirmiikiHaziran.getText());
    trivago.checkOut.sendKeys(trivago.altıTemmuz.getText());
    }
    @Then("kullanici {int} yetiskin secer")
    public void kullanici_yetiskin_secer(Integer int1) {
    trivago.guestClick.click();
    trivago.applyClick.click();
    }
    @Then("kullanici search'e tıklar")
    public void kullanici_search_e_tıklar() {
        trivago.search.click();
    }
    @Then("kullanici Gelen sonuçlarda Guest rating üzerine gel ve Very good'u seçer")
    public void kullanici_gelen_sonuçlarda_guest_rating_üzerine_gel_ve_very_good_u_seçer() {
    action.moveToElement(trivago.guestRating).click(trivago.veryGood).perform();
    }
    @Then("kullanici More filters üzerine gel, Hotel class'ta {int} ve {int} yıldızı seç, popular filters'tan Beach seçer")
    public void kullanici_more_filters_üzerine_gel_hotel_class_ta_ve_yıldızı_seç_popular_filters_tan_beach_seçer(Integer int1, Integer int2) {
    action.moveToElement(trivago.moreFilters).click(trivago.dortYıldız).click(trivago.besYıldız).perform();
    }
    @Then("kullanici En üstteki sonucun resmi üzerine gelir, More photos linkinin göründüğünü doğrular, Linke tıklar")
    public void kullanici_en_üstteki_sonucun_resmi_üzerine_gelir_more_photos_linkinin_göründüğünü_doğrular_linke_tıklar() {
    trivago.beach.click();
    }
    @Then("kullanici Resimlerin altta göründüğünü doğrular")
    public void kullanici_resimlerin_altta_göründüğünü_doğrular() {

    }
    @Then("kullanici En üstteki sonucun adının ve yıldızlarının altında konumu yazıyor, tıklar")
    public void kullanici_en_üstteki_sonucun_adının_ve_yıldızlarının_altında_konumu_yazıyor_tıklar() {

    }
    @Then("kullanici  Sağ taraftaki haritada oteli işaretler, Haritayı locate eder")
    public void kullanici_sağ_taraftaki_haritada_oteli_işaretler_haritayı_locate_eder() {


    }
    @Then("kullanici Hoteli haritada drag & drop yaparak ortalar, + tuşuyla zoom yapar")
    public void kullanici_hoteli_haritada_drag_drop_yaparak_ortalar_tuşuyla_zoom_yapar() {

    }
}
