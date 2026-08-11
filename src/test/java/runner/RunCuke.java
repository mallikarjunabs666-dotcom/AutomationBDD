package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(

        // Location of feature files
        features = "src/test/resources/features",

        // Step definitions and hooks
        glue = {
                "stepdefinitions",
                "hooks"
        },

        // Reporting plugins
        plugin = {

                // Console output
                "pretty",

                // Cucumber HTML Report
                "html:target/cucumber-reports/cucumber-html-report.html",

                // Extent Report
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        // Makes console output readable
        monochrome = true
)

public class RunCuke extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {

        return super.scenarios();
    }
}