package com.asteros.avia.pac.web.fw;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperWithWebDriverBase {
	protected final ApplicationManager manager;
	private WebDriver driver;
	
	public HelperWithWebDriverBase(ApplicationManager manager){
		this.manager = manager;
		driver = manager.getWebDriverHelper().getDriver();
	}

	public void type(String locator, String text) {
		driver.findElement(By.id(locator)).clear();
		driver.findElement(By.id(locator)).sendKeys(text);
	}

	protected WebElement findElement(By linkText) {
		return driver.findElement(linkText);
	}

	protected void openURL(String string) {
		driver.get(string);
	}

	protected void click(By linkText) {
		findElement(linkText).click();
	}
	
	protected boolean isElementPresent(By by){
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e){
			return false;
		}
	}
}
