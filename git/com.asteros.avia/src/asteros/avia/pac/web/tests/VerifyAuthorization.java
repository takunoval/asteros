package asteros.avia.pac.web.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyAuthorization extends TestBase {

	@BeforeMethod
	public void loginPage() throws Exception {
		test.navigation.openLoginPage();
	}

	@Test
	public void verifyLoginPage() {
		verify.page.checkLoginPage();
	}

	@Test
	public void verifyCorrectAuthorization() {
		test.authorization.loginAsSuperAdmin();
		verify.err.noErrors();
		test.navigation.openMainPage();
		verify.page.checkMainPage();
	}

	@Test
	public void verifyAdminPage() throws Exception {
		test.authorization.loginAsSuperAdmin();
		test.navigation.openAdminPage();
		verify.page.checkAdminPage();
	}

	@Test
	public void verifyAccessDenied() throws Exception {
		test.authorization.loginAsAgent();
		verify.ui.screenShot();
		verify.err.accessDenied();
	}

	@Test
	public void verifyInactiveUser() throws Exception {
		test.authorization.loginAsInactiveUser();
		verify.ui.screenShot();
		verify.err.incorrectAuthorization();
	} 

	@Test
	public void verifyNonexistentUser() throws Exception {
		test.authorization.loginAsNonexistentUser();
		verify.ui.screenShot();
		verify.err.incorrectAuthorization();
	}

	@Test
	public void verifyNoFillFields() throws Exception {
		test.authorization.loginNoFillFields();
		verify.ui.screenShot();
		verify.err.authEmptyFields();
	}

}
