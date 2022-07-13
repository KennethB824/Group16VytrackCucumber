@B26G16-43
Feature: Default

	Background:
		#@B26G16-33
		Given user is on VyTrack login page
		When user enters username
		And user enters password
		And user clicks on login button
		And user hovers over Fleet module
		And user clicks on Vehicle button
		Then user should be on Vehicle home page
		

	#User should be able to click the Grid Settings button
	@B26G16-38 @B26G16-30 @B26G16-43
	Scenario: Grid Settings button
		When user click on the Grid Settings button
		Then user can see the drop down menu