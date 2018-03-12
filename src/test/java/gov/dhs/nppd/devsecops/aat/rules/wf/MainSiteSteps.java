package gov.dhs.nppd.devsecops.aat.rules.wf;

import gov.dhs.nppd.devsecops.aat.rules.wf.pages.MainSite;
import net.thucydides.core.annotations.Step;

public class MainSiteSteps {

	private MainSite mainSite;

	@Step
	public void visit(String url) {
		mainSite.visit(url);
	}

	@Step
	public String getMainHeader() {
		return mainSite.getMainHeader();
	}

	@Step
	public void i_click_on_find_owners() {
		mainSite.selectFindOwnersTab();
	}

	@Step
	public void i_wait_a_little(long waitTime) {

		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Step
	public void i_visit_veterinarians() {
		mainSite.selectVeterinarians();
	}

	@Step
	public void i_visit_errors() {
		mainSite.selectErrors();
	}

	@Step
	public void i_visit_home() {
		mainSite.selectHome();
	}

}
