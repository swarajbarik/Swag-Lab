package sauceDemo1.StepsRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/saucedemo/resources/features" }, glue = { "src/test/java/sauceDemo1/Stepdefinitions" },
		plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true, dryRun = false

)

public class RunnerClass {

}
