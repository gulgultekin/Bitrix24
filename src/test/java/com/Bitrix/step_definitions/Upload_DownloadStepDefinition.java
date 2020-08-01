package com.Bitrix.step_definitions;

import com.Bitrix.pages.TaskPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Upload_DownloadStepDefinition  {

    TaskPage taskPage = new TaskPage();


    @Given("User should be able to click on task")
    public void user_should_be_able_to_click_on_task() throws InterruptedException {

        taskPage.taskIcon.click();

    }


    @Then("User should be able to click on Upload files icon")
    public void user_should_be_able_to_click_on_upload_files_icon() {

        taskPage.uploadTaskIcon.click();
    }


    @Then("User should be able to click on upload files and images")
    public void user_should_be_able_to_click_on_upload_files_and_images() {

        taskPage.
    }


    @Then("User should be able to click on Download from external drive")
    public void user_should_be_able_to_click_on_download_from_external_drive() {

    }


    @Then("User should be able to click on Select document from Bitrix24")
    public void user_should_be_able_to_click_on_select_document_from_bitrix24() {

    }


    @Then("User should be able to create Document")
    public void user_should_be_able_to_create_document() {

    }


    @Then("User should be able to create Spreadsheet")
    public void user_should_be_able_to_create_spreadsheet() {

    }


    @Then("User should be able to create Presentation")
    public void user_should_be_able_to_create_presentation() {

    }



}
