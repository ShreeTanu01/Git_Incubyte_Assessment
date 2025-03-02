package IncubyteWebAutomation.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	WebDriver driver;
	public CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"firstname\"]")
	WebElement FirstName;
	
	@FindBy(xpath = "//*[@id=\"lastname\"]")
	WebElement LastName;
	
	@FindBy(xpath = "//*[@id=\"email_address\"]")
	WebElement Email;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"password-confirmation\"]")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button/span")
	WebElement CreateAnAccountBtn;
	
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
	WebElement PasswordConfirmation;
	
	public void CreateAccount(String FName, String LName,String EmailAddress ,String Pwd ,String ConfirmPwd) {
		FirstName.sendKeys(FName);
		LastName.sendKeys(LName);
		Email.sendKeys(EmailAddress);
		Password.sendKeys(Pwd);
		ConfirmPassword.sendKeys(ConfirmPwd);
	//	CreateAnAccountBtn.click();
		
	}
	
	public void CreateAnAccountBtn()
	{
		CreateAnAccountBtn.click();
	}
	public String PasswordConfirmationErrorMsg()
	{
		
		return PasswordConfirmation.getText();
	}
	
	
}
