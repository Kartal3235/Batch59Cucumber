package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinitions {

    Workbook wb;

    @Given("kullanici excel dosyasını kullanılabilir hale getirir")
    public void kullanici_excel_dosyasını_kullanılabilir_hale_getirir() throws IOException {
        String dosyaYolu="src/test/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
         WorkbookFactory.create(fis);

    }

    @Then("{int}.satir {int}.hucreyi yazdırır")
    public void satir_hucreye_yazdırır(Integer satir, Integer sutun)  {
        String istenenHucreSayısı=wb.getSheet("Sayfa1").getRow(satir-1).getCell(sutun-1).toString();

        System.out.println(satir+".satir "+sutun+ ".sutun daki değer :"+istenenHucreSayısı);
    }

    @Then("baskenti Jakarta olan ulke ismini yazdiralim")
    public void baskenti_jakarta_olan_ulke_ismini_yazdiralim() {
    // for loop ile tum satırları kontrol etmem gerekiyor
    // Bunun içinde satır sayısına ihtiyacım var
    int satırSayısı=wb.getSheet("Sayfa1").getLastRowNum();
        for (int i = 0; i <=satırSayısı ; i++) {
            if(wb.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")){
                System.out.println("Baskenti Jakarta olan ulke: "+
                        (wb.getSheet("Sayfa1").getRow(i).getCell(0)));
            }
        }
    }

    @Then("Ulke sayisinin {int} olduğunu test eder")
    public void ulke_sayisinin_olduğunu_test_eder(Integer ulkeSayisi) {

    int actualUlkeSayısı=wb.getSheet("Sayfa1").getLastRowNum();
        Assert.assertTrue(ulkeSayisi==actualUlkeSayısı);
    }

    @Then("Fiziki olarak kullanilan satir sayisinin {int} olduğunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_olduğunu_test_eder(Integer fizikiKullanilanSatir) {

        int actualFizKulSatir=wb.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(fizikiKullanilanSatir==actualFizKulSatir);
    }

    @Then("{int}.satır {int}.sutundaki bilgiyi yazdirir")
    public void satır_sutundaki_bilgiyi_yazdirir(Integer satir, Integer sutun) {
    String istenilenSatırSutunDegeri=wb.getSheet("Sayfa1").getRow(satir-1).getCell(sutun-1).toString();
    }
}
