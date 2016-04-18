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
		verifyPageTitle("����� �������� �����");
		checkUI();
	}

	public void checkAdminPage() {
		verifyPageTitle("�����������������");
	}

	public void checkAnalyticPage() {
		verifyPageTitle("���������");
	}
	
	private void checkUI() {
		isElementPresent(By.className("pac-logo"));
		verifyTextPresent("�������� ������� ���������� � ���������� ����", findTextByClassName("pac-navbar-title"));
		verifyTextPresent("� " + currentYear() + " - ��� \"������� ����\"", findTextByClassName("x-footer"));
	}
}
