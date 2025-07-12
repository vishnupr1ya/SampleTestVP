package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Validation {
	WebDriver driver;
	@Test
	public void validationAppTest() {
		driver = new ChromeDriver();
		WebElement textWelcome = driver.findElement(By.xpath("//a[@data-testid = 'username']"));
		String text =  textWelcome.getText();
		Assert.assertEquals(text, "Welcome Vishnu");
	}

}
