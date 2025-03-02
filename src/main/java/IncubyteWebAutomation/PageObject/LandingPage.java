package IncubyteWebAutomation.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IncubyteWebAutomation.AbstractComponent.AbstractComponent;

public class LandingPage extends AbstractComponent{
WebDriver driver;
public LandingPage(WebDriver driver)
{
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

/*public LandingPage(WebDriver driver)
{
	this.driver=driver;

}*/
//WebElement CreateAccount = driver.findElement(By.xpath("//a[contains(text(), 'Create an Account')]"));
//WebElement SignIn = driver.findElement(By.xpath("//a[contains(text(), \"Sign\")]"));

//@FindBy(xpath = "//a[contains(text(), 'Create an Account')]")
@FindBy(xpath="//div[@class='panel header']//a[normalize-space()='Create an Account']")
WebElement createAccount;

//@FindBy(xpath = "//a[contains(text(), \"Sign\")]")
@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
WebElement SignIn;




public void GoTo() {driver.get("https://magento.softwaretestingboard.com/");};
public SignInPage ClickSignIn() {
	SignIn.click();
	SignInPage SignInPage = new SignInPage(driver);
	return SignInPage;
}
public CreateAccountPage ClickCreateAccount() {
	createAccount.click();
	CreateAccountPage CreateAccountPage = new CreateAccountPage(driver);
	return CreateAccountPage;
}
}
