package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonpage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
    amazonpage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("sonuclarin Nutella icerdini test eder")
    public void sonuclarin_nutella_icerdini_test_eder() {
    String arananKelime="Nutella";
    String actualAramaSonucStr=amazonpage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
    Driver.closeDriver();
    }

    @Then("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @And("kullanici iphone 13 arama yapar")
    public void kullaniciIphoneAramaYapar() {
        amazonpage.aramaKutusu.sendKeys("iphone 13"+Keys.ENTER);
    }

    @And("sonuclarin iphone 13 icerdiğini test eder")
    public void sonuclarinIphone13IcerdiğiniTestEder() {
        String expectedSonuc="iphone 13";
        String actualSonuc=amazonpage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonuc.contains(expectedSonuc));
    }
    @Given("kullanici amazon anasayfasina gider")
    public void kullanici_amazon_anasayfasina_gider() {
    Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("kullanici amazonda java aratir")
    public void kullanici_amazonda_java_aratir() {
     amazonpage.aramaKutusu.sendKeys("Java"+Keys.ENTER);
    }
    @Then("sonuclarin Java icerdiğini test eder")
    public void sonuclarin_Java_icerdiğini_test_eder() {
    String actualSonuc=amazonpage.aramaSonucElementi.getText();
    String expectedSonuc="Java";
    Assert.assertTrue(actualSonuc.contains(expectedSonuc));
    }

    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonpage.aramaKutusu.sendKeys(istenenKelime+Keys.ENTER);
    }
    @Given("sonuclarin {string} icerdini test eder")
    public void sonuclarin_icerdini_test_eder(String istenenKelime) {
        String actualSonuc=amazonpage.aramaSonucElementi.getText();
        String expectedSonuc=istenenKelime;
        Assert.assertTrue(actualSonuc.contains(expectedSonuc));
    }

    @Given("kullanici {string} anasayfasinda")// amazonUrl
    public void kullaniciAnasayfasinda(String istenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'in {string} icerdiğini test eder")
    public void urlInIcerdiğiniTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
