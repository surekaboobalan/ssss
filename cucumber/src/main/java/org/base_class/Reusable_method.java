package org.base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Reusable_method{
public static WebDriver driver;

public static void browser_launch(String browser) {
	if (browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	} else if (browser.equalsIgnoreCase("chrome")) {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	} else {
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		
	}
}

public void geturl(String url) {
	driver.get(url);
}

public void send_keys(WebElement web, String s) {
	web.sendKeys(s);
}

public static void enter() throws Throwable {
	// TODO Auto-generated method stub
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}
public static void get_title() {
	String title = driver.getTitle();
	System.out.println("title of the page =="+title);
}
public static void click(WebElement web) {
	web.click();
}

public static void clear(WebElement web) {
	// TODO Auto-generated method stub
	web.clear();

}

public static void implicit_wait(int i) {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));

}
public static void ddindex(WebElement web, int i) {
	Select s = new Select(web);
	s.selectByIndex(i);

}

public static void ddoptions(String j, WebElement web) {
	Select s = new Select(web);
	s.selectByValue(j);
}

static void ddtext(String k, WebElement fruits) {
	Select s = new Select(fruits);
	s.selectByVisibleText(k);
}

public static void simple_alert(boolean aceept) {
	if (aceept == true) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	} else {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

}

public static void takscreenshoot(String imgname) throws Throwable {
	TakesScreenshot t = (TakesScreenshot) driver;
	File screenshotAs = t.getScreenshotAs(OutputType.FILE);
	File screen = new File("C:\\Users\\hey\\eclipse-workspace\\cucumber\\prtsc\\" + imgname + ".png");
	FileUtils.copyFile(screenshotAs, screen);
}

public static void framee(int i) {
	driver.switchTo().frame(i);

}

public static void java_script(int j) {
	JavascriptExecutor j1 = (JavascriptExecutor) driver;
	j1.executeScript("window.scrollBy(0," + j + ");");
}

public static void Clearcookies() {
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
}

public static void action_click() {
	Actions a = new Actions(driver);
	a.click().build().perform();

}
	public static String values;
public static String read_data() throws Throwable {
	File filepath=new File("C:\\Users\\hey\\eclipse-workspace\\cucumber\\amazon.xlsx");//path
	FileInputStream fi=new FileInputStream(filepath);//
	Workbook w= new XSSFWorkbook(fi);
	
	Sheet sheetAt = w.getSheetAt(1);
	
	Row row = sheetAt.getRow(1);
	
	Cell cell = row.getCell(0);
	
	CellType cellType = cell.getCellType();
	
	if (cellType.equals(cellType.STRING)) {
		//System.out.println(cell.getStringCellValue());
		values= cell.getStringCellValue();
		
	} else if (cellType.equals(cellType.NUMERIC)) {
		
		//System.out.println(cell.getNumericCellValue());
	double numericCellValue = cell.getNumericCellValue();
	
	int value=(int)numericCellValue;
	values = String.valueOf(value);
	//System.out.println(value);
		
	} 
	
return values;
	}



//public static void keys_robo() throws Throwable {
//Robot r=new Robot();
//
//}
public static void quit_q() {
	driver.quit();
	
}
}