package asteros.avia.pac.web.fw;

import org.openqa.selenium.By;
import asteros.avia.pac.web.tests.ObjectAuthorizationData;

public class AuthorizationHelper extends UiActionsHelper {

	public AuthorizationHelper(TestManager manager) {
		super(manager);
	}

	public void login(ObjectAuthorizationData authDataObject) {
		type("UserName", authDataObject.userName);
		type("Password", authDataObject.password);
		click(By.cssSelector("input.loginButton.k-button"));
	}

	public void loginAsSuperAdmin() {
		login(new ObjectAuthorizationData("ivanov", "password"));
	}
	
	public void loginAsAgent() {
		login(new ObjectAuthorizationData("agent", "agent"));
	}

	public void loginAsInactiveUser() {
		login(new ObjectAuthorizationData("inactive", "inactive"));

	}
	
	public void loginAsNonexistentUser() {
		login(new ObjectAuthorizationData("NonexistentUser", "NonexistentUser"));
	}

	public void loginNoFillFields() {
		login(new ObjectAuthorizationData("", ""));
	}

}