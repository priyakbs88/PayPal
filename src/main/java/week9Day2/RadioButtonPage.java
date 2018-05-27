package week9Day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.CreateLeadPage;
import wdMethods.ProjectMethods;

public class RadioButtonPage extends ProjectMethods {
	public RadioButtonPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement radioButton;
	
	
	public void verifyRadioButton() {
		boolean verifySelected = verifySelected(radioButton);
		if(!verifySelected)
		{
			click(radioButton);
		}
	}
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement nextButton;
	public SignUpPagePayPal clickNext()
	{
		clickWithNoSnap(nextButton);
		return new SignUpPagePayPal();
	}
	

}
