Feature: Perform testing on edit Receipts page

@EditReceipts @regression @sanity 
Scenario: verify user is on edit receipt page
Given user navigates to receipt page
When user click on receipts edit hyperlink
Then user navigates to edit receipt page

Scenario: user edit receipts details section and save receipts
Given user navigates to receipt page
When user clicks on receipts edit hyperlink
And user edits receipts details section and save receipts
Then user verifies receipts edited successfully


Scenario: user adds new product to edit receipt
Given user navigates to receipt page
When user clicks on receipts edit hyperlink
Then verify product added successfully 


Scenario: user adds new procedure to edit receipt
Given user navigates to receipt page
When user clicks on receipts edit hyperlink
Then verify procedure added successfully