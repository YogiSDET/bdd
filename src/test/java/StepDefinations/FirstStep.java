package StepDefinations;

import BaseClass.BaseClass;
import POM.FBloginPg;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStep extends BaseClass {
	
	FBloginPg fbg;
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
		launchBrowser();
	   fbg=new FBloginPg();
	   
	}

	@When("user entered the login credential")
	public void user_entered_the_login_credential() {
	   fbg.enterUserName();
	   fbg.enterPassword();
	}

	@Then("user should redirected to home page")
	public void user_should_redirected_to_home_page() throws InterruptedException {
	    fbg.clickOnLoginBn();
	}

}
