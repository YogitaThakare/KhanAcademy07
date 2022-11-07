package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//input[@id='uid-login-form-0-wb-id-identifier-field']")
	private WebElement userEmail;
	
	@FindBy(xpath="//input[@id='uid-labeled-text-field-1-wb-id-field']")
	private WebElement userPassword;
	
	@FindBy(xpath="//button[@role='button']")
	private WebElement submitButton;
	
//	@FindBy(xpath="")
//	private WebElement loginPage;
//	
//	@FindBy(xpath="")
//	private WebElement loginPage;
//	
//	@FindBy(xpath="")
//	private WebElement loginPage;
	
//------- Constructor ------------
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
//--------- Methods ----------------
	
	public void clickOnLoginButton() {
		loginButton.click();
	}

//	public void sendUserEmail() {
//		userEmail.sendKeys("kashishyog@gmail.com");
//	}
	
	public void sendUserEmail(String email) {
		userEmail.sendKeys(email);
	}
	
	public void sendUserPassword(String password) {
		userPassword.sendKeys(password);
	}
	public void clickOnSubmitButton() {
		submitButton.click();
	}
//	public void clickOnLoginPage() {
//		loginPage.click();
//	}
//	public void clickOnLoginPage() {
//		loginPage.click();
//	}
}
