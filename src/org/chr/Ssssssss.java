package org.chr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ssssssss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hey\\eclipse-workspace-sureka\\Selenium\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://letcode.in/dropdowns");
driver.manage().window().maximize();

WebElement singledropdwn = driver.findElement(By.id("fruits"));
Select s=new Select(singledropdwn);
s.selectByValue("2");
Thread.sleep(4000);

s.selectByIndex(5);
Thread.sleep(4000);

s.selectByVisibleText("Apple");
Thread.sleep(4000);

boolean multiple = s.isMultiple();
System.out.println(multiple);

List<WebElement> options = s.getOptions();
for (WebElement option : options) {
	String text = option.getText();
	System.out.println("option="+text);
	
}


WebElement firstSelectedOption = s.getFirstSelectedOption();
String text1 = firstSelectedOption.getText();
System.out.println("firstSelectedOption="+text1);


}
}
