package IncubyteWebAutomation.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import IncubyteWebAutomation.PageObject.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

@Test
public void kittu()
{
	

//	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		
		LandingPage  LandingPage= new LandingPage(driver);
		
		//.findElement(By.xpath("//a[contains(text(), 'Create an Account')]")).click();
		//driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(args);
		//sign in
		driver.findElement(By.xpath("//a[contains(text(), \"Sign\")]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kittu.kolhatkar@gmail.com");
		driver.findElement(By.xpath("//*[@title=\"Password\"]")).sendKeys("Windows@123");
		driver.findElement(By.xpath("//button[@class=\"action login primary\"]")).click();
	  Boolean match =	driver.findElement(By.xpath("//span[@class=\"logged-in\" and text()=\"Welcome, kittu kolhatkar!\"]")).isDisplayed();
	Assert.assertTrue(match);
	}
}
