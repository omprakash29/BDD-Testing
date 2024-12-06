package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HealthInsuraceCalculatorPage;
import pages.Homepage;
import utils.Base;

public class CalculatingHealthInsurance extends Base{
	Homepage homepage;
	HealthInsuraceCalculatorPage calculatePage;
	@When("I hover over Insurance option on the navigation bar")
	public void i_hover_over_insurance_option_on_the_navigation_bar() {
		homepage = new Homepage(driver);
		homepage.hoverInsuracne();
	}
	@When("I click on the health insurance option from the drop down")
	public void i_click_on_the_health_insurance_option_from_the_drop_down() {
		homepage.clickHealthInsurance();
	}
	@When("I scroll down to the calculate health insurance section")
	public void i_scroll_down_to_the_calculate_health_insurance_section() {
		calculatePage = new HealthInsuraceCalculatorPage(driver);
		calculatePage.scrollToHealthInsuranceCalculator();

	}
	@When("I click on the {string} option inside the health insurance calculator")
	public void i_click_on_the_option_inside_the_health_insurance_calculator(String string) {

		switch(string){
		case "you":
			calculatePage.selectYouOption();
			break;
		case "couple":
			calculatePage.selectCoupleOption();
			break;
		case "family":
			calculatePage.selectFamilyOption();
			break;
		case "father":
			calculatePage.selectFatherOption();
			break;
		case "mother":
			calculatePage.selectMotherOption();
			break;
		}
	}

	@When("I enter the pincode in the input field {string}")
	public void i_enter_the_pincode_in_the_input_field(String string) {
		calculatePage.calculateInsurance(string);
	}
	@When("I choose the required coverage {string}")
	public void i_choose_the_required_coverage(String string) {
		calculatePage.selectCoverageAmount(string);
	}
	@When("I click on the calculate premium button")
	public void i_click_on_the_calculate_premium_button() {
		calculatePage.clickCalculateButton();
	}
	@Then("I verify the text {string} is displayed in the popup")
	public void i_verify_the_text_is_displayed_in_the_popup(String string) {
		calculatePage.verifyText();
	}
}
