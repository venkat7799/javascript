package jsprjt;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorprct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Program Files//eclipse//chromedriver_win32_new//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		 driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		JavaScriptExecutorUtil.flash(joinfree, driver);

	}

}
