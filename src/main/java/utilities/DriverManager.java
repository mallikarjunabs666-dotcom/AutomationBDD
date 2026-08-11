package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private DriverManager() {
    }

    public static void initDriver() {

        if (driver.get() == null) {

            WebDriver webDriver = new ChromeDriver();

            webDriver.manage().window().maximize();

            webDriver.manage().timeouts()
                    .implicitlyWait(Duration.ofSeconds(10));

            webDriver.manage().timeouts()
                    .pageLoadTimeout(Duration.ofSeconds(20));

            driver.set(webDriver);
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {

        WebDriver webDriver = driver.get();

        if (webDriver != null) {
            webDriver.quit();
            driver.remove();
        }
    }
}