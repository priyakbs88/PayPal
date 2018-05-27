package week9Day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.CreateLeadPage;
import wdMethods.ProjectMethods;

public class HomePagePayPal extends ProjectMethods {
	public HomePagePayPal() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="signup-button")
	private WebElement signUp;
	
	
	public RadioButtonPage selectSignUp() {
		clickWithNoSnap(signUp);
		return new RadioButtonPage();
	}

}
