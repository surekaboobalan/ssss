package org.paralel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parelel {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
  @Test
  public void f1() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  
}
