package org.pom_adoctin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotelpom {

	public static WebDriver driver;
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	public Search_hotelpom(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(id="hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}
	@FindBy(xpath = "//select[@id='room_type']")
	public WebElement room_typ;

	public WebElement getRoom_typ() {
		return room_typ;
	}
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement room_nos;
	
	

	public WebElement getRoom_nos() {
		return room_nos;
	}
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement date_pickin;

	public WebElement getDate_pickin() {
		return date_pickin;
	}
	
@FindBy(xpath = "//input[@id='datepick_out']")
private WebElement date_pickout;

public WebElement getDate_pickout() {
	return date_pickout;
}
 @FindBy(xpath = "//select[@id='adult_room']")
  private WebElement adult_room;

public WebElement getAdult_room() {
	return adult_room;
}
@FindBy(xpath = "//select[@id='child_room']")
private WebElement child;
public WebElement getChild() {
	return child;
}

@FindBy(id = "Submit")
 private WebElement Submit;

public WebElement getSubmit() {
	return Submit;
}






















}


