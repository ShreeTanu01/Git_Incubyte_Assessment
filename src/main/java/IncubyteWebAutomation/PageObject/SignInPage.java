package IncubyteWebAutomation.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement Email;
	
	@FindBy(xpath = "//*[@title=\"Password\"]")
	WebElement Password;
	
	@FindBy(xpath = "//button[@class=\"action login primary\"]")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
	WebElement ErrorMessage;

	
	public void LoginApp(String email , String passwrd)
	{
		Email.sendKeys(email);
		Password.sendKeys(passwrd);
		SubmitBtn.click();
	}
	
	public String getErrorMessage()
	{
		return ErrorMessage.getText();
	}
}
