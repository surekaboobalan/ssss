package com.priority;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
  @Test(priority=0)
  public void click_amazon() {
	 WebElement link = driver.findElement(By.linkText("Amazon.in"));
	 link.click();
  }
	
  @Test(priority = -2)
  public void google() {
	   driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
  }
  @Test(priority = -1)
  public void search_amazon() {
	 WebElement search = driver.findElement(By.className("SDkEP"+Keys.ENTER));
	 search.sendKeys("amazon");
  }
}
