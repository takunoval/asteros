package asteros.avia.pac.web.tests;

import org.testng.annotations.*;
import asteros.avia.pac.web.fw.TestManager;
import asteros.avia.pac.web.validation.ValidationManager;

public class TestBase {
	public TestManager test;
	public ValidationManager verify;

	@BeforeTest
	public void setUp() throws Exception {
		test = TestManager.getInstance();
		verify = ValidationManager.getInstance();
		test.getNavigationHelper();
		test.getAuthHelper();
		verify.getUiValidationHelper();
		verify.getPageValidator();
		verify.getErrorMessageHandler();
		verify.getAuthValidator();
	}

	@AfterTest
	public void tearDown() throws Exception {
		TestManager.getInstance().stopWebDriver();
	}
}
