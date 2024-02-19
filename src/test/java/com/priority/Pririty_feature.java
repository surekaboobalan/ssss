package com.priority;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pririty_feature {
	private WebDriver driver;
	  @Test(priority=0)
	  public void cclick_amazon() throws Throwable {
		  Thread.sleep(3000);
		 WebElement link = driver.findElement(By.xpath("(//span[@role='text'])[1]"));
		 link.click();
	  }
		
	  @Test(priority=-2)
	  public void agoogle() {
		 
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
	  }
	  @Test(priority = -1)
	  public void bsearch_amazon() throws Throwable {
		  Thread.sleep(3000);
		 WebElement search = driver.findElement(By.className("gLFyf"));
		 search.sendKeys("amazon"+Keys.ENTER);
	  }
	}

