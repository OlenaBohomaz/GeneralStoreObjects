Feature: Onboarding page test
  Scenario: Verify elements on the onboarding page
    Given I open the app

    When I check if the bucket is displayed
    Then the bucket should be present

    When I check if the title is displayed
    Then the title should be present

#    When I check if the title is not clickable
#    Then the title should not be clickable

    When I check if the title is enabled
    Then the title should be enabled

#    When I check if the select country text is displayed
#    Then the select country text should be present
#
#    When I check if the country text is enabled
#    Then the country text should be enabled

    When I check if the country text is correct
    Then the country text should be Afghanistan

    When I check if the input name is displayed
    Then the input name should be displayed

    When I check if the input name is enabled
    Then the input name should be enabled

    When I click on the input field
    Then input field is focused

    When I enter the name from the JSON file
    Then the name should be entered

    When I check if the female radio button is displayed
    Then the female radio button should be displayed

    When I check if the female radio button is unchecked
    Then the female radio button should be unchecked

    When I click on the femail radio button
    Then the femail radio button is clicked

    When I hide the keyboard
    Then the submit button is displayed

    When I check if the submit button is enabled
    Then the submit button should be enabled

    When I click on the Submit button
    Then I see the second title