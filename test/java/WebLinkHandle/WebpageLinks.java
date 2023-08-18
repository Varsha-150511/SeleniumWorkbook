package WebLinkHandle;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import java.util.ArrayList;
import org.openqa.selenium.Keys;

public class WebpageLinks {
	

	@Test
	public void openOmayo() throws InterruptedException {
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

//		Store all the available links of Webpage and get their title
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
		}

//		Check link size
		if (links.size() == 0) {
			System.out.println("Link is Empty");
		} else {
			System.out.println("Total no. of links is :" + links.size());
		}

		// Open Child Tabs
		String n = Keys.chord(Keys.CONTROL, Keys.ENTER);
		WebElement TestingOnly = driver.findElement(By.partialLinkText("onlytestingblog"));
		TestingOnly.sendKeys(n);
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		String verifyTitle1 = driver.getTitle();
		System.out.println(verifyTitle1);
		boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Only Testing: TextBox");
		System.out.println("Title Check");

		try {
			assertFalse(verifyTitle);
			System.out.println("Title Matched");
		}

		catch (AssertionError e) {
			System.out.println(e.getMessage());
		}

		// Navigate to Main Window
		driver.switchTo().window(tabs1.get(0));
		System.out.println("Navigate to main window");

		// Navigate to 2nd link
		String n1 = Keys.chord(Keys.CONTROL, Keys.ENTER);
		WebElement link2 = driver.findElement(By.id("link1"));
		link2.sendKeys(n1);

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(2));
		boolean verifyTitle2 = driver.getTitle().equalsIgnoreCase("Only Testing: TextBox");
		System.out.println("Title Check 2");

		try {
			assertTrue(verifyTitle2);
			System.out.println("Title Matched");
		}

		catch (AssertionError e) {
			System.out.println(e.getMessage());
			System.out.println("Not Matched");
		}

	}

}
