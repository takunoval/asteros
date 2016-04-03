package com.asteros.avia.pac.web.fw;

import org.openqa.selenium.By;
import com.asteros.avia.pac.web.tests.ObjectAuthorizationData;
import com.asteros.avia.pac.web.tests.ObjectUserData;

public class UserChangeHelper extends HelperWithWebDriverBase{

	public UserChangeHelper(ApplicationManager manager){
		super(manager);
	}
	
	public void changeUserData(ObjectUserData userDataValid) {
		manager.getNavigationHelper().openUsersList();
		editUserPreferences();
		editUserData(userDataValid);
	}

	public void openAndLogin() {
		manager.getNavigationHelper().openLoginPage();
		authAsAdmin(new ObjectAuthorizationData("ivanov", "password"));
	}

	public void editUserData(ObjectUserData userDataObject) {
		type("Login", userDataObject.login);
		type("LastName", userDataObject.lastName);
		type("FirstName", userDataObject.firstName);
		type("MiddleName", userDataObject.middleName);
	}

	public void editUserPreferences() {
		click(By.linkText("Изменить"));
	}

	public void authAsAdmin(ObjectAuthorizationData authDataObject) {
		type("UserName", authDataObject.userName);
		type("Password", authDataObject.password);
		click(By.cssSelector("input.loginButton.k-button"));
	}

}
