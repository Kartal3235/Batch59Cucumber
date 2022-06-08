package stepDefinitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    step definitions package'i içerisinde @before,@after,
    gibi bir notasyon varsa;
    Cucumber da extends testBase dememize gerek kalmadan
    her scanerio'dan önce ve/veya sonra bu methodlar çalışacaktır

    Bu da bizim isteyeceğimiz bir durum değildir.

    Cucumber da @before,@after kullanma ihtiyacımız olursa
    bunu stepdefinitions package'i altına oluşturacağımız
    hooks class'ına koyarız

    Biz her scenario'dan sonra test sonucunu kontrol edip
    failden olan scanerio'lar için screenshoot alması amacıyla
    @after method'u kullanacağiz


     */
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}
