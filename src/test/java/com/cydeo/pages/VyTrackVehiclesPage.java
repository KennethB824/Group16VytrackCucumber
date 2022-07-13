package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackVehiclesPage extends VyTrackBasePage{

    public VyTrackVehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement carsHeader;

    @FindBy(xpath = "//a[contains(@title,'With')]")
    public WebElement exportGridBtn;

    @FindBy(xpath = "//div[@class='pull-right grid-toolbar-tools']//a[contains(@title,'Refresh')]")
    public WebElement refreshBtn;

    @FindBy(xpath = "//div[@class='pull-right grid-toolbar-tools']//a[contains(@title,'Reset')]")
    public WebElement resetBtn;

    @FindBy(xpath = "//div[@class='pull-right grid-toolbar-tools']//a[contains(@title,'Grid')]")
    public WebElement gridSettingsBtn;

    @FindBy(xpath="//a[@title='CSV']")
    public WebElement csvBtn;

    @FindBy(xpath="//a[@title='XLSX']")
    public WebElement xlsxBtn;
}
