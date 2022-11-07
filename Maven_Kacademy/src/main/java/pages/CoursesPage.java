package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesPage {
WebDriver driver;
Actions act ;
	@FindBy(xpath="(//button[@class='_tr38f8i'])[1]")
	private WebElement courseTab;
		
	@FindBy(xpath="(//span[normalize-space()='Class 1'])[1]")
	private WebElement class1Tab;
	
	@FindBy(xpath="(//a[@role='button'])[1]")
	private WebElement getStarted;
	
	@FindBy(xpath="(//a[@class='_1lrvdlvw'])[1]")
	private WebElement start;
	
	@FindBy(xpath="(//button[@class='_1gz49uis'])[1]")
	private WebElement letsGo;
	
	@FindBy(xpath="(//img)[5]")
	private WebElement srcDrag;
	
	@FindBy(xpath="(//div[@class='card drag-hint'])[1]")
	private WebElement destDrop;
	
	@FindBy(xpath="(//button[@class='_rz7ls7u'])[1]")
	private WebElement checkTab;
	
//	@FindBy(xpath="(//button[@class='_6t500vf'])[1]")
//	private WebElement nextTab;
//	
//	@FindBy(xpath="(//div[@class='_rngbhz'])[1]")
//	private WebElement reward;
	
//	@FindBy(xpath="(//button[normalize-space()='See a step-by-step solution.'])[1]")
//	private WebElement link;
	
	
	@FindBy(xpath="//*[@id=\"uid-dialog-8-close-button\"]")
	private WebElement closeTest;
//	
//	@FindBy(xpath="")
//	private WebElement
//	
//	@FindBy(xpath="")
//	private WebElement
//------- Constructor ------------
	
	public CoursesPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
		act=new Actions(driver);
	}
	
//--------- Methods ----------------
	
	public void clickOnCourseTab() throws InterruptedException {
		Thread.sleep(5000);
		courseTab.click();
	}

	public void clickOnClass1() throws InterruptedException {
		Thread.sleep(5000);
		class1Tab.click();
	}
	
	public void clickOnGetStarted() {
		getStarted.click();
	}
	public void clickOnstart() {
		start.click();
	}
	public void clickOnLetsGo () {
		letsGo.click();
	}
	public void clickOnDragDrop() throws InterruptedException {
	
		act.dragAndDrop(srcDrag, destDrop).perform();
		}
	
	public void clickOnCheckTab() {
		checkTab.click();
	}
	public void clickOnCloseTest () {
		closeTest.click();
	}
//	public void () {
//	loginPage.click();
//}
//public void () {
//	loginPage.click();
//}
//	public void () {
//	loginPage.click();
//}
//public void () {
//	loginPage.click();
//}
}

//@FindBy(xpath="(//button[@class='_acvy8y9'])[1]")
//private WebElement popUpNoThanks;

//public void clickOnPopUpNoThanks() {
//	Alert alt = driver.switchTo().alert();
//	alt.dismiss();
//	//popUpNoThanks.click();
//	}