package org.pom_adoctin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotelpom {

	public static WebDriver driver; 
	
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio_button;

	public Select_hotelpom(WebDriver driver2) {
	
		driver=driver2;
		PageFactory.initElements(driver2,this);
		
	}

	public WebElement getRadio_button() {
		return radio_button;
	}
	@FindBy(id = "continue")
	private WebElement continuee;

	public WebElement getContinuee() {
		return continuee;
	}
}
