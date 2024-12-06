package stepdefinition;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.EmailSender;
import utils.ReportHandler;

public class AppHooks extends Base{
	public static ExtentReports InsurancDekhoReports;
	public static ExtentTest test;

	@BeforeAll
	public static void generateReports() {
		InsurancDekhoReports = ReportHandler.generateExtentReport("Health Insurance");
	}

	@Before
	public void getBrowser(Scenario features) {
		test = InsurancDekhoReports.createTest(features.getName()).assignAuthor("OM");
		openBrowser();
	}

	@After
	public void quitDriver() {
		driver.quit();
	}

	@AfterAll
	public static void flushReports() throws AddressException, MessagingException {
		String mailTo = "omprakashaf3003@gmail.com"; 
		String subject = "Selenium Test Report"; 
		String message = "Please find the attached Selenium test report."; 
		InsurancDekhoReports.flush();

		EmailSender.sendEmailWithAttachment(mailTo, subject, message);
	}
}
