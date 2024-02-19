package com.innovationcount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void login() {
	  driver=new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
		  driver.manage().window().maximize();
		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("surekaboobalan");
		  WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys("7F9ML3");
		  WebElement login = driver.findElement(By.id("login"));
		  login.click();
  }
  @Test
  public void searchhotel() {

	  WebElement location = driver.findElement(By.id("location"));
	  Select s=new Select(location);
	  s.selectByIndex(3);
	  WebElement hotels = driver.findElement(By.id("hotels"));
	  Select s1=new Select(hotels);
	  s1.selectByIndex(3);
  }
  @Test
  public void selectholte() {
	  
  }
  @Test
  public void details() {
  }
  @Test
  public void logout() {
  }
}
