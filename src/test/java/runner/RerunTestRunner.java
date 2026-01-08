package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/failedrerun.txt",
        glue = "org.OrangeHRM.stepdef",
        plugin = {
                "pretty",
               "html:target/cucumber/rerun-report.html"
        }
)
public class RerunTestRunner extends AbstractTestNGCucumberTests {
}

