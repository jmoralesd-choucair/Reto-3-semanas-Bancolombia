package com.co.choucair.stepdefinitions;

import com.co.choucair.models.BusinessUnitData;
import com.co.choucair.models.MeetingData;
import com.co.choucair.models.UserLoombokData;
import com.co.choucair.questions.BusinessUnitInTable;
import com.co.choucair.questions.MeetingCreated;
import com.co.choucair.questions.ValidateText;
import com.co.choucair.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static com.co.choucair.userinterfaces.CreateBusinessUnitPage.BUSINESS_UNIT_1;
import static com.co.choucair.userinterfaces.SerenityLoginPage.TXT_VALIDATION;
import static com.co.choucair.utils.GlobalData.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class StarSharpStepDefinitions {
    // Login
    @Given("the user is on the serenity demo page")
    public void theUserIsOnTheSerenityDemoPage() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @When("attempts to log in")
    public void attemptsToLogIn(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.onTheSite(UserLoombokData.setData(dataTable).get(0))
        );
    }

    @Then("^validate the text on screen (.*)$")
    public void validateTheTextOnScreenDashboard(String text) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateText.of(TXT_VALIDATION), containsString(text))
        );
    }



    // Create business unit
    @When("the user navigates to ORGANIZACION > UNIDADES DE NEGOCIO")
    public void theUserNavigatesToOrganizacionUnidadesDeNegocio() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavigateToBusinessUnit.page()
        );
    }

    @And("the user creates a new Business Unit with the following details")
    public void theUserCreatesANewBusinessUnitWithTheFollowingDetails(DataTable dataTable) {
        BusinessUnitData businessUnitData = BusinessUnitData.setData(dataTable).get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateBusinessUnit.withData(businessUnitData)
        );
    }

    @Then("the Business Unit {string} should be created successfully")
    public void theBusinessUnitShouldBeCreatedSuccessfully(String businessUnitName) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(BusinessUnitInTable.withName(businessUnitName, BUSINESS_UNIT_1), is(true))
        );
    }


    // Schedule meeting
    @When("the user navigates to REUNION > REUNIONES")
    public void theUserNavigatesToReunionReuniones() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavigateToMeetings.page()
        );
    }

    @And("the user schedules a new meeting with the following details")
    public void theUserSchedulesANewMeetingWithTheFollowingDetails(DataTable dataTable) {
        List<MeetingData> meetings = MeetingData.setData(dataTable);
        OnStage.theActorInTheSpotlight().attemptsTo(
                ScheduleMeeting.withData(meetings.get(0))
        );
    }

    @Then("the meeting {string} should be scheduled successfully with Business Unit {string}")
    public void theMeetingShouldBeScheduledSuccessfullyWithBusinessUnit(String meetingTitle, String businessUnit) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(MeetingCreated.exists(meetingTitle, businessUnit))
        );
    }
}
