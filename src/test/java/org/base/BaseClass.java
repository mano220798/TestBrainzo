package org.base;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	public static void loadUrl(String URL) {
		driver.get(URL);
	}

	public static void max() {
		driver.manage().window().maximize();
	}
	public static void fill(WebElement element,String Usertext)
	{
		element.sendKeys(Usertext);
		
	}
	public static void btnclick(WebElement element) {
		element.click();
	}
}
	/*	public static Actions act;

		public static void moveToElement(WebElement target) {
			act = new Actions(driver);
			act.moveToElement(target);
		
	}
	public static JavascriptExecutor jse;

		public static void setAttribute_jse(WebElement element, String input) {
			jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('value','" + input + "')", element);
		}

		public static void click_jse(WebElement element) {
			jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click()", element);
		}

*/

