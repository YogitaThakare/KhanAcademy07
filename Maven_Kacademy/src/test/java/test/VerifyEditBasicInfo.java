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

import pages.EditBasicInfoPage;
import pages.LoginPage;
import pages.LogoutPage;
import setup.Base;
import utils.Utility;

public class VerifyEditBasicInfo extends Base{
	WebDriver driver;
	LoginPage login;
	LogoutPage logout;
	EditBasicInfoPage info;
	
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
		info = new EditBasicInfoPage(driver);
	}
	
	@BeforeMethod
	public void launchAplication() throws IOException {
		driver.get("https://www.khanacademy.org/");
		//driver.get("https://www.khanacademy.org/profile/me/courses");
		login.clickOnLoginButton();
		//login.sendUserEmail();
		String email = Utility.getData("Sheet1", 1,1);
		login.sendUserEmail(email);
		//login.sendUserPassword(password);
		String password = Utility.getData("Sheet1", 1,2);
		login.sendUserPassword(password);
		login.clickOnSubmitButton();
	}
	
	@Test
	public void verifyBasicInfo() throws InterruptedException {
		Thread.sleep(5000);
		info.clickOnEditInfoTab();
		Thread.sleep(3000);
		info.clearNickname();
		Thread.sleep(3000);
		info.enterNickname();
		Thread.sleep(3000);
		info.clearUsername();
		Thread.sleep(3000);
		info.enterUsername();
		Thread.sleep(3000);
		info.clearText();
		Thread.sleep(3000);
		info.enterText();
		Thread.sleep(3000);
		info.verifyErrormsg();
		Thread.sleep(3000);
		info.verifyTxtmsg();
		

		//String b = verifytxtmsg.getText();
		
		
//		info.clickOnSaveButton();
//		Thread.sleep(3000);
//		info.enterVerifyInfo();
//		Thread.sleep(3000);
//		info.clickOnSubmit2();
		//info.clickOnCancelButton();
		
	}
//	@AfterMethod
//	public void clearMethods() throws InterruptedException {
//		logout.clickOnAccount();
//		logout.clickOnLogout();
//	}
//	
//	@AfterClass
//	public void logout() {	
//		login = null;
//		logout = null;
//	}
//	
//	@AfterTest
//	public void closeBrowser() {
//		driver.close();
//		driver = null;
//		System.gc();
//	}
	

}
