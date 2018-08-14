package com.stepDefinations;

import com.cucumberRunner.BaseClass;
import static org.hamcrest.MatcherAssert.assertThat;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AboutPageStepDef extends BaseClass{
	@Then("^I should see \"([^\"]*)\" section$")
    public void i_should_see_something_section(String expectedSection) throws Throwable {
	 assertThat("Latest Section is not present",aboutPage.isAboutPageDisplayed().contains(expectedSection));
    }

    @Then("^I should see and count all the valtech offices$")
    public void i_should_see_and_count_all_the_valtech_offices() throws Throwable {
       System.out.println("Total Valtech Offices : "+aboutPage.countValTechOffices());
    }

    @And("^I select Valtech Offices link$")
    public void i_select_valtech_offices_link() throws Throwable {
    	aboutPage.selectValTechOfficeOption();
       
    }

}
