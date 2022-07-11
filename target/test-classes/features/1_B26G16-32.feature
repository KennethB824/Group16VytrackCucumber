Feature: Default

	Background:
		#@B26G16-33
		Given user is on Vytrack login page
		When user enters username
		And user enters password
		And user clicks on login button
		And user hovers over Fleet module
		And user clicks on Vehicle button
		Then user should be on Vehicle home page
		

	#Export Grid dropdown is on the left of the page
	@B26G16-32 @B26G16-30
	Scenario: Export Grid dropdown is on the left of the page
		Given user is on Vehicle page
		Then user sees Export Grid button on the left of the page