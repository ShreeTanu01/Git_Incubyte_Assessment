package IncubyteWebAutomation.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboardPage {

	WebDriver driver;

	public UserDashboardPage(WebDriver driver) {
		//super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='panel header']//button[@type='button']")
	WebElement Dropdown;
	
	@FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
	WebElement SignOut;
	
	@FindBy(css = "div[class='panel header'] span[class='logged-in']")
	WebElement WelcomeText;
	
	@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement AccCreationConfirmationMsg;
	
	@FindBy(xpath = "")
	WebElement Sdf;
	
	public void clickdashboardDropdown()
	{
		Dropdown.click();
	}
	
	public void clickSignOut()
	{
		SignOut.click();
	}
	
	public String getWelcomeText()
	{
		return WelcomeText.getText();
	}
	
	public String accCreationConfirmationMsg()
	{
		return AccCreationConfirmationMsg.getText();
	}
}
