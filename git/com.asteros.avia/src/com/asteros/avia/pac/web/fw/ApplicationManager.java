package com.asteros.avia.pac.web.fw;

public class ApplicationManager {

	private WebDriverHelper webDriverHelper;
	private UserChangeHelper userChangeHelper;
	private NavigationHelper navigationHelper;

	public ApplicationManager() {
		webDriverHelper = new WebDriverHelper();
	}

	public void stop() {
		webDriverHelper.stop();
	}

	WebDriverHelper getWebDriverHelper() {
		if (webDriverHelper == null){
			webDriverHelper = new WebDriverHelper();
		}
		return webDriverHelper;
	}

	public UserChangeHelper getUserChangeHelper() {
		if (userChangeHelper == null){
			userChangeHelper = new UserChangeHelper(this);
		}
		return userChangeHelper;
	}

	public NavigationHelper getNavigationHelper() {
		if (navigationHelper == null){
			navigationHelper = new NavigationHelper(this);
		}
		return navigationHelper;
	}
}
