package asteros.avia.pac.web.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UiActionsHelper {
	protected TestManager manager;
	protected WebDriver driver;

	public UiActionsHelper(TestManager manager) {
		this.manager = manager;
		driver = manager.getWebDriverHelper().getDriver();
	}

	protected void openUrl(String url) {
		driver.get(url);
	}

	public WebElement findElement(By linkText) {
		return driver.findElement(linkText);
	}

	public void type(String locator, String text) {
		findElement(By.id(locator)).clear();
		findElement(By.id(locator)).sendKeys(text);
	}

	protected void click(By btn) {
		findElement(btn).click();
	}
}
