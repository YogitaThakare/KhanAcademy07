package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CoursesPage;
import pages.LoginPage;
import pages.LogoutPage;
import setup.Base;
import utils.Utility;

public class VerifyCoursesDemo {
	WebDriver driver;
	LoginPage login;
	CoursesPage course;
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
		course = new CoursesPage(driver);
		
	}
	
	@BeforeMethod
	public void launchAplication() throws IOException {
		driver.get("https://www.khanacademy.org/");
		login.clickOnLoginButton();
		String data = Utility.getData("Sheet1", 1, 1);
		login.sendUserEmail(data);
	
		String data2 =  Utility.getData("Sheet1", 1, 2);
		login.sendUserPassword(data2);
		login.clickOnSubmitButton();
	}
	
	@Test
	public void verifyValidateCourse() throws InterruptedException {
		course.clickOnCourseTab();
		Utility.captureScreen(driver, "courseStarted");
		course.clickOnClass1();
		course.clickOnGetStarted();
		course.clickOnstart();
		Thread.sleep(5000);
		course.clickOnDragDrop();
		Thread.sleep(5000);
		course.clickOnCheckTab();
		Utility.captureScreen(driver, "ckeckResult");
		course.clickOnCloseTest();
	}
	
	@AfterMethod
	public void clearMethods(ITestResult result) throws InterruptedException {
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreen(driver, result.getName());
		}
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
