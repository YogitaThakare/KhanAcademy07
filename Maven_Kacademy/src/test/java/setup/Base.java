package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	/*
	 Hello
	*/

	
	public static WebDriver launchChrome() {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumAll\\106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumAll\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	public static WebDriver edgeBrowser() {
		System.setProperty("webdriver.edge.driver","C:\\SeleniumAll\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}
//	public static WebDriver edgeBrowser() {
//		System.setProperty("webdriver.edge.driver","C:\\SeleniumAll\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		return driver;
//	}
}
