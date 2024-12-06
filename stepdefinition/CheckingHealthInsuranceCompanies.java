package stepdefinition;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HealthInsurancePage;
import pages.Homepage;
import utils.Base;

public class CheckingHealthInsuranceCompanies extends Base{
	Homepage homepage;
	HealthInsurancePage insurancepage;

	@When("I hover on Insurance link on the navigation bar")
	public void i_hover_on_insurance_link_on_the_navigation_bar() {
		homepage = new Homepage(driver);
		homepage.hoverInsuracne();
	}
	@When("I hover on health insurance link in the displayed options")
	public void i_hover_on_health_insurance_link_in_the_displayed_options() {
		homepage.hoverOnHealthInsurance();
	}
	@When("I hover on health insurance companies link inside health insurance")
	public void i_hover_on_health_insurance_companies_link_inside_health_insurance() {
		homepage.hoverOnHealthInsuranceComapanies();
	}
	@When("I click on the first company in the list")
	public void i_click_on_the_first_company_in_the_list() {
		homepage.clickOnFirstCompany();
	}
	@Then("I verify the company name in result page {string}")
	public void i_verify_the_company_name_in_result_page(String string) {
		homepage.verifyInsuranceCompanyText(string);
	}

	@When("I hover over Insurance option")
	public void i_hover_over_insurance_option() {
		homepage = new Homepage(driver);
		homepage.hoverInsuracne();
	}
	@When("I click on health insurance link in the displayed options")
	public void i_click_on_health_insurance_link_in_the_displayed_options() {
		homepage.clickHealthInsurance();
	}
	@When("I select the {string} option under Compare & Buy Customised Health")
	public void i_select_the_option_under_compare_buy_customised_health(String string) throws IOException, InterruptedException {
		insurancepage= new HealthInsurancePage(driver);
		insurancepage.selectGender(string);
	}
	@When("I enter the name {string} in the input box")
	public void i_enter_the_name_in_the_input_box(String string) {
		insurancepage.enterNameInInputBox(string);
	}
	@When("I enter the mobile number {string} in the input box")
	public void i_enter_the_mobile_number_in_the_input_box(String string) {
		insurancepage.enterMobileNumberInInputBox(string);
	}
	@When("I click the view plan button")
	public void i_click_the_view_plan_button() throws InterruptedException {
		insurancepage.clickViewPlanButton();
	}
	@When("I select the self and age")
	public void i_select_the_self_and_age() {
		insurancepage.selectMembersAndTheirAge();
	}
	@When("I enter pincode {string}")
	public void i_enter_pincode(String string) {
		insurancepage.enterPincode(string);
	}
	@When("I click the continue button")
	public void i_click_the_continue_button() throws InterruptedException {
		insurancepage.clickContinueButton();
	}
	@Then("I verify title of the page contains {string}")
	public void i_verify_title_of_the_page_contains(String string) {
		insurancepage.verifyTitle(string);
	}

	@When("I hover over Insurance on the navigation bar")
	public void i_hover_over_insurance_on_the_navigation_bar() {
		homepage = new Homepage(driver);
		homepage.hoverInsuracne();
	}

	@When("I click on health insurance option in the displayed options")
	public void i_click_on_health_insurance_option_in_the_displayed_options() {
		homepage.clickHealthInsurance();
	}

	@When("select the {string} option")
	public void select_the_option(String string) {
		insurancepage.enterNameInInputBox(string);
	}

	@When("click on view plan button")
	public void click_on_view_plan_button() throws InterruptedException {
		insurancepage.clickViewPlanButton();
	}

	@Then("verify the error message {string} and {string}")
	public void verify_the_error_message_and(String string, String string2) {
		insurancepage.invalidCheckForPlans(string,string2);
	}

}
