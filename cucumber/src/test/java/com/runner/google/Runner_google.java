

package com.runner.google;

import org.base_class.Reusable_method;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\google.feature",
glue = "com.stepdef_google",

plugin = "html:target/cucumbergoogle-report.html"
)



public class Runner_google extends Reusable_method {
	
	public static WebDriver driver;
@BeforeClass
public static void set_up() throws Throwable {
	// TODO Auto-generated method stub
Thread.sleep(3000);
browser_launch("chrome");

}

@AfterClass
public static void tear_down() throws Throwable{
	Thread.sleep(5000);
	quit_q();
}
	
}
