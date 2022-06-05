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
}
