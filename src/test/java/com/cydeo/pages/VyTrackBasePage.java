package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackBasePage {

    public VyTrackBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement fullName;

    @FindBy(linkText = "Logout")
    public WebElement logOutBtn;

    @FindBy(xpath = "(//span[contains(text(), 'Fleet')])[1]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//span[text() = 'Vehicles']")
    public WebElement vehiclesBtn;



    public void logout(){
        fullName.click();
        logOutBtn.click();
    }
}
