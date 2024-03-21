package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\featurefile", glue="com.stepdef_oranhrm",
plugin = {"json:cucmberrreport.report1(json)"})
public class Runner {

	
}
 