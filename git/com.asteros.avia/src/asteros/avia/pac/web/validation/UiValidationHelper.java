package asteros.avia.pac.web.validation;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.NoSuchElementException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import asteros.avia.pac.web.fw.TestManager;

public class UiValidationHelper {
	protected WebDriver driver;

	public UiValidationHelper(ValidationManager manager) {
		driver = TestManager.getInstance().getWebDriverHelper().getDriver();
	}
	
	protected void verifyPageTitle(String expectedTitle) {
		assertThat(expectedTitle, equalTo(driver.getTitle()));
	}

	protected void verifyTextPresent(String expectedText, String locator) {
		String receivedText = findTextByClassName(locator);
		assertThat(expectedText, equalTo(receivedText));

	}
	
	protected String findTextByClassName(String locator){
		String foudText = (driver.findElement(By.className(locator)).getText());
		return foudText;
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean isElementNotPresent(By by){
		try {
			driver.findElements(by).isEmpty();
			return false;
		} catch (NoSuchElementException e) {
			return true;
		}
	}
	
	public void screenShot() {
		Throwable t = new Throwable();
		String methodName = null;
		StackTraceElement trace[] = t.getStackTrace();
		if (trace.length > 1) {
			StackTraceElement element = trace[1];
			methodName = element.getMethodName();
		}

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "./target/screenshots/screen." + methodName + ".jpg";
		try {
			FileUtils.copyFile(screenshot, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("screenshot");
	}
	
	protected static int currentYear()
    {
		Calendar currentYear = new GregorianCalendar();
        return currentYear.get(Calendar.YEAR);
    }


}
