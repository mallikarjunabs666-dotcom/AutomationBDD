package stepdefinitions;

import utilities.DriverManager;
import io.cucumber.java.en.*;
import pages.RegistrationPage;

public class RegistrationSteps {

    private RegistrationPage registrationPage;

    @Given("User launches the browser")
    public void user_launches_the_browser() {
        registrationPage = new RegistrationPage(DriverManager.getDriver());

    }

    @Given("User navigates to the Registration page")
    public void user_navigates_to_the_registration_page() {

        DriverManager.getDriver().get("https://testautomationpractice.blogspot.com/");

    }

    @When("User enters name {string}")
    public void user_enters_name(String name) {

        registrationPage.enterName(name);

    }

    @When("User enters email {string}")
    public void user_enters_email(String email) {

        registrationPage.enterEmail(email);

    }

    @When("User enters phone number {string}")
    public void user_enters_phone_number(String phone) {

        registrationPage.enterPhone(phone);

    }

    @When("User enters address {string}")
    public void user_enters_address(String address) {

        registrationPage.enterAddress(address);

    }

    @When("User click on female radio button")
    public void user_click_on_female_radio_button() {
        registrationPage.selectRadioButton();
    }

    @When("User select Tuesday checkbox")
    public void user_select_Tuesday_checkbox() {
        registrationPage.selectDays();

    }

    @When("User select {string} from the country dropdown")
    public void selectingCountry(String country) {
        registrationPage.selectCountry(country);
        registrationPage.printAllCountries();

    }

    @When("User select {string} and {string} from colors dropdown")
    public void colorsSelection(String color1, String color2) {
        registrationPage.selectColors(color1, color2);
        registrationPage.getAllSelectedColors();
        registrationPage.deselectAllcolors();

    }

    @When("User select {string} {string} {string} from date picker")
    public void selectDate(String day, String month, String year) {
        registrationPage.selectDate(day, month, year);
    }

    @When("User select {string} {string} {string} from another date picker")
    public void selectDates(String month, String date, String year) {
        registrationPage.selectDates(month, date, year);
    }

    @When("I read values from webtable")
    public void staticWebtable() {
        registrationPage.readValuesFromWebTable();

    }

    @When(("I read values from Dynamic WebTable"))
    public void dynamicWebTable() {
        registrationPage.readFromDYnamicWebTable();
    }

    @When("I read values from pagination Webtable")
    public void readValuesFromPagination() {
        registrationPage.readFromPaginationWebTable();
    }


    @Then("User should see all entered values in the registration form")
    public void user_should_see_all_entered_values_in_the_registration_form() {

        System.out.println("Registration completed successfully.");

    }

}