package pages;

import org.openqa.selenium.WebDriver;

import uistore.HomepageUI;
import utils.WebDriverHelper;

public class Homepage {
	WebDriver driver;
	WebDriverHelper helper;
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		helper = new WebDriverHelper(driver);
	}

	public void hoverInsuracne() 
	{
		helper.hoverOverElement(HomepageUI.insurance,  HomepageUI.class);
	}
	public void hoverOnHealthInsurance() 
	{
		helper.hoverOverElement(HomepageUI.healthInsurance,  HomepageUI.class);
	}
	public void hoverOnHealthInsuranceComapanies()
	{
		helper.hoverOverElement(HomepageUI.healthInsuranceComapanies,  HomepageUI.class);
	}
	public void clickOnFirstCompany() 
	{
		helper.clickOnElement(HomepageUI.healthInsuranceFirstCompany,  HomepageUI.class);
	}

	public void verifyInsuranceCompanyText(String expectedString) 
	{
		helper.verifyText(HomepageUI.companyNameVerify, expectedString, HomepageUI.class);
	}

	public void clickHealthInsurance() 
	{
		helper.clickOnElement(HomepageUI.healthInsurance,  HomepageUI.class);
	}
	public void clickBikeInsurance()
	{
		helper.clickOnElement(HomepageUI.bikeInsurance,  HomepageUI.class);
	}

}
