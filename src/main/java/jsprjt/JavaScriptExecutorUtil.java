package jsprjt;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtil {

	public static void flash(WebElement element , WebDriver driver) {
		int test = 3;
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		
		for( int i=0;i<500;i++) {
			changecolor("#000000", element, driver);
			changecolor(bgcolor , element , driver);
		}
	}

	private static void changecolor(String bgcolor, WebElement element, WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		
		
		js.executeScript("arguments[0].style.backgroundColor = '" + bgcolor + "'",element);
		System.out.print(bgcolor);
		try {
			
			Thread.sleep(10);
			
		}catch (InterruptedException e) {
			
		}
	
		
	}

}
