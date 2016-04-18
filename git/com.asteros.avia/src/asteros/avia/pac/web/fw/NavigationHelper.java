package asteros.avia.pac.web.fw;

public class NavigationHelper extends UiActionsHelper {
	public String baseUrl = "http://10.101.145.44/";
	public String url;
	
	public NavigationHelper(TestManager manager) {
		super(manager);
	}
	
	public void openMainPage() {
		targetUrl("");
	}
	
	public void openLoginPage() {
		targetUrl("Login");
	}

	public void openAnalyticsPage() {
		targetUrl("Analytics");
	}

	public void openAdminPage() {
		targetUrl("Admin");
	}

	public void openUserManagementPage() {
		targetUrl("Admin/Users");
		
	}

	private void targetUrl(String locator){
		openUrl(baseUrl + locator);
	}
}
