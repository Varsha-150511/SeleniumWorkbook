package Maven;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWikithroughGoogle {

	WebDriver Chrome;

	@BeforeTest
	// Open Google
	public void openGoogle() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		Chrome = new ChromeDriver();
		Thread.sleep(1000);
		System.out.println("BeforeTest- Open Google");
	}
		@BeforeClass
 public void openChrome() throws InterruptedException {
		Chrome.get("https://www.google.com/");
		Thread.sleep(500);
		Chrome.manage().window().maximize();
		System.out.println("BeforeClass - Chrome invokes and google opens");
	}
		

	@Test(priority = 0)
	public void openWiki() throws InterruptedException {
		Chrome.findElement(By.id("APjFqb")).sendKeys("Wikipedia" + Keys.RETURN);
		// Chrome.findElement(By.name("q")).sendKeys("Wikipedia" + Keys.RETURN);
		Thread.sleep(3000);

		Chrome.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void clickWiki() throws InterruptedException {

		Chrome.findElement(By.xpath("//a[@title='English — Wikipedia — The Free Encyclopedia']")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 2)

	public void openAPJ() throws InterruptedException {
		Chrome.findElement(By.xpath("//input[@title='Search Wikipedia [alt-shift-f]']"))
				.sendKeys("APJ Abdul Kalam" + Keys.RETURN);
		Thread.sleep(2000);

		WebElement l = Chrome.findElement(By.xpath("//span[@class='mw-page-title-main']"));

		System.out.println("Title is: " + l.getText());
	}
		
		@AfterClass
		
		public void closeBrowser() {
		Chrome.quit();
		System.out.println("Quit Chrome Browser");
	}

	// Chrome.findElement(By.xpath("//img[@class='mw-file-element']"));

	// Chrome.findElement(By.xpath("//a[@title='President of India']")).click();

//       Chrome.findElement(By.id("firstHeading")).click();
//        
//       System.out.println("Page title is : " + Chrome.getTitle());

}
