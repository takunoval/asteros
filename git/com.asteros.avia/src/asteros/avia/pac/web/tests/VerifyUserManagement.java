package asteros.avia.pac.web.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyUserManagement extends TestBase {
	@BeforeMethod
	public void loginAsAdmin() throws Exception {
		test.navigation.openLoginPage();
		test.authorization.loginAsSuperAdmin();
	}

	@Test
	public void verifyUserManagementPage() {
		test.navigation.openUserManagementPage();
	}

}
