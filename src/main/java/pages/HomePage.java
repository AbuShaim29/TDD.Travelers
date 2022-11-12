package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class HomePage {

	
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	
	@FindBy(name = "zipCode")
	WebElement zipElement;
	
	
	@FindBy(id = "trans-fake-get-quote")
	WebElement productElement;
	
	@FindBy(xpath = "//label[@id='lbl-0-1']")
	WebElement autoElement;
	
	@FindBy(id = "body-btn-get-quote")
	WebElement startMyQuoteElement;
	
	public void autoSteps() {
	CommonActions.input(zipElement, "11230");
	CommonActions.click(productElement);
	CommonActions.click(autoElement);
	CommonActions.click(startMyQuoteElement);
	}
}
