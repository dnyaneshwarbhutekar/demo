package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GET_TITLE {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		String s="Deals of the Day";
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		String t=d.getTitle();
		System.out.println(t);
		
		if(s.equals(t)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
		d.close();
		
		
	}

}
