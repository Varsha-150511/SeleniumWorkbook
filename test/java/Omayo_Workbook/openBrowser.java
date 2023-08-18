package Omayo_Workbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openBrowser {
	
	protected static WebDriver browser;

	public static void openBrowserChrome() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");


		String browserType = "Chrome";

		Thread.sleep(1000);

		switch (browserType)

		{
		case ("Chrome"):
			browser = new ChromeDriver();
			System.out.println("Invoke Browser and Open Chrome");
			break;

		case ("Edge"):
			browser = new EdgeDriver();
			System.out.println("Open Edge Browser");

			break;

		default:
			System.out.println("Invalid Browser");
		}
		
		browser.manage().window().maximize();
		System.out.println("Maximize window");
		Thread.sleep(3000);
		
		browser.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		System.out.println("Open Omayo by Arun");
		
		
	}
}
