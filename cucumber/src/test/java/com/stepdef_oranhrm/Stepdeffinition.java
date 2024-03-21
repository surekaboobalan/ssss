package com.stepdef_oranhrm;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdeffinition {
	WebDriver driver;
	
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    
	}
	@When("user enter the username as {string}")
	public void user_enter_the_username_as(String uname) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(uname);
		
	    	}
	@When("user enter the password as {string}")
	public void user_enter_the_password_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
		
	}
	@When("user click on the login button")
	public void user_click_on_the_login_button() {
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	@Then("user shuold navigate to the dashboard page")
	public void user_shuold_navigate_to_the_dashboard_page() {
	    String currentUrl = driver.getCurrentUrl();
	   String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	   Assert.assertEquals(currentUrl,expectedURL);
	}

}
