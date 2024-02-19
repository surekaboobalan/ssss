package org.paralel;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_test{
	  @Test
	  
	  public void f() {
		 // WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  
	  @Test
	  public void f1() { 
		 // WebDriverManager.edgedriver().setup();
		  WebDriver driver1=new EdgeDriver();
		  driver1.manage().window().maximize();
	  }
	  
}
