@test
Feature: Valtech test
Scenario: Verify the Latest News is displayed in home page 

Given I am in home page
Then I should see "Latest News" section should be disply

Scenario: Verify the About section is displayed in About Page 

Given I am in home page
When I select "About" from Top Nav
Then I should see "About" section

Scenario: Verify the Services section is displayed in Services Page 

Given I am in home page
When I select "Services" from Top Nav
Then I should see "Services" section


Scenario: Verify the Work section is displayed in Work Page 

Given I am in home page
When I select "Work" from Top Nav
Then I should see "Work" section


Scenario: Verify the total number of Offices in Contact page 

Given I am in home page
When I select "About" from Top Nav
And I select Valtech Offices link
Then I should see and count all the valtech offices