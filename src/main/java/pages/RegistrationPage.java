package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class RegistrationPage {

    // Driver
    private WebDriver driver;

    // Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }


    // Locators
    private By txtName = By.id("name");
    private By txtEmail = By.id("email");
    private By txtPhone = By.id("phone");
    private By txtAddress = By.id("textarea");
    private By femaleRadioButton = By.id("female");
    private By tuesdayCheckBox = By.id("tuesday");
    private By countrydropdown = By.id("country");
    private By colorsDropdown = By.id("colors");
    private By datePicker = By.id("datepicker");
    private By datePickernextButton = By.xpath("//div[@id='ui-datepicker-div']//span[normalize-space()='Next']");
    private By datePickerTitle = By.xpath("//div[@class='ui-datepicker-title']");
    private By dateField = By.id("txtDate");
    private By monthDropdown = By.xpath("//select[@class='ui-datepicker-month' and @aria-label='Select month']");
    private By yearDropdown = By.xpath("//select[@class='ui-datepicker-year' and @aria-label='Select year']");
    private By staticWebTable = By.xpath("//h2[normalize-space()='Static Web Table']/following::table[@name='BookTable']");

//    CI/CD


    // Actions
    public void enterName(String name) {
        driver.findElement(txtName).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void enterPhone(String phone) {
        driver.findElement(txtPhone).sendKeys(phone);
    }

    public void enterAddress(String address) {
        driver.findElement(txtAddress).sendKeys(address);
    }

    public void selectRadioButton() {
        driver.findElement(femaleRadioButton).click();
    }

    public void selectDays() {
        driver.findElement(tuesdayCheckBox).click();
    }

    public void selectCountry(String country) {
        Select select = new Select(driver.findElement(countrydropdown));
        select.selectByVisibleText(country);
        System.out.println(select.getFirstSelectedOption().getText());

    }

    public void printAllCountries() {
        Select select = new Select(driver.findElement(countrydropdown));
        List<WebElement> alloptions = select.getOptions();
        for (WebElement option : alloptions) {
            System.out.println(option.getText());
        }
    }

    public void selectColors(String... colors) {
        Select select = new Select(driver.findElement(colorsDropdown));
        if (!select.isMultiple()) {
            throw new RuntimeException("colors dropdown is not a multiselect dropdown");
        }
        for (String color : colors)
            select.selectByVisibleText(color);

    }

    public void getAllSelectedColors() {
        Select select = new Select(driver.findElement(colorsDropdown));
        List<WebElement> allColors = select.getAllSelectedOptions();
        for (WebElement color : allColors) {
            System.out.println(color.getText());
        }
    }

    public void deselectAllcolors() {
        Select select = new Select(driver.findElement(countrydropdown));
        if (select.isMultiple()) {
            select.deselectAll();
        }


    }

    public void selectDate(String day, String month, String year) {
        driver.findElement(datePicker).click();
        while (true) {
            String currentHeader = driver.findElement(datePickerTitle).getText();
            if (currentHeader.equals(month + " " + year)) {
                break;
            }
            driver.findElement(datePickernextButton).click();

        }
        driver.findElement(By.xpath("//td/a[normalize-space()='" + day + "']")).click();


    }


    public void selectDates(String month, String date, String year) {
        driver.findElement(dateField).click();
        Select select = new Select(driver.findElement(monthDropdown));
        select.selectByVisibleText(month);

        Select yeardropdown = new Select(driver.findElement(yearDropdown));
        yeardropdown.selectByVisibleText(year);

        driver.findElement(By.xpath("//td/a[normalize-space()='" + date + "']")).click();


    }

    public void readValuesFromWebTable() {

//        WebElement table = driver.findElement(staticWebTable);
//
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//
//        for (WebElement row : rows) {
//            List<WebElement> columns = row.findElements(By.tagName("th"));
//
//            for (WebElement column : columns) {
//                System.out.println(column.getText());
//            }
//        }
    }
}


//registration.feature
//        ↓
//RegistrationSteps.java
//        ↓
//RegistrationPage.java
//        ↓
//WebDriver
//        ↓
//Browser