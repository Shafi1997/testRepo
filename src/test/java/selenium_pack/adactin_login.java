package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactin_login {

	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		
		d=new ChromeDriver();
		//open the url
		d.get("https://adactinhotelapp.com/");
		//enter the username
		d.findElement(By.id("username")).sendKeys("shafeemohd333@gmail.com");
		//enter the password
		d.findElement(By.id("password")).sendKeys("shafi@786");
		//click the login button
		d.findElement(By.id("login")).click();
		//wait for 2 seconds
		Thread.sleep(2000);
		//close the window
		d.close();

	}

}
