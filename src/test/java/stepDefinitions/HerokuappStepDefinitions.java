package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HerokuappStepDefinitions {

    HerokuappPage herokuappPage=new HerokuappPage();
   List<WebElement> deleteList=new ArrayList<WebElement>();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
    herokuappPage.addElementButton.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
       wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteButton));
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
        deleteList.add(herokuappPage.deleteButton);
    }

    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
    herokuappPage.deleteButton.click();
    }

    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        Assert.assertTrue(deleteList.isEmpty());
    }
}
