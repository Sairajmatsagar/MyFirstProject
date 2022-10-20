package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImages1;

	
	public WebElement getLeadsmodulelink() {
		return leadsmodulelink;
	}

	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leadsmodulelink;

	@FindBy(linkText = "Log out")
	private WebElement logoutButton;

	@FindBy(partialLinkText = "Computers")
	private WebElement computersModuleLink;
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getComputersModuleLink() {
		return computersModuleLink;
	}

	// Business Logic or Action methods or Behavior
	public void logout() {

		Actions actions = new Actions(this.driver);
		
		actions.moveToElement(administratorImages1).perform();
	
		signout.click();
	}

	public WebElement getAdministratorImages1() {
		return administratorImages1;
	}

	public WebElement getSignout() {
		return signout;
	}

	public void setSignout(WebElement signout) {
		this.signout = signout;
	}
}
