package selenium_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static  WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		
		d=new ChromeDriver();
		
		//browser commands
		
		//open the adactin url
		d.get("https://adactinhotelapp.com/");
		//get title
		System.out.println(d.getTitle());
		//get current url
		System.out.println(d.getCurrentUrl());
		//close the current open tab
//		d.close();
		
		//open website
		d.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//get title
		System.out.println(d.getTitle());
		//get current url
		System.out.println(d.getCurrentUrl());
		//go back to previous page
		d.navigate().back();
		//go to next page
		d.navigate().forward();
		//reload or refresh the page
		d.navigate().refresh();
		//wait for 3 seconds
//		Thread.sleep(3000);
		//close the browser
		d.close();
		

	}

}
