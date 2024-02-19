package org.depedenc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Depedency {
	WebDriver driver;
	  @Test
	  @Ignore
	  public void google() {
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	  }
	  @Test(enabled =false)
	  
	  public void amazon() {
		  driver =new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
	  }
	  @Test
	  public void adoctin() {
		  driver =new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
	  }
	  @Test(dependsOnMethods ="adoctin")
	  public void adoctinlogin() {
		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("surekaboobalan");
		  WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys("7F9ML3");
		  WebElement login = driver.findElement(By.id("login"));
		  login.click();
	  }
	  
}
