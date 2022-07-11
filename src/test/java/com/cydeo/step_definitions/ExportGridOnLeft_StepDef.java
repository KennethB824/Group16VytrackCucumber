package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.pages.VyTrackVehiclesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ExportGridOnLeft_StepDef {

    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
    VyTrackVehiclesPage vyTrackVehiclesPage = new VyTrackVehiclesPage();

    Actions action = new Actions(Driver.getDriver());

    @Given("user is on Vytrack login page")
    public void user_is_on_vytrack_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters username")
    public void user_enters_username() {
        vyTrackLoginPage.loginUser.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters password")
    public void user_enters_password() {
       vyTrackLoginPage.loginPass.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        vyTrackLoginPage.loginBtn.click();
    }
    @When("user hovers over Fleet module")
    public void user_hovers_over_fleet_module() {
        action.moveToElement(vyTrackVehiclesPage.fleetBtn).perform();
    }
    @When("user clicks on Vehicle button")
    public void user_clicks_on_vehicle_button() {
        BrowserUtils.waitForVisibilityOf(vyTrackVehiclesPage.vehiclesBtn);
    }
    @Then("user should be on Vehicle home page")
    public void user_should_be_on_vehicle_home_page() {
        BrowserUtils.waitForUrl("Car");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Car"));
    }

    @Then("user sees Export Grid button on the left of the page")
    public void user_sees_export_grid_button_on_the_left_of_the_page() {


    }
}
