package com.apptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;



public class AppTest {
	WebDriver driver;
	@Test
	public void omrLogin() {
		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.xpath("//input[@id = 'email']"));
		txtUsername.sendKeys("vpnarne@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id = 'pass']"));
		txtPassword.sendKeys("Vishnu@2024");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value ='login']"));
		btnLogin.click();
		
		
		
	}

}
