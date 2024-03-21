package org.pomgoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_pom {

	public static WebDriver driver;
	
	@FindBy(xpath  ="//textarea[@title='Search']")
	private WebElement search;

	public Google_pom(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver=driver2;
		PageFactory.initElements( driver2,this);
	}

	public WebElement getSearch() {
		return search;
	}
	
	
}
