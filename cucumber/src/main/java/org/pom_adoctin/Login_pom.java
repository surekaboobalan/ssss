package org.pom_adoctin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pom {
public WebDriver driver;
	
@FindBy(id="username")
private WebElement user;

public Login_pom(WebDriver driver2) {
	driver=driver2;
	PageFactory.initElements( driver2,this);
}
public WebElement getUser() {
	return user;
}
@FindBy(id="password")
private WebElement pass;

public WebElement getPass() {
	return pass;
}

@FindBy(id="login")
private WebElement login;

public WebElement getLogin() {
	return login;
}

	
}
