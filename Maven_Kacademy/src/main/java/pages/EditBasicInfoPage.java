package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditBasicInfoPage {
	
//	@FindBy(xpath="//span[text()='Pick a username']")
//	private WebElement editInfoTab;
	
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div/div[2]/div/div/main/div[2]/div/div[1]/div/div/div/div/div[2]/button")
	private WebElement editInfoTab;
	
	@FindBy(id="nickname")
	private WebElement nickname;
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(xpath="//*[@id=\"bio-picker\"]")
	private WebElement textarea;
	
	@FindBy(xpath="//*[@id=\"username-picker-container\"]/div[3]/div/button[1]")
	private WebElement cancelButton;
	
	@FindBy(xpath="(//button[@class='_dxjxyv7'])[1]")
	private WebElement saveButton;
	
	@FindBy(id="uid-identity-text-field-11-password")
	private WebElement verifyInfo;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement submit2;
	
	@FindBy(xpath="//div[@class='notification error']")
	private WebElement verifyErrormsg;
	
	
			@FindBy(xpath="(//p[@class='input-description'])[1]")
			private WebElement verifytxtmsg;
//------- Constructor ------------
	
	public EditBasicInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
//--------- Methods ----------------
	
	public void clearNickname() throws InterruptedException {
		Thread.sleep(5000);
		nickname.clear();
		//nickname.sendKeys("Yogita");
	}
	public void enterNickname() throws InterruptedException {
		Thread.sleep(5000);
		//nickname.clear();
		nickname.sendKeys("Yogita");
	}

	public void clearUsername() throws InterruptedException {
		Thread.sleep(5000);
		userName.clear();
	}
	public void enterUsername() throws InterruptedException {
		Thread.sleep(5000);
		userName.sendKeys("YogitaThakare123");
	}
	
	public void clearText() throws InterruptedException {
		Thread.sleep(5000);
		textarea.clear();
	}
	public void enterText() throws InterruptedException {
		Thread.sleep(5000);
		textarea.sendKeys("I am busy.....");
	}
	public void clickOnCancelButton() throws InterruptedException {
		Thread.sleep(5000);
		cancelButton.click();
	}
	public void clickOnSaveButton() throws InterruptedException {
		Thread.sleep(5000);
		saveButton.click();
	}
	public void clickOnEditInfoTab() throws InterruptedException {
		Thread.sleep(5000);
		editInfoTab.click();
	}
	public void enterVerifyInfo() throws InterruptedException {
		Thread.sleep(5000);
		verifyInfo.sendKeys("Rajyog@123");
	}
	public void clickOnSubmit2() throws InterruptedException {
		Thread.sleep(5000);
		submit2.click();
	}
	public void verifyErrormsg() throws InterruptedException {
		Thread.sleep(5000);
		verifyErrormsg.getText();
	}

	public void verifyTxtmsg() throws InterruptedException {
		Thread.sleep(5000);
		//String s= verifytxtmsg.getText();
		//System.out.println(s);
	}



}
