Feature: Validate scenarios on CRM page

	@loginCrm @Sanity
	Scenario Outline: Verify user is able to login into CRM
	Given user is already on login page
	When user enters "<username>" and "<password>"
	Then  user clicks on login button
	Then user is on home page
	Then close the browser

Examples: 
	| username | password     |
	| yogi123 | Admin@123     |
	
	@CrmContact @Regression @Sanity
	Scenario: user is able to create a new contact
	Given user is already on home page
	When user mouse hover on contacts link
	Then user click on New Contact link
	Then user enters all contact details
	Then user click on save button
	Then verify new contact created
	
	
	