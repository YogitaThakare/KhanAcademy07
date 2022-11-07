package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import setup.Base;
import utils.Utility;

public class VerifyLoginFunctionality extends Base
{
	WebDriver driver;
	LoginPage login;
	LogoutPage logout;

	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browser) 
	{
		if(browser.equals("chrome")) 
		{
			driver = Base.launchChrome();
		}
//		else
//		if(browser.equals("edge")) 
//		{
//			driver = Base.edgeBrowser();
//		}
//		else
//		if(browser.equals("frirefox")) 
//		{
//			driver = Base.firefoxBrowser();
//		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void callMethods() {
		login = new LoginPage(driver);
		logout = new LogoutPage(driver);
	}
	
	@BeforeMethod
	public void launchAplication() {
		driver.get("https://www.khanacademy.org/");
	}
	
	@Test
	public void verifySubmitButton() throws IOException {
		login.clickOnLoginButton();
		//login.sendUserEmail();
		String data = Utility.getData("Sheet1", 1, 1);
		login.sendUserEmail(data);
		
//		login.sendUserPassword();
		String data2 =  Utility.getData("Sheet1", 1, 2);
		login.sendUserPassword(data2);
		login.clickOnSubmitButton();
	}
	
//	@Test
//	public void verifyBasicInfo() {
//		
//	}
	@AfterMethod
	public void clearMethods() throws InterruptedException {
		Thread.sleep(5000);
		logout.clickOnAccount();
		logout.clickOnLogout();
	}
	
	@AfterClass
	public void logout() {	
		login = null;
		logout = null;
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver = null;
		System.gc();
	}
	
}
