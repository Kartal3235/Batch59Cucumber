package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.Driver;

import java.time.Duration;

public class DemoqaStepDefinitions {
    DemoqaPage dmq=new DemoqaPage();
    Actions action=new Actions(Driver.getDriver());
    @Then("kullanici alerts butonuna tıklar")
    public void kullanici_alerts_butonuna_tıklar() {
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click()","dmq.alertsClick");

    }

    @Then("kullanici On button click, alert will appear after {int} seconds karsisindaki click me butonuna tıklar")
    public void kullanici_on_button_click_alert_will_appear_after_seconds_karsisindaki_click_me_butonuna_tıklar(Integer int1) {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dmq.alertTime));

    }

    @Then("kullanici alert yazısının gorunur olmasını bekler")
    public void kullanici_alert_yazısının_gorunur_olmasını_bekler() {

    }

    @Then("kullanici Alert uzerindeki yazinin {string} oldugunu test eder")
    public void kullanici_alert_uzerindeki_yazinin_oldugunu_test_eder(String string) {

    }

    @Then("kullanici Ok cilick eder")
    public void kullanici_ok_cilick_eder() {

    }
}
