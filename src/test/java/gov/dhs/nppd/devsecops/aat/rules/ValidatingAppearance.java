package gov.dhs.nppd.devsecops.aat.rules;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.nppd.devsecops.aat.rules.wf.MainSiteSteps;
import net.thucydides.core.annotations.Steps;

public class ValidatingAppearance {

	@Steps
	private MainSiteSteps mainSiteSteps;

	@Given("^I am at the landing page \"([^\"]*)\"$")
	public void i_am_at_the_landing_page(String url) throws Throwable {
		mainSiteSteps.visit(url);
	}

	@When("^I view the main heading text$")
	public void i_view_the_main_heading_text() throws Throwable {
	}

	@Then("^I should see the word \"([^\"]*)\"$")
	public void i_should_see_the_word(String expectedText) throws Throwable {
		String actualText = mainSiteSteps.getMainHeader();
		assertTrue((String.format("Expected to contain %s but got %s", expectedText, actualText)),
				actualText.contains(expectedText));
	}
}
