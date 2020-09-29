package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	public WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	By signin = By.xpath("//a[text()='Sign in']");
	By createAccount = By.xpath("//a[text()='Create Account']");
	By RediffBanner = By.xpath("//span[@class='hmsprite logo']");
	By rediffMail = By.xpath("//a[@title='Lightning fast free email']");

	public WebElement signInLink() {
		return driver.findElement(signin);
	}

	public WebElement createAccountLink() {
		return driver.findElement(createAccount);
	}
	
	public WebElement rediffTitleBanner()
	{
		return driver.findElement(RediffBanner);
	}
	public WebElement rediffMail()
	{
		return driver.findElement(rediffMail);
	}
}
