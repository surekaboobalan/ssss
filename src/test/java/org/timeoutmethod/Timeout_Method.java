package org.timeoutmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout_Method {
	@Test
	  public void f() {
		  
	  }
	  private WebDriver driver;
	  @Test
	  public void cclick_amazon() throws Throwable {
		  Thread.sleep(3000);
		 WebElement link = driver.findElement(By.xpath("(//span[@role='text'])[1]"));
		 link.click();
	  }
		
	  @Test
	  public void agoogle() {
		 
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
	  }
	  // an exceptions as timeout exide the time thread.sleep that is timeout>thread.sleep
	  @Test(timeOut = 5000)
	  public void bsearch_amazon() throws Throwable {
		  Thread.sleep(6000);
		 WebElement search = driver.findElement(By.className("gLFyf"));
		 search.sendKeys("amazon"+Keys.ENTER);
	  }
}
