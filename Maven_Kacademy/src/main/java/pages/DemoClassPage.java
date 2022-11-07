package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class DemoClassPage {//https://byjus.com/byjus-classes-book-free-60-mins-class/

	WebDriver driver;
	@FindBy(xpath="(//select[@class='form-control video-selection'])[1]")
	private WebElement selectClass;
	
//	@FindBy(xpath="")
//	private WebElement loginPage;
//	
//	@FindBy(xpath="")
//	private WebElement loginPage;
	
//----- Constructor ---------
	
	public DemoClassPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
//------ Methods -------------
	
	public void clickOnselectClass() {
		Select std = new Select(selectClass);
		std.selectByVisibleText("Class 4");
	}
}
