package asteros.avia.pac.web.validation;

import org.openqa.selenium.By;

public class ErrorMessageHandler extends UiValidationHelper {
	private String locator = "alert-danger";

	public ErrorMessageHandler(ValidationManager manager) {
		super(manager);
	}

	public void accessDenied() {
		isElementPresent(By.className(locator));
		verifyTextPresent("Доступ запрещён\nДоступ запрещён для пользователя 'agent agent agent'. Требуется одна из следующих ролей: 'Аналитик', 'Администратор'\nОбратитесь к администратору системы", locator);
	}

	public void incorrectAuthorization() {
		isElementPresent(By.className(locator));
		verifyTextPresent("Неправильный логин или пароль", locator);
	}
	
	public void authEmptyFields() {
	isElementPresent(By.className(locator));
	verifyTextPresent("Введите логин\nВведите пароль", locator);
}
	public void noErrors() {
		isElementNotPresent(By.className(locator));
	}
}
