package IncubyteWebAutomation.Stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import IncubyteWebAutomation.PageObject.CreateAccountPage;
import IncubyteWebAutomation.PageObject.LandingPage;
import IncubyteWebAutomation.PageObject.SignInPage;
import IncubyteWebAutomation.TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupStepDefinition extends BaseTest{
	public LandingPage landingpage;
	public CreateAccountPage createAccountPage;
	public SignInPage signinpage ;

    @Given("User is in landing page")
    public void I_go_to_landingPage() throws IOException {
		landingpage =	launchApplication();
	}
    
	@Given("I visit the Magento website")
	public void iVisitTheMagentoWebsite() throws IOException {
		landingpage =	launchApplication();
	}

	@When("I navigate to the sign-up page")
	public void iNavigateToSignUpPage() {
		createAccountPage = 	landingPage.ClickCreateAccount();
	}

	@When("^I fill in the sign-up form with the following details:(.+) (.+) (.+) (.+) (.+)$")
	public void iFillInSignUpForm(String NAME ,String LASTNAME ,String EMAIL,String PASSWORD,String CONFIRMPASSWORD) {
		createAccountPage.CreateAccount(NAME, LASTNAME , EMAIL, PASSWORD, CONFIRMPASSWORD);
	}

	@When("I submit the sign-up form")
	public void iSubmitTheSignUpForm() {
		createAccountPage.CreateAnAccountBtn();
	}

	@Then("I should see the account creation confirmation message")
	public void iShouldSeeAccountCreationConfirmation() {
		createAccountPage.PasswordConfirmationErrorMsg();
		Assert.assertEquals("Thank you for registering with Main Website Store.", createAccountPage.PasswordConfirmationErrorMsg());
	}

	@Then("I should be redirected to the account dashboard")
	public void iShouldBeRedirectedToAccountDashboard(String NAME ,String LASTNAME) {
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertTrue(currentUrl.contains("Welcome, "+NAME+" "+LASTNAME+"!"));
	}

	@When("^I sign in using the newly created account with the following credentials:(.+) (.+)$")
	public void iSignInUsingTheNewlyCreatedAccount(String EMAIL,String PASSWORD) {
		signinpage.LoginApp(EMAIL, PASSWORD);
	}

	@Then("I should be successfully signed in and see the account dashboard")
	public void iShouldBeSuccessfullySignedIn(String NAME ,String LASTNAME) {
		 String currentUrl = driver.getCurrentUrl();
		 Assert.assertTrue(currentUrl.contains("Welcome, "+NAME+" "+LASTNAME+"!"));
		 driver.close();
	}

}
