package test;

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

import module.SignUpPage;
import pages.LogoutPage;
import setup.Base;

public class VerifySignUpFunctionality extends Base{
	WebDriver driver;
	SignUpPage signUp;
	LogoutPage logout;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browser) 
	{
		if(browser.equals("chrome")) 
		{
			driver = launchChrome();
		}
		else
		if(browser.equals("edge")) 
		{
			driver = edgeBrowser();
		}
		else
		if(browser.equals("frirefox")) 
		{
			driver = firefoxBrowser();
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@BeforeClass
	public void callMethods() {
		signUp = new SignUpPage(driver);
		logout = new LogoutPage(driver);
	}
	
	@BeforeMethod
	public void launchApl() {
		driver.get("https://www.khanacademy.org/");
	}
	
	@Test
	public void verifySignUpButton() throws InterruptedException{
		signUp.clickOnSignup();
		signUp.clickOnLearner();
		signUp.clickOnMonth();
		signUp.clickOnBirthMonth();
		signUp.clickOnDay();
		signUp.clickOnBirthDay();
		signUp.clickOnYear();
		signUp.clickOnBirthYear();
		
		signUp.clickOnByEmail();
		
		signUp.sendUserEmail();
		signUp.sendUserName();
		signUp.sendLastName();
		signUp.sendPassword();
		
		signUp.clickOnSignUp2();
		signUp.clickOnLogin();
		signUp.sendUserEmail2();
		signUp.sendUserPassword2();
		signUp.clickOnSubmitButton2();
	}
	
	@AfterMethod
	public void clearMethods() throws InterruptedException {
		logout.clickOnAccount();
		logout.clickOnLogout();
	}
	
	@AfterClass
	public void logout() {	
		signUp = null;
		logout = null;
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver = null;
		System.gc();
	}
	
}
