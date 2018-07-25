package com.app.cukerunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="",
		features = "src/test/resources/com/app/features",
		glue = "com/app/definitions",
		dryRun=false
		
		)
public class CukeRunner {

}
