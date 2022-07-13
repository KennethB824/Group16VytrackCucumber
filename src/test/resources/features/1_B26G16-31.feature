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
		

	#User should be able to click Export Grid dropdown
	@B26G16-31 @B26G16-30
	Scenario: Click Export Grid dropdown
		When user clicks on Export Grid dropdown
		Then dropdown options should be visible