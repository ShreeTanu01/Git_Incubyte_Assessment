package IncubyteWebAutomation.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import IncubyteWebAutomation.PageObject.CreateAccountPage;
import IncubyteWebAutomation.PageObject.SignInPage;
import IncubyteWebAutomation.TestComponents.BaseTest;

public class ErrorValidation extends BaseTest{
	
	
	@Test(groups = {"ErrorHandling"})
//	@Test(groups = {"ErrorHandling"},retryAnalyzer=Retry.class)
	public void ErrorValidationForInvalidEmail() throws IOException, InterruptedException
	{
		
		 SignInPage SignInPage = 	landingPage.ClickSignIn();
			SignInPage.LoginApp("kittuSSS.kolhatkar@gmail.com", "Windows@123");
			Assert.assertEquals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.", SignInPage.getErrorMessage());
	}
	
	
	@Test(groups = {"ErrorHandling"})
	public void ErrorValidationForInvalidPassword() throws IOException, InterruptedException
	{
		 SignInPage SignInPage = 	landingPage.ClickSignIn();
			SignInPage.LoginApp("kittu.kolhatkar@gmail.com", "Windows@1234444444444");
			Assert.assertEquals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.", SignInPage.getErrorMessage());
	}
	
	@Test(groups = {"ErrorHandling"})
	public void PasswordNotSame() throws IOException, InterruptedException
	{
		CreateAccountPage CreateAccountPage = 	landingPage.ClickCreateAccount();
		CreateAccountPage.CreateAccount("abc", "xyz", "abc.xyz@gmail.com", "xrfc", "pwd");
		Assert.assertEquals("Please enter the same value again.", CreateAccountPage.PasswordConfirmationErrorMsg());
	}
}
