package IncubyteWebAutomation.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedInPage {

	WebDriver driver;

	public LoggedInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="")
	WebElement Email;
	
	@FindBy(xpath = "")
	WebElement Password;
	
	@FindBy(xpath = "//button[@class=\"action login primary\"]")
	WebElement SubmitBtn;
	
	
}
