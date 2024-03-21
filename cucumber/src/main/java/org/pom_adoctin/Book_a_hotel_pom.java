package org.pom_adoctin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_a_hotel_pom {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='first_name']")
	private static WebElement firstname;

	public Book_a_hotel_pom(WebDriver driver2) {
		
		driver=driver2;
		PageFactory.initElements( driver2,this);
		
	}

	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(xpath = "//input[@id='last_name']")
	
	
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	
	@FindBy(name ="address" )
	private WebElement addr;

	public WebElement getAddr() {
		return addr;
	}
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cardnum;

	public WebElement getCardnum() {
		return cardnum;
	}
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement  cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expmonth;

	public WebElement getExpmonth() {
		return expmonth;
	}
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement exp_year;

	public WebElement getExp_year() {
		return exp_year;
	}
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement booknowbutton;

	public WebElement getBooknowbutton() {
		return booknowbutton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
