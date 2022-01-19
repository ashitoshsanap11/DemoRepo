package com.facebook.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageObject {

	WebDriver driver;

	public void openURL() {
		System.setProperty("webdriver.chrome.driver", "C:\\1-Automation\\Shami Jha - Jan 2021 Batch\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}

	public void enterUsername() {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc");
	}

	public void enterPassword() {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9890800036");
	}

	public void clickLoginButton() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
public void New() {
	
}
}
