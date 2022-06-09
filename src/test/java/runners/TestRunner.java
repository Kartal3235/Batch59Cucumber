package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)// runner ımızı çalışır hale getiriyoruz,Junit den gelir bundan dolayı cucumberda Junit kullanırız
@CucumberOptions(// istediğimiz bütün özelliklerimizi ekliyoruz

        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags= "@automation",
        dryRun = false
)

public class TestRunner {
       /*
       Bir framework de bir tek TestRunner class'i yeterli olabilir
       TestRunner classında class body'sinde hiç birşey olmaz
       TestRunner classımızı önemli yapan iki adet annotaion vardır

       @RunWith(Cucumber.class)==>notasyonu runner classına calışma özlliği katar
       Bu notasyon olduğu için Cucumber framework'umuzde Junit kullanmayı tercih ediyoruz

       features: TestRunner dosyasının feature dosyalarını nereden bulacağını tarif eder
       glue    : stepDefinitions dosyalarını nerede bulacağımızı gösterir
       tags    : o an hangi tag'i çalıştırmak istiyorsak onu belli eder.

       dryRun: iki secenek var
       dryRun=true; yazdığımızda testimizi çalıştırmadan sadecec eksik adımları bize verir.
       dryRun=false; yazdığımızda testlerimizi çalıştırır.

        */
}
