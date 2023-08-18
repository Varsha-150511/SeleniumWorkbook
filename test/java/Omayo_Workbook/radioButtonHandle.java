package Omayo_Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class radioButtonHandle extends openBrowser {
	
	@BeforeClass
	public void start() {
		try {
			openBrowserChrome();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test (groups = {"sanity-group","regression-group"})
	public void radioButton() throws InterruptedException {

		WebElement radioFemale = browser.findElement(By.id("radio2"));
		radioFemale.click();
		Thread.sleep(2000);
		System.out.println("CLicked on Female radio button");

		WebElement radioMale = browser.findElement(By.cssSelector("#radio1"));
		radioMale.click();
		Thread.sleep(2000);
		System.out.println("CLicked on Male radio button");
	}
	
	@AfterClass
	public void close() {
		browser.close();
	}
}
