package Omayo_Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class textBoxHandle extends openBrowser {

	@BeforeClass
	public void start() {
		try {
			openBrowserChrome();
		}
		catch(Exception e){
			e.getStackTrace();
		}
	}
	
	@Test
	
	public void textBox() throws InterruptedException {
		WebElement Text = browser.findElement(By.id("ta1"));
		Text.sendKeys("I am fond of reading books");
		Thread.sleep(3000);
		
		Text.clear();
		Thread.sleep(2000);
		
		Text.sendKeys("During Spare time, I love reading");
		
		System.out.println("Text Area Executed");
	}
	
	@AfterClass
	public void close() {
		browser.close();
		}
	}
