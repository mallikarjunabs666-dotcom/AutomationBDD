package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.initDriver();
    }

    @After
    public void tearDown(Scenario scenario) {

        try {

            if (scenario.isFailed()) {

                byte[] screenshot =
                        ((TakesScreenshot) DriverManager.getDriver())
                                .getScreenshotAs(OutputType.BYTES);

                scenario.attach(
                        screenshot,
                        "image/png",
                        "Failed Screenshot"
                );
            }

        } finally {

            DriverManager.quitDriver();
        }
    }
}

//Why do we need Hooks?
//Hooks execute setup and cleanup logic automatically before and after every scenario. They remove duplicate setup steps from feature files and keep the framework clean and maintainable.

//2. Why not launch browser in Step Definition?
//Because browser initialization is framework setup, not business behavior. Using Hooks avoids repeating "launch browser" steps in every scenario and follows the DRY principle.

//. What is the execution order?
//Runner
//↓
//@Before
//↓
//Scenario Steps
//↓
//@After
//4. Difference between Cucumber @Before and TestNG @BeforeMethod?
//Cucumber	TestNG
//Runs before every Scenario	Runs before every Test Method
//Used with Feature Files	Used with TestNG test methods
//Belongs to io.cucumber.java.Before	Belongs to org.testng.annotations.BeforeMethod