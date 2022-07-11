package com.cydeo.step_definitions;

import com.cydeo.pages.FleetPage;
import com.cydeo.pages.VyTrackBasePage;
import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SeeAllVehilceServiceLogs {
    VyTrackLoginPage loginPage = new VyTrackLoginPage();
    Actions action = new Actions (Driver.getDriver());
    VyTrackBasePage base = new VyTrackBasePage();
    FleetPage fleetPage =new FleetPage();

// test 1
        @Given("I am a truck driver already loged in and on Vytrack Home page")
        public void i_am_a_truck_driver_already_loged_in_and_on_vytrack_home_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("env"));
            loginPage.login(ConfigurationReader.getProperty("driver_username"), ConfigurationReader.getProperty("driver_password"));
        }
        @When("I click on Fleet button")
        public void i_click_on_fleet_button() {
            action.moveToElement(base.fleetBtn).click().perform();

        }
        @When("I click on Vehicle serviece log")
        public void i_click_on_vehicle_serviece_log() {
            fleetPage.vehicleServicesLogsBtn.click();

        }
        @Then("I see the Vehicle Services Logs page")
        public void i_see_the_vehicle_services_logs_page() {
            Assert.assertTrue("VehicleServicesLogs", Driver.getDriver().getCurrentUrl().contains(
                    "VehicleServicesLogs") );
        }




    }
