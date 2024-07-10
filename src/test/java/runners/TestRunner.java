package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featuers", glue = "stepdefs",
                  plugin = "html:target/cucumber-reports.html")
public class TestRunner {

}
