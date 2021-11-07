package sauceDemo1.Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sauceDemo1.StepImplemantation.BaseClass;

public class MyLoginClass extends BaseClass{
	
	@When("User enters username as {string}")
	public void user_enters(String userName) {
		WebElement username=driver.findElement(By.id("user-name"));
		username.clear();
		username.sendKeys(userName);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String passWord) {
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(passWord);
	}
	
	@Then("User hits login button")
	public void user_hits_login_button() {
	    WebElement login=driver.findElement(By.id("login-button"));
	    login.click();
	}

	@Then("User gets {string}")
	public void user_gets(String expectedMessage) {
		WebElement errorCloseButton = driver.findElement(By.cssSelector("button.error-button"));
		if(errorCloseButton.isDisplayed()) {
			WebElement actualMessage=driver.findElement(By.tagName("h3"));
			   String text=actualMessage.getText();
			   System.out.println(text);
			   Assert.assertTrue(text.contains(expectedMessage));
			   errorCloseButton.click();
		}
	   
	}
}
