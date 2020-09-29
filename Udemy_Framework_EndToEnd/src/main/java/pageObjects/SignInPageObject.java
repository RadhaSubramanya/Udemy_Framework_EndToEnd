package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageObject {
	WebDriver driver;

	public SignInPageObject(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.xpath("//input[@name='login']");
	By password = By.xpath("//input[@name='passwd']");
	By signin = By.xpath("//input[@title='Sign in']");

	public WebElement userName() {
		return driver.findElement(userName);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement signInButton() {
		return driver.findElement(signin);
	}

}
