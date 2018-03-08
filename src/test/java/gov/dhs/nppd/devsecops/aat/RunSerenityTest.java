package gov.dhs.nppd.devsecops.aat;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

/**
 * <code>
 * mvn -Dtest=gov.dhs.nppd.devsecops.aat.RunSerenityTest -Dcucumber.options="--tags@validating_landing_page" verify
 * <p>
 * -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=C:\dev\bin\misc\chromedriver.exe
 * <p>
 * </code>
 *
 * @author ktran
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features"

// , tags = { "@not_accepting_with_blank_email, @not_accepting_with_blank_name"}
// , tags = { "@adopting_one_pet, @adopting_multiple_pets,
// @accepting_creditcard" }
		, tags = { "@validating_landing_page" }

)
public class RunSerenityTest {
}