package Omayo_Workbook;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class matchOmayoTitle extends openBrowser {

	@BeforeClass
	public void start() {
		try {
			openBrowserChrome();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void matchTitle() throws InterruptedException {

		String Title = browser.getTitle();
		System.out.println(Title);

		String title = "omayo (QAFox.com)";

		if (Title.equals(title)) {
			System.out.println("Title Matched = " + Title);
		} else {
			System.out.println("Title Not Matched");
		}

		Thread.sleep(4000);
		
	}

	@AfterClass
	public void close() {
		browser.close();
	}

}
