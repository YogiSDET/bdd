package StepDefinations;

import BaseClass.BaseClass;
import POM.CrmContactPg;
import POM.CrmHomePg;
import POM.CrmLoginPg;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrmStepCalendar extends BaseClass {
	
	CrmHomePg chp;
	
	
	@Given("user is on homepage of the crm")
	public void user_is_on_homepage_of_the_crm() throws InterruptedException {
		CrmLoginPg cl = new CrmLoginPg();
		cl.inpCrmLoginPgUserName("yogi123");
		cl.inpCrmLoginPgPassword("Admin@123");
		cl.clickCrmLoginPgLoginBn();
		setup();
		logger.info("login into account");
		chp = new CrmHomePg();
	
	}

	@When("user select date as per format")
	public void user_select_date_as_per_format() throws InterruptedException {
	chp.getMonthYear(7, "2019");
	
	}

	@Then("user should navigate to calendar screen")
	public void user_should_navigate_to_calendar_screen() throws InterruptedException {
		Thread.sleep(2000);
		chp.getDay("12");
	}
}
