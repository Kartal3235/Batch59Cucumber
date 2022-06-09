package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinitions {

    @Given("kullanici excel dosyasını kullanılabilir hale getirir")
    public void kullanici_excel_dosyasını_kullanılabilir_hale_getirir() throws IOException {
    String dosyaYolu="src/test/resources/ulkeler.xlsx";
    FileInputStream fis=new FileInputStream(dosyaYolu);
    Workbook wb= WorkbookFactory.create(fis);


    }

    @Then("{int}.satir {int}.hucreye yazdırır")
    public void satir_hucreye_yazdırır(Integer int1, Integer int2) throws IOException {
        String dosyaYolu="src/test/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook wb= WorkbookFactory.create(fis);

    }

    @Then("baskenti Jakarta olan ulke ismini yazdiralim")
    public void baskenti_jakarta_olan_ulke_ismini_yazdiralim() {

    }

    @Then("Ulke sayisinin {int} olduğunu test eder")
    public void ulke_sayisinin_olduğunu_test_eder(Integer int1) {

    }

    @Then("Fiziki olarak kullanilan satir sayisinin {int} olduğunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_olduğunu_test_eder(Integer int1) {

    }

    @Then("{int}.satır {int}.sutundaki bilgiyi yazdirir")
    public void satır_sutundaki_bilgiyi_yazdirir(Integer int1, Integer int2) {

    }
}
