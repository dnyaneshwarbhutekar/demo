package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriveropening {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=amazon&oq=&aqs=chrome.2.35i39i362l8.787890j0j7&sourceid=chrome&ie=UTF-8");
		Thread.sleep(2000);
		driver.close();
		
	}

}
