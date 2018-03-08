package gov.dhs.nppd.devsecops.aat.rules.wf.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MainSite extends PageObject {

	@FindBy(xpath = "//h1")
	WebElement mainHeader;

	public void visit(String url) {
		this.openAt(url);
	}

	public String getMainHeader() {
		return mainHeader.getText();
	}

}
