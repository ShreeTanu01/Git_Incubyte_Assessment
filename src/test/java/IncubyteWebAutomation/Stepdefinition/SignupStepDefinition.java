package IncubyteWebAutomation.Stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import IncubyteWebAutomation.PageObject.CreateAccountPage;
import IncubyteWebAutomation.PageObject.LandingPage;
import IncubyteWebAutomation.PageObject.SignInPage;
import IncubyteWebAutomation.PageObject.UserDashboardPage;
import IncubyteWebAutomation.TestComponents.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupStepDefinition extends BaseTest{
	public LandingPage landingpage;
	public CreateAccountPage createAccountPage;
	public SignInPage signinpage ;
    public UserDashboardPage userDashboardPage;
    
    @Given("User is in Magento landing page")
    public void I_go_to_landingPage() throws IOException {
		landingpage =	launchApplication();
		System.out.println("Landing Page Initialized:  Background " + landingPage); 
	}

	@Given("I navigate to the sign-up page")
	public void iNavigateToSignUpPage() {
	    System.out.println("Landing Page: Scenario  " + landingPage);  // Debug log to check if landingPage is null
	    createAccountPage = landingPage.ClickCreateAccount();
	    System.out.println("Create Account Page: " + createAccountPage);
		//createAccountPage = landingPage.ClickCreateAccount();
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
		userDashboardPage = new UserDashboardPage(driver);
		Assert.assertEquals("Thank you for registering with Main Website Store.", userDashboardPage.accCreationConfirmationMsg());
	}

	@And("^I should be see the account dashboard have (.+) (.+)$")
	public void iShouldBeRedirectedToAccountDashboard(String NAME ,String LASTNAME) {
	    String currentWelcomeText = userDashboardPage.getWelcomeText();;
	    Assert.assertTrue(currentWelcomeText.contains("Welcome, "+NAME+" "+LASTNAME+"!"));
	}
	
	@Then ("I should logout and click on signinPage")
	public void logoutAccountDashboard() {
		userDashboardPage.clickdashboardDropdown();
		userDashboardPage.clickSignOut();
		landingPage.ClickSignIn();
	}

	@When("^I sign in using the newly created account with the following credentials:(.+) (.+)$")
	public void iSignInUsingTheNewlyCreatedAccount(String EMAIL,String PASSWORD) {
		signinpage = new SignInPage(driver);
		signinpage.LoginApp(EMAIL, PASSWORD);
	}

	@Then("^I should be successfully signed in and see the account dashboard have (.+) (.+)$")
	public void iShouldBeSuccessfullySignedIn(String NAME ,String LASTNAME) {
		 String currentWelcomeText = userDashboardPage.getWelcomeText();;
		 Assert.assertTrue(currentWelcomeText.contains("Welcome, "+NAME+" "+LASTNAME+"!"));
		 driver.close();
	}

}
