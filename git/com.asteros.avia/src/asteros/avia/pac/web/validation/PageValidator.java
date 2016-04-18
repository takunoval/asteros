package asteros.avia.pac.web.validation;

import org.openqa.selenium.By;

public class PageValidator extends UiValidationHelper{

	public PageValidator(ValidationManager manager) {
		super(manager);
	}


	public void checkLoginPage() {
		isElementPresent(By.id("UserName"));
		isElementPresent(By.id("Password"));
		isElementPresent(By.cssSelector("input.loginButton.k-button"));
	}

	public void checkMainPage() {
		verifyPageTitle("Выбор рабочего места");
		checkUI();
	}

	public void checkAdminPage() {
		verifyPageTitle("Администрирование");
	}

	public void checkAnalyticPage() {
		verifyPageTitle("Аналитика");
	}
	
	private void checkUI() {
		isElementPresent(By.className("pac-logo"));
		verifyTextPresent("Контроль доступа пассажиров в стерильную зону", findTextByClassName("pac-navbar-title"));
		verifyTextPresent("© " + currentYear() + " - ООО \"Астерос Лабс\"", findTextByClassName("x-footer"));
	}
}
