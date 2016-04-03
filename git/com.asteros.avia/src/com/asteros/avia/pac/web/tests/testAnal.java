package com.asteros.avia.pac.web.tests;

import org.testng.annotations.Test;

public class testAnal extends TestBase {
	
	@Test
	public void testChangeUserData() throws Exception {
		ObjectUserData validUserData = new ObjectUserData("login", "surname", "name", "midname");
		app.getUserChangeHelper().changeUserData(validUserData);
	}

	@Test
	public void testClearUserData() throws Exception {
		ObjectUserData clearUserData = new ObjectUserData("", "", "", "");
		app.getUserChangeHelper().changeUserData(clearUserData);

	}
}