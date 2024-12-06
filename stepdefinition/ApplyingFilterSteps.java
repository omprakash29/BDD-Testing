package stepdefinition;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HealthInsuranceBestPlansPage;
import pages.HealthInsurancePage;
import pages.Homepage;
import pages.PurchasePlanForm;
import utils.Base;

public class ApplyingFilterSteps extends Base{
	Homepage homepage;
	HealthInsurancePage insurancepage;
	HealthInsuranceBestPlansPage planpage;
	PurchasePlanForm purchaseplanpage;

	@When("I hover over Insurance")
	public void i_hover_over_insurance() {
		homepage = new Homepage(driver);
		homepage.hoverInsuracne();
	}

	@When("click on health insurance in the displayed options")
	public void click_on_health_insurance_in_the_displayed_options() {
		homepage.clickHealthInsurance();
	}

	@When("select the {string} under Compare & Buy Customised Health")
	public void select_the_under_compare_buy_customised_health(String string) throws IOException, InterruptedException {
		insurancepage= new HealthInsurancePage(driver);
		insurancepage.selectGender(string);
	}

	@When("enter the name {string} in the input box")
	public void enter_the_name_in_the_input_box(String string) {
		insurancepage.enterNameInInputBox(string);
	}

	@When("enter the mobile number {string} in the input box")
	public void enter_the_mobile_number_in_the_input_box(String string) {
		insurancepage.enterMobileNumberInInputBox(string);
	}

	@When("click the view plan button")
	public void click_the_view_plan_button() throws InterruptedException {
		insurancepage.clickViewPlanButton();
	}

	@When("select the self and age")
	public void select_the_self_and_age() {
		insurancepage.selectMembersAndTheirAge();
	}

	@When("enter pincode {string}")
	public void enter_pincode(String string) {
		insurancepage.enterPincode(string);
	}

	@When("click the continue button")
	public void click_the_continue_button() throws InterruptedException {
		insurancepage.clickContinueButton();
		insurancepage.clickViewPlanButtonInPopup();
	}

	@When("select {string} from the coverage dropdown")
	public void select_from_the_coverage_dropdown(String string) throws InterruptedException {
		planpage = new HealthInsuranceBestPlansPage(driver);
		planpage.CoverageDropdown();
		switch(string) {
		case "10l":
			planpage.CoverageTenLakh();
			break;
		case "50l":
			planpage.dynamicCoverage();
			planpage.CoverageFiftyLakh();
			planpage.CoverageUpdateButton();
			break;
		case "1cr":
			planpage.BaseDropdown();
			break;
		case "15l":
			planpage.dynamicCoverage();
			planpage.CoverageFiftenLakh();
			planpage.CoverageUpdateButton();
		}
	}

	@When("open the special features dropdown")
	public void open_the_special_features_dropdown() throws InterruptedException {
		planpage.FeatureDropdown();
		planpage.FeatureReset();
	}

	@When("select features {string}")
	public void select_features_and(String string) throws InterruptedException {
		planpage.FeatureDropdown();
		switch(string) {
		case "1":
			planpage.FeatureMaternityCover();
			planpage.FeatureRestorationBenefits();
			break;
		case "2":
			planpage.FeatureOpdBenefits();
			planpage.FeaturePreHospitalization();
			planpage.FeaturePostHospitalization();
			break;
		case "3":
			planpage.FeatureOpdBenefits();
			planpage.FeaturePreHospitalization();
			planpage.FeaturePostHospitalization();
			break;
		case "4":
			planpage.FeatureMaternityCover();
			planpage.FeatureOpdBenefits();
			planpage.FeatureNoRoomCapping();
			break;
		}
		planpage.FeatureApplyNow();
	}
	@When("select the {string} from the tenure dropdown")
	public void select_the_from_the_tenure_dropdown(String string) throws InterruptedException {
		planpage.TentureDropdown();
		switch(string) {
		case "2":
			planpage.TentureTwoYear();
			break;
		case "3":
			planpage.TentureThreeYear();
			break;
		}
	}
	@When("choose the sort option {string}")
	public void choose_the_sort_option(String string) throws InterruptedException{
		planpage.applyFilterSorting(string);
	}

	@Then("I verify title contains {string}")
	public void i_verify_title_contains(String string) {
		insurancepage.verifyTitle(string);
	}

	@When("I click the first company after applying the filters")
	public void i_click_the_first_company_after_applying_the_filters() {
		planpage.applyForCompanyInsurance();
	}

	@When("I click viewFeature")
	public void i_click_viewFeature() {
		purchaseplanpage = new PurchasePlanForm(driver);
		purchaseplanpage.viewFeature();
	}
	@When("Verify {string} in the view feature")
	public void verify_in_the_view_feature(String string) {
		purchaseplanpage.verifyPlanFeature(string);
	}

	@When("I close the view feature popup")
	public void i_close_the_view_feature_popup() {
		purchaseplanpage.closeViewFeatures();
	}

	@When("I enter the Date of birth")
	public void i_enter_the_date_of_birth() {
		purchaseplanpage.verifySelfText();
		purchaseplanpage.selfDob();
	}

	@When("select height {string} and {string}")
	public void select_height_and(String string, String string2) {

		purchaseplanpage.sendHeight(string, string2);
	}

	@When("I input the {string}  in the input box")
	public void i_input_the_in_the_input_box(String string) {
		purchaseplanpage.sendWeight(string);
	}

	@When("I click the dropdown of occupation and select the occupation")
	public void i_click_the_dropdown_of_occupation_and_select_the_occupation() {
		purchaseplanpage.selectOccupation();
	}

	@When("I click the nominee relation dropdown and select the relation from the displayed options")
	public void i_click_the_nominee_relation_dropdown_and_select_the_relation_from_the_displayed_options() {
		purchaseplanpage.NomineeDetails();
	}

	@When("I enter the name {string}")
	public void i_enter_the_name(String string) {
		purchaseplanpage.NomineeName(string);
	}

	@When("I enter the age ")
	public void i_enter_the_age() {
		purchaseplanpage.NomineeDob();
		purchaseplanpage.NomineeAdress("Hydrabad");
	}

	@When("I click on the continue to medical details button")
	public void i_click_on_the_continue_to_medical_details_button() {
		purchaseplanpage.clickCalucalteMedicalDetails();
	}

	@Then("I verify  {string} text")
	public void i_verify_text(String string) {
		purchaseplanpage.verifyTheMedicalForm(string);
	}
}
