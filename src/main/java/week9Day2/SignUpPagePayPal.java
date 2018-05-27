package week9Day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.apache.bcel.internal.generic.Select;

import pages.CreateLeadPage;
import wdMethods.ProjectMethods;

public class SignUpPagePayPal extends ProjectMethods {
	public SignUpPagePayPal() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="country")
	private WebElement selectDropDown;
	
	public SignUpPagePayPal selectCountry(String data) {
		selectDropDownUsingText(selectDropDown, data);
		/*WebElement ddElement = locateElement("tag", "option");
		selectDropDownUsingText(ddElement, data);*/
		return this;
	}
	
	@FindBy(how=How.ID,using="email")
	private WebElement typeEmail;
	
	
	public SignUpPagePayPal typeEmail(String data) {
		type(typeEmail,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement typePassword;
	
	
	public SignUpPagePayPal typePassword(String data) {
		type(typePassword,data);
		return this;
	}

	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement reEnterPassword;
	
	
	public SignUpPagePayPal typePasswordAgain(String data) {
		type(reEnterPassword,data);
		return this;
	}

	@FindBy(how=How.ID,using="_eventId_personal")
	private WebElement continueButton;
	
	
	public IamNotRobotPage clickContinue() {
		click(continueButton);
		return new IamNotRobotPage();
	}



}
