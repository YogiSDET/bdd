Feature: Validate scenarios on facebook page

	@login
	Scenario: Verify user is able to navigate facebook home page
	Given user is on facebook login page
	When user entered the login credential
	Then  user should redirected to home page