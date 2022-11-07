package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	//@FindBy(xpath="//button[@aria-label='Yogita Thakare']")
	@FindBy(xpath="//span[text()='Yogita']")
	private WebElement account;//span[text()='Log out']
	
	@FindBy(xpath="//span[text()='Log out']")
	private WebElement logout;
	//------- Constructor ---------------
	
	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//------- Methods --------------------
	
	public void clickOnAccount() throws InterruptedException {
		Thread.sleep(3000);
		account.click();
	}
	public void clickOnLogout() throws InterruptedException {
		Thread.sleep(3000);
		logout.click();
	}
}
