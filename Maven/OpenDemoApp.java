package Maven;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDemoApp {

	WebDriver driver;

	@BeforeMethod
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("BeforeMethod: Invoke Chrome Browser");
		
		driver.get("https://demo.applitools.com/");
		System.out.println("BeforeMethod: Open demoApp site ");
	}

//	@BeforeClass
//	public void openDemoApp() {
//		driver.get("https://demo.applitools.com/");
//		System.out.println("Before Class: Open demoApp site ");
//	}

//	@BeforeMethod
//	public void clearUsernamePwd() throws InterruptedException {
//
//		Thread.sleep(2000);
//		driver.findElement(By.id("username")).clear();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		System.out.println("Clear Usernname");
//		
//		driver.findElement(By.className("form-control")).clear();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		System.out.println("Clear Password");
//	}

	@Test(priority = 0)
	// Enter Username
	public void username() throws InterruptedException {
		// assertNotNull(driver);
		driver.findElement(By.id("username")).sendKeys("Varsha");
		Thread.sleep(3000);
		System.out.println("Username entered");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("12345");
		Thread.sleep(3000);
		System.out.println("Password entered");
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		System.out.println("Sign-In");
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 1)
	// Enter Username
	public void username1() throws InterruptedException {
		// assertNotNull(driver);
		driver.findElement(By.cssSelector("#username")).sendKeys("Vandu");
		
//		driver.findElement(By.id("username")).sendKeys("Vandu");
		Thread.sleep(3000);
		System.out.println("Username1 entered");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("123456");
		Thread.sleep(3000);
		System.out.println("Password1 entered");
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		System.out.println("Sign-In1");
		Thread.sleep(3000);
	}
//	public void password() {
//		driver.findElement(By.className("form-control")).sendKeys("12345");
//		System.out.println("Password entered");
//	}
//
//	@Test(priority = 2)
//	
//
//	@Test(priority = 3)
//	public void login() {
//		driver.findElement(By.partialLinkText("Sign in")).click();
//		System.out.println("Sign-In");
//	}

//	@AfterMethod
//	public void close() {
//		driver.close();
//		System.out.println("AfterTest: Close Chrome Browser");
//	}

}
