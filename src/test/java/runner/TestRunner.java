package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
        glue = "org.OrangeHRM.stepdef",tags = " @sanity1",
monochrome = true, plugin = {"pretty","html:target/cucumber/cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
