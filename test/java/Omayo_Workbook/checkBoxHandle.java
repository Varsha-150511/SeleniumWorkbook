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

public class checkBoxHandle extends openBrowser {

	@BeforeClass
	public void start() {
		try {
			openBrowserChrome();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(groups = {"sanity-group" })
	public void checkboxHandle() throws InterruptedException {

		WebElement checkboxBlue = browser.findElement(By.cssSelector("#checkbox2"));
		checkboxBlue.click();
		Thread.sleep(2000);
		System.out.println("CLicked on Blue Checkbox");

		WebElement checkboxOrange = browser.findElement(By.id("checkbox1"));
		checkboxOrange.click();
		Thread.sleep(2000);
		System.out.println("CLicked on Orange Checkbox");

		WebElement checkboxPen = browser.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		checkboxPen.click();
		Thread.sleep(2000);
		System.out.println("CLicked on Pen Checkbox");

		WebElement checkboxLaptop = browser.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		checkboxLaptop.click();
		Thread.sleep(2000);
		System.out.println("CLicked on Laptop Checkbox");
		
		browser.close();

	}
	
	@AfterClass
	public void close() {
		browser.close();
	}

}
