Feature: Business Unit and Meeting Management in StarSharp

  Background:
    Given the user is on the serenity demo page
    When attempts to log in
      | user  | pass     |
      | admin | serenity |
    Then validate the text on screen Tablero

  Scenario: Create a new Business Unit
    When the user navigates to ORGANIZACION > UNIDADES DE NEGOCIO
    And the user creates a new Business Unit with the following details
      | name            |
      | Business Unit 1 |
    Then the Business Unit "Business Unit 1" should be created successfully

  Scenario: Schedule a new meeting
    When the user navigates to REUNION > REUNIONES
    And the user schedules a new meeting with the following details
      | title           | type      | location  | unit            | organizer | reporter |
      | Meeting 1       | Strategy  | On Site   | Business Unit 1 | Aaron Taylor | Adam Edwards |
    Then the meeting "Meeting 1" should be scheduled successfully with Business Unit "Business Unit 1"
