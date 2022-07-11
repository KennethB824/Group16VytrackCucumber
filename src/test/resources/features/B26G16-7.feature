Feature: Access Vehicle serviece Log
  US: As a truck driver I should be able to access Vehicle serviece Log

  @wip
  Scenario: 1. Truck driver can see all Vehilce service logs
  Given I am a truck driver already loged in and on Vytrack Home page
  When I click on Fleet button
  And I click on Vehicle serviece log
  Then I see the Vehicle Services Logs page