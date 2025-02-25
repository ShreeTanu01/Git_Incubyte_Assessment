package IncubyteWebAutomation.Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import IncubyteWebAutomation.PageObject.CreateAccountPage;
import IncubyteWebAutomation.PageObject.LandingPage;
import IncubyteWebAutomation.PageObject.SignInPage;
import IncubyteWebAutomation.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectSignIn extends BaseTest{

//public static void main(String[] args)
	@Test(dataProvider = "getData",groups= {"MultipleUserCheck"})
	public void test1(String Email ,String Password) throws IOException, InterruptedException
	{
		 SignInPage SignInPage = 	landingPage.ClickSignIn();
		 SignInPage.LoginApp(Email, Password);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {{"kittu.kolhatkar@gmail.com","Windows@123"},{"abc.xyz@gmail.com","pwd"}};
	}
	
	
}
