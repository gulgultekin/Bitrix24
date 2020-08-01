package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[@id='feed-add-post-form-tab-tasks']/span")
    //*[@id="feed-add-post-form-tab-tasks"]/span
    public WebElement taskIcon;


    @FindBy(id = "feed-add-post-form-tab-tasks" )
    public WebElement uploadTaskIcon;

    @FindBy()
    public WebElement uploadFilesAndImages;

    @FindBy(linkText = "Select document from Bitrix24")
    public WebElement selectDocumentFromBitrix24;


    @FindBy(id ="Select document")
    public WebElement selectDocument;


    @FindBy(id = "Cancel")
    public WebElement cancelselectDocument;


    @FindBy(linkText = "Download from external drive")
    public WebElement downloadFromExternalDrive;



    @FindBy(linkText = "office365")
    public WebElement externalDriveOffice365;


    @FindBy(linkText = "Google Drive")
    public WebElement googleDrive;

    @FindBy(linkText = "Dropbox")
    public WebElement dropBox;

    @FindBy()
    public WebElement createUsingDesktopApplications;

    @FindBy()
    public WebElement desktopApplications;

    @FindBy()
    public WebElement googleDocs;


    @FindBy()
    public WebElement DesktopAppOffice365;


    @FindBy()
    public WebElement MSOfficeOnline;


    @FindBy(xpath = "(//*[text()='Activity Stream'])[2]")
    public WebElement activityStreamLogo;




}
