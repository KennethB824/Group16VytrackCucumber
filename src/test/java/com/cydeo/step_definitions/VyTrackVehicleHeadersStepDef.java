package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackBasePage;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class VyTrackVehicleHeadersStepDef {

    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
    VyTrackVehiclesPage vyTrackVehiclesPage = new VyTrackVehiclesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


    Actions action = new Actions(Driver.getDriver());

    @Given("user is on VyTrack login page")
    public void user_is_on_vy_track_login_page() {
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
        vyTrackVehiclesPage.vehiclesBtn.click();
    }
    @Then("user should be on Vehicle home page")
    public void user_should_be_on_vehicle_home_page() {

        BrowserUtils.waitForUrl("Car");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Car"));
    }
    @Then("user should see refresh button on the left side of Reset button")
    public void user_should_see_refresh_button_on_the_left_side_of_reset_button() {
        BrowserUtils.ifButtonOnTheLeft("Refresh", "Reset");

    }


    @When("user clicks on reset button")
    public void user_clicks_on_reset_button() {

        wait.until(ExpectedConditions.visibilityOf(vyTrackVehiclesPage.gridSettingsBtn));

        vyTrackVehiclesPage.gridSettingsBtn.click();

        List<WebElement>list =  Driver.getDriver().findElements(By.xpath("//tr[@class='renderable']"));

        int numberOne = list.size();

        list.get(0).click();

        WebElement closeBtn = Driver.getDriver().findElement(By.xpath("//span[@class='close']"));
        closeBtn.click();

        vyTrackVehiclesPage.resetBtn.click();

        wait.until(ExpectedConditions.visibilityOf(vyTrackVehiclesPage.gridSettingsBtn));

        vyTrackVehiclesPage.gridSettingsBtn.click();

        List<WebElement>list2 =  Driver.getDriver().findElements(By.xpath("//tr[@class='renderable']"));

        int numberTwo = list.size();

        closeBtn.click();

        Assert.assertEquals(numberOne, numberTwo);
    }

    @Then("user can see the page is reset")
    public void user_can_see_the_page_is_reset() {



    }

}
/*
Larisa's User Story code:
WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(vyTrackVehiclesPage.refreshBtn));
        vyTrackVehiclesPage.refreshBtn.click();
 */