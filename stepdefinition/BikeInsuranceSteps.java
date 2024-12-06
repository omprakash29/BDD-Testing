package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BikeInsurancePage;
import pages.Homepage;
import utils.Base;

public class BikeInsuranceSteps extends Base{
	Homepage homepage;
	BikeInsurancePage bikepage;

	@When("I hover on the insurance link on the navigation")
	public void i_hover_on_the_insurance_link_on_the_navigation() {
		homepage = new Homepage(driver);
		homepage.hoverInsuracne();
	}

	@When("I click on the bike insurance option from the displayed options")
	public void i_click_on_the_bike_insurance_option_from_the_displayed_options() {
		homepage.clickBikeInsurance();
	}

	@When("I enter the bike number in the search box")
	public void i_enter_the_bike_number_in_the_search_box() {
		bikepage = new BikeInsurancePage(driver);
		bikepage.sendBikeNumber();
	}

	@When("I select the bike brand")
	public void i_select_the_bike_brand() {
		bikepage.selectBikeCompany();
	}

	@When("I search for bike model")
	public void i_search_for_bike_model() {
		bikepage.searchBikeModel();
	}

	@When("I click the bike model from the displayed results")
	public void i_click_the_bike_model_from_the_displayed_results() throws InterruptedException {
		bikepage.selectBikeModel();
	}

	@When("I select the bike edition")
	public void i_select_the_bike_edition() throws InterruptedException {
		bikepage.selectBikeEdition();
	}

	@When("I select the registration year of bike")
	public void i_select_the_registration_year_of_bike() throws InterruptedException {
		bikepage.selectRegistrationYear();
	}
	@When("I click on the register city")
	public void i_click_on_the_register_city() {
		bikepage.clickOnRegisterCity();
	}

	@When("I click on the city number")
	public void i_click_on_the_city_number() {
		bikepage.clickOnCityNo();
	}

	@When("I click on previous own damage")
	public void i_click_on_previous_own_damage() {
		bikepage.clickOnPreviousOwnDamage();
	}

	@When("I click on the own damage date")
	public void i_click_on_the_own_damage_date() {
		bikepage.clickOnOwnDamageDate();
	}

	@When("I click on the confirm details button")
	public void i_click_on_the_confirm_details_button() {
		bikepage.clickOnConfirmDetailsButton();
	}

	@When("I click on zero depreciation")
	public void i_click_on_zero_depreciation() {
		bikepage.clickOnZeroDepreciation();
	}

	@When("I click on addons")
	public void i_click_on_addons() {
		bikepage.clickOnAddons();
	}

	@When("I click on engine protection cover")
	public void i_click_on_engine_protection_cover() {
		bikepage.clickOnEngineProtectionCover();
	}

	@When("I click on tyre protection")
	public void i_click_on_tyre_protection() {
		bikepage.clickOnTyreProtection();
	}

	@When("I click on the apply button")
	public void i_click_on_the_apply_button() {
		bikepage.clickOnApplyButton();
	}

	@When("I click on the first company")
	public void i_click_on_the_first_company() {
		bikepage.clickOnFirstCompany();
	}

	@Then("I verify the text {string} is displayed")
	public void i_verify_the_text_is_displayed(String string) {
		bikepage.verifyProposalFormText(string);
	}
}
