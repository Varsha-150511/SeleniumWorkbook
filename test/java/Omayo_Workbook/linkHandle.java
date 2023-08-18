package Omayo_Workbook;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class linkHandle extends openBrowser {
	
	
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
	public void link() {
		browser.findElement(By.id("link1")).click();
		System.out.println("Click on Selenium143");
		
	}

	@AfterClass
	
	public void close() {
		browser.close();
	}
	
}
