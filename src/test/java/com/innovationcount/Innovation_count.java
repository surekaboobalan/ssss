package com.innovationcount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Innovation_count {
	WebDriver driver;
	  @Test(invocationCount = 3)
	  public void f() {
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://adactinhotelapp.com/");
	 }
}
