package gov.dhs.nppd.devsecops.aat.rules.wf.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class MainSite extends PageObject {

	@FindBy(xpath = "//h1")
	WebElement mainHeader;

	@FindBy(xpath = "//span[text()='Find owners']")
	WebElement findOwners;

	@FindBy(xpath = "//a[@href='/petclinic/vets.html']")
	WebElement veterinarians;

	@FindBy(xpath = "//span[text()='Error']")
	WebElement error;

	@FindBy(xpath = "//a[@href='/petclinic/']")
	WebElement home;

	public void visit(String url) {
		this.openAt(url);
	}

	public String getMainHeader() {
		return mainHeader.getText();
	}

	public void selectFindOwnersTab() {
		findOwners.click();
	}

	public void selectVeterinarians() {
		veterinarians.click();
	}

	public void selectErrors() {
		error.click();
	}

	public void selectHome() {
		home.click();
	}

}
