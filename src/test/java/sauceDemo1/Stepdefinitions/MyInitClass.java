package sauceDemo1.Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sauceDemo1.StepImplemantation.BaseClass;

public class MyInitClass extends BaseClass{

	@Given("^User reloads the page$")
	public void user_reloads_page() {
		driver.navigate().refresh();
	}

	@Given("^User opens \"([^\"]*)\" Browser$")
	public void user_opens_browser(String browserName) {
		initBrowser(browserName);
	}

	@Given("User maximises browser")
	public void user_maximises_browser() {
		maximiseBrowser();
	}

	@Then("User hits url")
	public void user_hits_url() {
		navigateToUrl();
	}
}
