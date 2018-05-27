package week9Day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class PayPalTestCase extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_PayPal";
		testDescription="PayPal Account Creation";
		testNodes="Leads";
		category="Smoke";
		authors="Priya and Vidya";
		browserName="chrome";
		dataSheetName="paypalData";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String country,String email,String password,String reEnterPassword) {
		
		new HomePagePayPal()
		.selectSignUp()
		.verifyRadioButton();
		new RadioButtonPage()
		.clickNext()
		.selectCountry(country)
		.typeEmail(email)
		.typePassword(password)
		.typePasswordAgain(reEnterPassword)
		.clickContinue()
		.closeBrowser();
	
	}

}
