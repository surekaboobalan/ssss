package org.ignore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoree {
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
}
