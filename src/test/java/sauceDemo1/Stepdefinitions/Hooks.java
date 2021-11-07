package sauceDemo1.Stepdefinitions;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import sauceDemo1.StepImplemantation.BaseClass;

public class Hooks extends BaseClass{

	@After
	public void attachScreenShot(Scenario scenario) throws InterruptedException {
	    if (scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driver)
	                        .getScreenshotAs(OutputType.BYTES);
	            long date = new Date().getTime();
	            scenario.embed(screenshot, String.valueOf(date)); //stick it in the report
	    }
	    Thread.sleep(3000);
	}
	
//	@AfterSuite
//	public static void tearDown() {
//		driver.close();
//		driver.quit();
//	}
}
