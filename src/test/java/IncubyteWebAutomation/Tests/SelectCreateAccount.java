package IncubyteWebAutomation.Tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import IncubyteWebAutomation.PageObject.CreateAccountPage;
import IncubyteWebAutomation.PageObject.LandingPage;
import IncubyteWebAutomation.PageObject.SignInPage;
import IncubyteWebAutomation.TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCreateAccount extends BaseTest{

//public static void main(String[] args)
	@Test
	public void test1() throws IOException, InterruptedException
	{
		CreateAccountPage CreateAccountPage = 	landingPage.ClickCreateAccount();
		CreateAccountPage.CreateAccount("abc", "xyz", "abc.xyz@gmail.com", "pwd", "pwd");
		
	}
		
}
