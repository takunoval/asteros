package asteros.avia.pac.web.fw;


public class TestManager {
	private static TestManager singleton;
	public WebDriverHelper webDriver;
	public UiActionsHelper action;
	public NavigationHelper navigation;
	public AuthorizationHelper authorization;

	public static TestManager getInstance() {
		if (singleton == null) {
			singleton = new TestManager();
		}
		return singleton;
	}

	public WebDriverHelper getWebDriverHelper() {
		if (webDriver == null) {
			webDriver = new WebDriverHelper();
		}
		return webDriver;
	}

	public void stopWebDriver() {
		webDriver.stop();
	}

	public UiActionsHelper getUiActionHelper() {
		if (action == null) {
			action = new UiActionsHelper(singleton);
		}
		return action;
	}

	public NavigationHelper getNavigationHelper() {
		if (navigation == null) {
			navigation = new NavigationHelper(this);
		}
		return navigation;
	}

	public AuthorizationHelper getAuthHelper() {
		if (authorization == null) {
			authorization = new AuthorizationHelper(this);
		}
		return authorization;
	}
}
