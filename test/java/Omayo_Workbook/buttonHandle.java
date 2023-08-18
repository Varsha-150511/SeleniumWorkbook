package Omayo_Workbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class buttonHandle extends openBrowser{

	@BeforeClass
	public void start() {
		try {
			openBrowserChrome();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	
	@Test
	public void button() throws InterruptedException {
		browser.findElement(By.id("confirm")).click();
		Thread.sleep(3000);

	
	// Pop up Handle
			Alert alert = browser.switchTo().alert();
			String alertMessage = browser.switchTo().alert().getText();
			alert.accept();
			System.out.println(alertMessage); // Print Alert Message
			Thread.sleep(8000);
	}
	
	@AfterClass
	public void close() {
		browser.close();
	}
	
}
