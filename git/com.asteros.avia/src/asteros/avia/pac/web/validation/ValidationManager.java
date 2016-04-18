package asteros.avia.pac.web.validation;

public class ValidationManager {
	private static ValidationManager singleton;
	public UiValidationHelper ui;
	public PageValidator page;
	public ErrorMessageHandler err;
	public AuthValidator auth;

	public static ValidationManager getInstance() {
		if (singleton == null) {
			singleton = new ValidationManager();
		}
		return singleton;
	}
	
	public UiValidationHelper getUiValidationHelper(){
		if (ui == null) {
			ui = new UiValidationHelper(this);
		}
		return ui;
	}

	public PageValidator getPageValidator() {
		if (page == null) {
			page = new PageValidator(this);
		}
		return page;
	}

	public ErrorMessageHandler getErrorMessageHandler() {
		if (err == null){
			err = new ErrorMessageHandler(this);
		}
		return err;
	}

	public AuthValidator getAuthValidator() {
		if (auth == null){
			auth = new AuthValidator(this);
		}
		return auth;
		
	}
}
