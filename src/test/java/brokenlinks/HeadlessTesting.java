package brokenlinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

		public static WebDriver driver;
		public static void main(String[] args) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--headless");
			driver=new ChromeDriver(options);
			driver.get("http://www.deadlinkcity.com/");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}


	

}
