package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import uistore.HealthInsurancePageUI;
import utils.WebDriverHelper;

public class HealthInsurancePage {
	WebDriver driver;
	WebDriverHelper helper;
	public HealthInsurancePage(WebDriver driver)
	{
		this.driver = driver;
		helper = new WebDriverHelper(driver);
	}

	public void selectGender(String gender) throws IOException, InterruptedException
	{
		if(gender.equalsIgnoreCase("male")) {
			helper.clickOnElement(HealthInsurancePageUI.male,  HealthInsurancePageUI.class);
		}else if(gender.equalsIgnoreCase("female")) {
			helper.clickOnElement(HealthInsurancePageUI.female,  HealthInsurancePageUI.class);
		}
	}

	public void enterNameInInputBox(String name) {
		helper.clickOnElement(HealthInsurancePageUI.nameInput,HealthInsurancePageUI.class);
		helper.sendKeys(HealthInsurancePageUI.nameInput, name,HealthInsurancePageUI.class);
	}

	public void enterMobileNumberInInputBox(String mobileNumber) {
		helper.clickOnElement(HealthInsurancePageUI.phoneNumberInput,HealthInsurancePageUI.class);
		helper.sendKeys(HealthInsurancePageUI.phoneNumberInput, mobileNumber,HealthInsurancePageUI.class);
	}

	public void clickViewPlanButton() throws InterruptedException {
		Thread.sleep(2000);
		helper.clickOnElement(HealthInsurancePageUI.viewPlanButton,HealthInsurancePageUI.class);
	}

	public void selectMembersAndTheirAge() {
		helper.clickOnElement(HealthInsurancePageUI.selectAdults,HealthInsurancePageUI.class);
		helper.clickOnElement(HealthInsurancePageUI.age,HealthInsurancePageUI.class);
	}

	public void enterPincode(String pincode) {
		helper.clickOnElement(HealthInsurancePageUI.pincodeInputBox,HealthInsurancePageUI.class);
		helper.sendKeys(HealthInsurancePageUI.pincodeInputBox, pincode,HealthInsurancePageUI.class);
	}

	public void clickContinueButton() throws InterruptedException 
	{
		Thread.sleep(2000);
		helper.clickOnElement(HealthInsurancePageUI.continueButton,HealthInsurancePageUI.class);
	}

	public void clickViewPlanButtonInPopup() throws InterruptedException 
	{
		Thread.sleep(2000);
		helper.clickOnElement(HealthInsurancePageUI.viewPlanButtonInPopup,HealthInsurancePageUI.class);
	}
	public void verifyTitle(String expectedTitle) 
	{
		helper.verifyTitle(expectedTitle);
	}

	public void invalidCheckForPlans(String nameError , String numberError) 
	{
		helper.verifyText(HealthInsurancePageUI.nameErrorText, nameError ,  HealthInsurancePageUI.class);
		helper.verifyText(HealthInsurancePageUI.phoneNumberErrorText, numberError,  HealthInsurancePageUI.class);
	}


	public void clickOnPremiumCalculator() {
		helper.clickOnElement(HealthInsurancePageUI.premiumCalculator, HealthInsurancePageUI.class);
	}

	public void clickOnChooseCity() {
		helper.javascriptScroll(HealthInsurancePageUI.networkHospital, HealthInsurancePageUI.class);
		//		helper.javascriptScroll(HealthInsurancePageUI.chooseCity, HealthInsurancePageUI.class);
		helper.clickOnElement(HealthInsurancePageUI.chooseCity, HealthInsurancePageUI.class);
	}

	public void enterCity(String cityName) {
		helper.sendKeys(HealthInsurancePageUI.chooseCity, cityName, HealthInsurancePageUI.class);
		helper.enterAction(HealthInsurancePageUI.chooseCity, HealthInsurancePageUI.class);
	}

	public void verifyCityText(String expectedString) throws InterruptedException
	{
		//		Thread.sleep(3000);
		helper.verifyText(HealthInsurancePageUI.verifyText,expectedString,HealthInsurancePageUI.class);
	}
}
