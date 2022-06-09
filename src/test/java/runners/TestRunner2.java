package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)// runner ımızı çalışır hale getiriyoruz,Junit den gelir bundan dolayı cucumberda Junit kullanırız
@CucumberOptions(// istediğimiz bütün özelliklerimizi ekliyoruz

        plugin = {"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags= "@pr2",
        dryRun = false
)
public class TestRunner2 {


}
