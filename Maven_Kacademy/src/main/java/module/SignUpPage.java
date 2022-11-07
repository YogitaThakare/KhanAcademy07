package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	@FindBy(xpath="//a[normalize-space()='Sign up']")
	private WebElement signupButton;
	
	@FindBy(xpath="//button[normalize-space()='Learner']")
	private WebElement learner;
	
	@FindBy(xpath="//button[@data-test-id='birthday-picker-month']")
	private WebElement month;
	
	@FindBy(xpath="//span[text()='Jun']")
	private WebElement birthMonth;
	
	@FindBy(xpath="//button[@data-test-id='birthday-picker-day']")
	private WebElement day;
	
	@FindBy(xpath="//span[text()='11']")
	private WebElement birthday;
	
	@FindBy(xpath="//button[@data-test-id='birthday-picker-year']")
	private WebElement year;
	
	@FindBy(xpath="//span[text()='1987']")
	private WebElement birthYear;
	
	@FindBy(xpath="//div[text()='Sign up with Email']")
	private WebElement byEmail;
	
	@FindBy(xpath="//input[@id='uid-labeled-text-field-1-wb-id-field']")
	private WebElement userEmail;
	
	@FindBy(xpath="//input[@id='uid-labeled-text-field-2-wb-id-field']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='uid-labeled-text-field-3-wb-id-field']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='uid-labeled-text-field-4-wb-id-field']")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='_q7flqj6']")
	private WebElement signup2;
	
	@FindBy(xpath="//a[text()='log in']")
	private WebElement logIn;
	
	@FindBy(xpath="//input[@id='uid-login-form-5-wb-id-identifier-field']")
	private WebElement userEmail2;
	
	@FindBy(xpath="//input[@id='uid-labeled-text-field-6-wb-id-field']")
	private WebElement userPassword2;
	
	@FindBy(xpath="//button[@data-test-id='log-in-submit-button']")
	private WebElement submitButton2;
	
//-------- Constructor -------------
	
	public SignUpPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	
//--------- Methods ----------------
	public void clickOnSignup() {
		signupButton.click();
	}
	public void clickOnLearner() {
		learner.click();
	}
	public void clickOnMonth() throws InterruptedException {
		Thread.sleep(5000);
	month.click();
}
	public void clickOnBirthMonth() throws InterruptedException {
		Thread.sleep(5000);
		birthMonth.click();
}
	public void clickOnDay() throws InterruptedException {
		Thread.sleep(5000);
		day.click();
}
	public void clickOnBirthDay() throws InterruptedException {
		Thread.sleep(5000);
		birthday.click();
}
	public void clickOnYear() throws InterruptedException {
		Thread.sleep(5000);
		year.click();
}
	public void clickOnBirthYear() throws InterruptedException {
		Thread.sleep(5000);
		birthYear.click();
}
	public void clickOnByEmail() throws InterruptedException {
		Thread.sleep(5000);	
	byEmail.click();
}
	public void sendUserEmail() throws InterruptedException {
		Thread.sleep(5000);	
	userEmail.sendKeys("kashishyog@gmail.com");
}
	public void sendUserName() throws InterruptedException {
		Thread.sleep(5000);	
	userName.sendKeys("Yogita");
}
	public void sendLastName() throws InterruptedException {
		Thread.sleep(5000);	
	lastName.sendKeys("Thakare");
}
	public void sendPassword() throws InterruptedException {
		Thread.sleep(5000);	
	password.sendKeys("Rajyog@123");
}
	public void clickOnSignUp2() throws InterruptedException {
		Thread.sleep(5000);
		signup2.click();
}
	public void clickOnLogin() throws InterruptedException {
		Thread.sleep(5000);
	logIn.click();
}
	public void sendUserEmail2() throws InterruptedException {
		Thread.sleep(5000);
		userEmail2.sendKeys("kashishyog@gmail.com");
	}
	
	public void sendUserPassword2() throws InterruptedException {
		Thread.sleep(5000);
		userPassword2.sendKeys("Rajyog@123");
	}
	public void clickOnSubmitButton2() throws InterruptedException {
		Thread.sleep(5000);
		submitButton2.click();
	}
	
}
