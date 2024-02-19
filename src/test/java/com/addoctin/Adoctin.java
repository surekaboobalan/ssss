package com.addoctin;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Adoctin {
	WebDriver driver;
	//priority=-3
  @Test(priority = -3)
  public void url(){
	  driver=new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/");
	  driver.manage().window().maximize();
	  
  }
//priority=-2
  @Test(priority = -2)
  public void login() {
	
	  WebElement username = driver.findElement(By.id("username"));
	  username.sendKeys("surekaboobalan");
	  WebElement password = driver.findElement(By.id("password"));
	  password.sendKeys("7F9ML3");
	  WebElement login = driver.findElement(By.id("login"));
	  login.click();
  }
  
  
  
  
  //priority=-1
  @Test(priority = -1)
  public void searchhotel() {
	
	  WebElement location = driver.findElement(By.id("location"));
	  Select s=new Select(location);
	  s.selectByIndex(3);
	  WebElement hotels = driver.findElement(By.id("hotels"));
	  Select s1=new Select(hotels);
	  s1.selectByIndex(3);
  }
  
  
  //excepted exception
  @Test(expectedExceptions = org.openqa.selenium.NoSuchElementException.class)
  public void room() {
	WebElement room = driver.findElement(By.xpath("//select[@name='room_nos']"));
	  Select s2=new Select(room);
	  s2.selectByIndex(15);
  }
  
  //ignore
  
  @Test
  @Ignore
  public void ignore() {
	  driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
  }
  @Test
  public void roommtype() {
	  WebElement room = driver.findElement(By.xpath("//select[@name='room_nos']"));
	  Select s2=new Select(room);
	  s2.selectByIndex(2);
	  
	  WebElement roomnos = driver.findElement(By.xpath("//select[@id='room_nos']"));
	  Select s3=new Select(roomnos);
	  s3.selectByIndex(2);
	  
  }
//dependsOnMethods
  @Test(dependsOnMethods = "roommtype")
  public void adults() {
	  WebElement adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
	  Select s4=new Select(adults);
	  s4.selectByIndex(2);
	  WebElement Submit = driver.findElement(By.id("Submit"));
	  Submit.click();
  }
  
  //timeout
  @Test(timeOut = 5000)
  public void radiobutton() throws Throwable {
	Thread.sleep(3000);
	  WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	  boolean enabled = radiobutton.isEnabled();
	  if (enabled==true) {
		  radiobutton.click();
	}
	  
	Thread.sleep(3000);
	WebElement cont = driver.findElement(By.id("continue"));
	cont.click();
  }
////  
////  
  @Test
  public void hervey() throws Throwable {
	  Thread.sleep(3000);
	WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
	name.sendKeys("sureka");
	WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
	lname.sendKeys("boobalan");
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("kk nagar.ch-78.");
	WebElement card = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
	card.sendKeys("1234 5678 9102 1234");
	
	WebElement cardtyp = driver.findElement(By.xpath("//select[@id='cc_type']"));
	Select s5=new Select(cardtyp);
	s5.selectByIndex(2);
	

	WebElement day = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	Select s6=new Select(day);
	s6.selectByIndex(12);
	
	WebElement yr = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	Select s7=new Select(yr);
	s7.selectByIndex(5);
	
	WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
	cvv.sendKeys("123");
  }
  
  //invocationCount = 2
  @Test(invocationCount = 2)
  public void date() {
	WebElement book = driver.findElement(By.xpath("//input[@type='button']"));
	book.click();
  }
}
