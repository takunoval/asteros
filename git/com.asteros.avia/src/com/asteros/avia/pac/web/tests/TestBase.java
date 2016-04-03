package com.asteros.avia.pac.web.tests;


import org.testng.annotations.*;
import com.asteros.avia.pac.web.fw.ApplicationManager;

public class TestBase {

	public ApplicationManager app;
	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager();
		app.getUserChangeHelper().openAndLogin();
	}

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	}
}
