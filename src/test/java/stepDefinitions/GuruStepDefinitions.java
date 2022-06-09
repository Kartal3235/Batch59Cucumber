package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage gurupage=new GuruPage();
    @Given("cookies sorulursa kabul eder")
    public void cookies_sorulursa_kabul_eder() {
     gurupage.cookies.click();
    }
    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {
        List<WebElement> tabloBaslıkListesi=gurupage.baslıkListesi;
        // listemiz webelementlerden oluşuyor
        // dolayısıyla bu webelementlerden hangisi
        // istenen sutun baslığımı tasıyor bilemeyiz
        int istenenBaslıkİndex=-3;
        for (int i = 0; i <tabloBaslıkListesi.size() ; i++) {
            if(tabloBaslıkListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslıkİndex=i+1;
                break;
            }
        }
        // for loop ile tum sutun baslıklarını bana verilen istenenSutun değeri ile
        //karşılaştırdım.Loop bittiğinde baslığın bulunup bulunmadığını kontrol etmek ve
        //bulundu ise yoluma devam etmek istiyorum

        if(istenenBaslıkİndex!=3){//baslık bulundu

            List<WebElement>istenenSutundakiElementler= Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslıkİndex+"]"));
            istenenSutundakiElementler.stream().map(WebElement::getText).forEach(System.out::println);

        }else {//baslık bulunmadı
            System.out.println("istenen baslık bulunmadı");
        }
    }
}
