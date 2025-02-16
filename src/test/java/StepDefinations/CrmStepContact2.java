package StepDefinations;

import BaseClass.BaseClass;
import POM.CrmContactPg;
import POM.CrmLoginPg;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrmStepContact2 extends BaseClass{
	
	CrmContactPg crm;
	
	@Given("user is already on home page")
	public void user_is_already_on_home_page() throws InterruptedException {
			CrmLoginPg cl = new CrmLoginPg();
			crm = new CrmContactPg();
			cl.inpCrmLoginPgUserName("yogi123");
			cl.inpCrmLoginPgPassword("Admin@123");
			cl.clickCrmLoginPgLoginBn();
			setup();
			logger.info("login into account");
		}
	   

	@When("user mouse hover on contacts link")
	public void user_mouse_hover_on_contacts_link() throws InterruptedException {
		crm.CrmContactPgContactEle();
		logger.info("click on contact dropdown");
	}

	@Then("user click on New Contact link")
	public void user_click_on_new_contact_link() {
	    crm.clickCrmContactPgNewContact();
	    logger.info("new contact page loaded");
	}

	@Then("user enters all contact details")
	public void user_enters_all_contact_details() {
	    crm.inpCrmContactPgFirstName();
	    crm.inpCrmContactPgLastName();
	    crm.selectCategory("Friend");
	    crm.selectStatus("Active");
	    crm.inpCrmContactPgPhone();
	    crm.inpCrmContactPgEmail();
	    crm.inpCrmContactPgNickname();
	    crm.inpCrmContactPgRadiomailbtn();
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		crm.clickCrmContactPgSavebtn();
	}

	@Then("verify new contact created")
	public void verify_new_contact_created() {
		System.out.println("verified");
	}

}
