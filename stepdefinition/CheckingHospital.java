package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HealthInsurancePage;
import pages.Homepage;
import utils.Base;

public class CheckingHospital extends Base{

	Homepage homepage;
	HealthInsurancePage insurancepage;

	@When("hover over the Insurance option on the navigation bar")
	public void hover_over_the_insurance_option_on_the_navigation_bar() {
		homepage = new Homepage(driver);
		homepage.hoverInsuracne();
	}
	@When("hover on health insurance companies in the displayed list")
	public void hover_on_health_insurance_companies_in_the_displayed_list() {
		homepage.hoverOnHealthInsurance();
	}
	@When("hover on health insurance in the displayed list")
	public void hover_on_health_insurance_in_the_displayed_list() {
		homepage.hoverOnHealthInsuranceComapanies();
	}
	@When("click on the first company in the displayed list")
	public void click_on_the_first_company_in_the_displayed_list() {
		homepage.clickOnFirstCompany();
	}
	@When("click on the premium calculator")
	public void click_on_the_premium_calculator() {
		insurancepage = new HealthInsurancePage(driver);
		insurancepage.clickOnPremiumCalculator();
	}
	@When("enter the city name {string} inside the search box")
	public void enter_the_city_name_inside_the_search_box(String string) {
		insurancepage.clickOnChooseCity();
		insurancepage.enterCity(string);
	}
	@Then("validate the city name text {string}")
	public void validate_the_city_name_text_above_the_hospital_list(String string) throws InterruptedException {
		insurancepage.verifyCityText(string);
	}
}
