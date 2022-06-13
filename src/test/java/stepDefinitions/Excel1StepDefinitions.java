package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel1StepDefinitions {
    Workbook wb;
    FileInputStream fis;
    FileOutputStream fos;
    String filePath="src/main/resources/ulkeler.xlsx";

    @Given("kullanici baslık satırında ilk bos hucreye {string} yazdırır")
    public void kullanici_baslık_satırında_ilk_bos_hucreye_yazdırır(String string) throws IOException {

        fis=new FileInputStream(filePath);
        wb= WorkbookFactory.create(fis);
        wb.getSheet("Sayfa2").getRow(0).createCell(1).setCellValue("ülke Nufusu");
    }

    @Then("{string}.satir ulke nufusu sutununa \"{double}\"milyar yazdırır")
    public void satir_ulke_nufusu_sutununa_milyar_yazdırır(String string, Double double1) {
    wb.getSheet("Sayfa2").getRow(1).getCell(1).setCellValue("1,5 milyar");

    }

    @Then("{string}.satir ulke nufus sutununa {string} milyon yazdırır")
    public void satir_ulke_nufus_sutununa_milyon_yazdırır(String string, String string2) {
    wb.getSheet("Sayfa2").getRow(7).getCell(1).setCellValue("250 milyon");
    }

    @Then("kullanici dosyayi kaydeder")
    public void kullanici_dosyayi_kaydeder() throws IOException {
        fos=new FileOutputStream(filePath);
        wb.write(fos);


    }

    @Then("Dosyayi kapatir")
    public void dosyayi_kapatir() throws IOException {
    wb.close();
    fis.close();
    fos.close();

    }
}
