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

public class temp extends BaseTest{

//public static void main(String[] args)
	@Test
	public void test1() throws IOException, InterruptedException
	{
		 //landingPage = launchApplication(); 
		 //landingPage.ClickSignIn();
		 SignInPage SignInPage = 	landingPage.ClickSignIn();
			SignInPage.LoginApp("kittu.kolhatkar@gmail.com", "Windows@123");
		
		//LandingPage  LandingPage= new LandingPage(driver);
		//LandingPage.GoTo("https://magento.softwaretestingboard.com/");
	
		//LandingPage  LandingPage = landingPage;
		//SignInPage SignInPage = new SignInPage(driver);
		
		
		
		//CreateAccountPage CreateAccountPage = LandingPage.ClickCreateAccount();
		//CreateAccountPage.CreateAccount("abc", "xyz", "abc.xyz@gmail.com", "pwd", "pwd");
		
		
	//	driver.findElement(By.xpath("//a[contains(text(), 'Create an Account')]")).click();
	//	driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(args);
		//sign in
		/*driver.findElement(By.xpath("//a[contains(text(), \"Sign\")]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kittu.kolhatkar@gmail.com");
		driver.findElement(By.xpath("//*[@title=\"Password\"]")).sendKeys("Windows@123");
		driver.findElement(By.xpath("//button[@class=\"action login primary\"]")).click();
	  Boolean match =	driver.findElement(By.xpath("//span[@class=\"logged-in\" and text()=\"Welcome, kittu kolhatkar!\"]")).isDisplayed();
	Assert.assertTrue(match);*/
	}
	
	
}
