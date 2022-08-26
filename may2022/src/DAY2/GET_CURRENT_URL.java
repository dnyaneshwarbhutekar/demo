package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GET_CURRENT_URL {
	public static void main(String[] args) throws InterruptedException {
		String s="Shop Online on Amazon - Get the best deals on Amazon";
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
      WebDriver d=new ChromeDriver();
      d.get("https://www.google.com/search?q=amazon&sxsrf=ALiCzsae9phIVpBlNoqoyD0SCo1_Hntqmw%3A1657557034828&ei=KlDMYo-aMp7z4-EPpcOh6As&ved=0ahUKEwiP14WSofH4AhWe-TgGHaVhCL0Q4dUDCA4&uact=5&oq=amazon&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECcyBAgjECcyCggAELEDEIMBEEMyBAgAEEMyCggAELEDEIMBEEMyBQgAEIAEMgQIABBDMgsIABCABBCxAxCDATIFCAAQgAQyCwgAEIAEELEDEIMBOgcIIxCwAxAnOgcIABBHELADOg0ILhDHARDRAxCwAxBDOgcIIxDqAhAnOggIABCxAxCDAToUCC4QgAQQsQMQgwEQxwEQ0QMQ1AJKBAhBGABKBAhGGABQx39YtpYBYN-fAWgLcAF4AIAB3gKIAY0NkgEFMi01LjGYAQCgAQGwAQrIAQrAAQE&sclient=gws-wiz");
	  String h=d.getCurrentUrl();
	  System.out.println(h);
	  if(s.equals(h))
	  {
	  System.out.println("true");
	}else {
		System.out.println("false");
	}Thread.sleep(2000);
	d.quit();
	  }
	
	

}
