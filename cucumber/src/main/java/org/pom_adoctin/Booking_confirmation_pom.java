package org.pom_adoctin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_confirmation_pom {
 public static WebDriver driver;
 
 @FindBy(xpath = "(//input[@type='button'])[2]")
 private WebElement iteracy;

public Booking_confirmation_pom(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	driver=driver2;
	PageFactory.initElements( driver2,this);
}

public WebElement getIteracy() {
	return iteracy;
}



}
