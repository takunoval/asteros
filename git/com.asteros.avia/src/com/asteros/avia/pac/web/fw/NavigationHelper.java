package com.asteros.avia.pac.web.fw;

public class NavigationHelper extends HelperWithWebDriverBase{

	public String baseUrl = "http://10.101.145.44/";
	
	public NavigationHelper (ApplicationManager manager){
		super(manager);
	}

	public void openUsersList() {
		openURL(baseUrl + "/Admin/Users");
	}

	public void openLoginPage() {
		openURL(baseUrl + "/Login");
	}

}
