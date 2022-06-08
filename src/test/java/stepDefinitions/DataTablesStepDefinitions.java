package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {

    DataTablesPage dataTablespage=new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
    dataTablespage.newButonunaBasar.click();
    }

    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstName) {
    dataTablespage.firstName.sendKeys(firstName);
    }

    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastName) {
    dataTablespage.lastName.sendKeys(lastName);
    }

    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
    dataTablespage.position.sendKeys(position);
    }

    @Then("ofis bolumune {string} yazar")
    public void ofis_bolumune_yazar(String office) {
    dataTablespage.office.sendKeys(office);
    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
    dataTablespage.extn.sendKeys(extension);
    }

    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
    dataTablespage.startDate.sendKeys(startDate);
    }

    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
    dataTablespage.salary.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
    dataTablespage.create.click();
    }

    @When("kullanici {string}  ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataTablespage.search.sendKeys(firstName);

    }



    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstName) {
        Assert.assertTrue(Boolean.parseBoolean(dataTablespage.ilksonucDogrular.getText()));
    }
}
