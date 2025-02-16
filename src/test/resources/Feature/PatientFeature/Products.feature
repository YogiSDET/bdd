Feature: Validate scenarios on Products page

Scenario: verify user is able to navigate to product details page
Given user is on product page
When user clicks on product name hyperlink
Then user should get navigated to product details page


Scenario: verify user is able to navigate to edit product page
Given user is on product page
When user clicks on edit product icon displayed in grid
Then user should get navigated to edit product page


Scenario: verify user is able to navigate to add product page
Given user is on product page
When user clicks on add product icon displayed in grid
Then user should get navigated to add product page


Scenario: verify grid functions are working fine on Products page
Given user is on product page
When user clicks on view grid functions
Then verify product records are matching with grid records
And verify rows per page options with rows in products grid

