package Omayo_Workbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class doubleClickHandle extends openBrowser {

	@BeforeClass
	public void start() {
		try {
			openBrowserChrome();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(groups = { "regression" })
	// Double Click
	public void DoubleclickHandle() throws InterruptedException {

		Actions doubleclick = new Actions(browser);
		doubleclick.moveToElement(browser.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']")))
				.doubleClick().build().perform();
		System.out.println("Test Double click");
		Thread.sleep(5000);

		// Pop up Handle
		Alert alert = browser.switchTo().alert();
		String alertMessage = browser.switchTo().alert().getText();
		alert.accept();
		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(8000);

	}

	@Test(groups = { "sanity-group", "regression-group" })
	// Double Click
	public void DoubleclickHandle1() throws InterruptedException {
		Actions a = new Actions(browser);
		a.moveToElement(browser.findElement(By.id("testdoubleclick"))).doubleClick().build().perform();
		System.out.println("Test Double click");
		Thread.sleep(4000);

		browser.close();
	}

	@AfterClass
	public void close() {
		browser.close();

	}
}
