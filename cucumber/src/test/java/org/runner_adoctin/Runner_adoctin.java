package org.runner_adoctin;

import org.base_class.Reusable_method;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\adoctin.feature",
glue = "org.step_adoctin",plugin = "html:target/cucumber-report.html")
public class Runner_adoctin extends Reusable_method {

	public static WebDriver driver;
	@BeforeClass
	public static void set_up() {
		// TODO Auto-generated method stub
browser_launch("chrome");
	}
	
//	@AfterClass
//	public static  void tear_down() {
//		quit_q();
//	}

}
