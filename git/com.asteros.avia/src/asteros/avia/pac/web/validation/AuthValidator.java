package asteros.avia.pac.web.validation;

public class AuthValidator extends UiValidationHelper {
	private ErrorMessageHandler err;
	
	public AuthValidator (ValidationManager manager){
		super(manager);
	}

	public void notEnoughPermission() {
		err.accessDenied();
	}
	
	public void wrongAuthData() {
		err.incorrectAuthorization();
	}
}
