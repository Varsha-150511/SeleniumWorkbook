package Omayo_Workbook;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageLinks {

	public static void openOmayo() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		System.out.println("Invoke Browser and Open Chrome");

		driver.manage().window().maximize();
		System.out.println("Maximize window");
		Thread.sleep(3000);

		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		System.out.println("Open Omayo by Arun");
	
//		Store all the available links of webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

//		Check link size
		if (links.size() == 0) {
			System.out.println("Link is Empty");
		} else {
			System.out.println("Total no. of links is :" + links.size());
		}

		for (WebElement link : links) {
			System.out.println(link.getText());
		}

		WebElement TestingOnly = driver.findElement(By.partialLinkText("onlytestingblog"));
		TestingOnly.click();
		System.out.println("Click on Testing Only");
//		String Title = TestingOnly.getText();
		
		System.out.println("Click on Testing tab");
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Only Testing: TextBox";
		
//		if(ActualTitle.equals(ExpectedTitle)) {
//			System.out.println("Title Matched");
//		}
//		else {
//			System.out.println("Title Not Matched");
//		}

		boolean verifyTitle1 = driver.getTitle().equalsIgnoreCase("Only Testing: TextBox");
		System.out.println("Title Check");
		assertTrue(verifyTitle1);
		System.out.println("Title Matched");
		Thread.sleep(3000);

		driver.navigate().back();

		driver.findElement(By.id("link1")).click();
		System.out.println("Click on Selenium tab");
		
		boolean verifyTitle2 = driver.getTitle().equalsIgnoreCase("Only Testing: TextBox");
		System.out.println("Title Check 2");
		assertFalse(verifyTitle2);
		System.out.println("Title Matched 2");
		Thread.sleep(3000);
		
//		Thread.sleep(3000);
//		driver.navigate().back();
//		
//		driver.findElement(By.partialLinkText("Blogs")).click();
//		System.out.println("Click on Blogs tab");
//		driver.navigate().back();

//		
//		
//		for (int i=0; i <=1  ; i++) {
//			driver.navigate().to(links[2]);
//			Thread.sleep(3000);
//		}		
//		
//	
//	}

		
	
}
}
