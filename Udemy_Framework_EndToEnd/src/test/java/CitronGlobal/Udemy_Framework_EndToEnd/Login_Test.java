package CitronGlobal.Udemy_Framework_EndToEnd;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPageObject;
import pageObjects.SignInPageObject;

public class Login_Test extends base
{
/*	@Test(dataProvider="getData")
	public void login(String userName,String password) throws IOException
	{
		//call method from base to intialize driver
		driver = initializeDriver();
		//browse url
		driver.get("https://www.rediff.com");
		LoginPageObject loginObject = new LoginPageObject(driver);
		//assert if rediff banner is present
		Assert.assertTrue(loginObject.rediffTitleBanner().isDisplayed());
		Assert.assertEquals(loginObject.rediffMail().getText(), "Lightning fast free email");
		loginObject.signInLink().click();	
		SignInPageObject signInObject = new SignInPageObject(driver);
		signInObject.userName().sendKeys(userName);
		signInObject.password().sendKeys(password);
		signInObject.signInButton().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "abcd";
		data[0][1] = "123";
		data[1][0] = "radhasubramanya@rediffmail.com";
		data[1][1] = "Sharanya@9";
		data[2][0] = "radhasubramanya@rediffmail.com";
		data[2][1] = "";
		return data;
	}*/
	@Test
	public void login() throws IOException
	{
		//call method from base to intialize driver
		driver = initializeDriver();
		//browse url
		driver.get(prop.getProperty("url"));
		LoginPageObject loginObject = new LoginPageObject(driver);
		//assert if rediff banner is present
		Assert.assertTrue(loginObject.rediffTitleBanner().isDisplayed());
		Assert.assertEquals(loginObject.rediffMail().getText(), "Rediffmail");
	}
}
