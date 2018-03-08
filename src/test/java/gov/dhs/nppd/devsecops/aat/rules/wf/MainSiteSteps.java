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

}
