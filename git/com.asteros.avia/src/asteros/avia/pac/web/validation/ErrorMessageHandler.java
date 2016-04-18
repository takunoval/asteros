package asteros.avia.pac.web.validation;

import org.openqa.selenium.By;

public class ErrorMessageHandler extends UiValidationHelper {
	private String locator = "alert-danger";

	public ErrorMessageHandler(ValidationManager manager) {
		super(manager);
	}

	public void accessDenied() {
		isElementPresent(By.className(locator));
		verifyTextPresent("������ ��������\n������ �������� ��� ������������ 'agent agent agent'. ��������� ���� �� ��������� �����: '��������', '�������������'\n���������� � �������������� �������", locator);
	}

	public void incorrectAuthorization() {
		isElementPresent(By.className(locator));
		verifyTextPresent("������������ ����� ��� ������", locator);
	}
	
	public void authEmptyFields() {
	isElementPresent(By.className(locator));
	verifyTextPresent("������� �����\n������� ������", locator);
}
	public void noErrors() {
		isElementNotPresent(By.className(locator));
	}
}
