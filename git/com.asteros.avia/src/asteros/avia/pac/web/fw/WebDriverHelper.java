package asteros.avia.pac.web.fw;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {
	public WebDriver driver;

	public WebDriverHelper() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void stop() {
		driver.close();
	}
}
