package StepDefinations;


import org.junit.Assert;

import BaseClass.BaseClass;
import POM.CrmLoginPg;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrmStepLoginPg extends BaseClass{
	
	CrmLoginPg crm;
	
	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
	  crm = new CrmLoginPg();
	  setup();
	  logger.info("Here We are tring to application");			// log file will generate and what action you perform will show
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String userName, String Password) {
		crm.inpCrmLoginPgUserName(userName);
		crm.inpCrmLoginPgPassword(Password);
		logger.info("Here we have insert username and password");
		
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		crm.clickCrmLoginPgLoginBn();
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home Page Title :"+title);
		Assert.assertEquals("CRMP", title);
	}

	@Then("close the broswer")
	public void close_the_broswer() {

	}
}
