
Feature: User should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons in Vehicles page

	User Story: As a user when I am on Vytrack => Fleet => Vehicles,
	I should be able to see Export Grid dropdown, Refresh, Reset and
	Grid Settings Buttons

@wip
	Background:
		#@B26G16-33
		Given user is on VyTrack login page
		When user enters username
		And user enters password
		And user clicks on login button
		And user hovers over Fleet module
		And user clicks on Vehicle button
		Then user should be on Vehicle home page
		

	
	@B26G16-37 @B26G16-30
	Scenario: Refresh button should be on the left side of Reset button
		Then user should see refresh button on the left side of Reset button