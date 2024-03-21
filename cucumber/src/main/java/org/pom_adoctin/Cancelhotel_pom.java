package org.pom_adoctin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cancelhotel_pom {
public static WebDriver driver;

@FindBy(xpath = "(//input[@type='checkbox'])[3]")
private WebElement chech_box;

public Cancelhotel_pom(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	driver=driver2;
	PageFactory.initElements(driver2,this);
}

public WebElement getChech_box() {
	return chech_box;
}

@FindBy(name = "cancelall")
private WebElement cancel_button;

public WebElement getCancel_button() {
	return cancel_button;
}


@FindBy(xpath = "//a[text()='Logout']")

private WebElement logout;

public WebElement getLogout() {
	return logout;
}
}
