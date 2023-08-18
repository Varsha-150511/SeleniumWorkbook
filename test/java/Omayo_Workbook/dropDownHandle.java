package Omayo_Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Drop down
public class dropDownHandle extends openBrowser {

	@BeforeClass
	public void start() {
		try {
			openBrowserChrome();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void DropdownHandle() throws InterruptedException {

		WebElement e = browser.findElement(By.name("SiteMap"));
		Select dropdown1 = new Select(e);
		dropdown1.selectByIndex(3);
		System.out.println("Select doc3");
		Thread.sleep(3000);

		WebElement f = browser.findElement(By.name("SiteMap"));
		Select dropdown2 = new Select(f);
		dropdown2.selectByIndex(2);
		System.out.println("Select doc2");
		Thread.sleep(3000);
		

	}
	
	@AfterClass
	public void close(){
		browser.close();
	}

}
