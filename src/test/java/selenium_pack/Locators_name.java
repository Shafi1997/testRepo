package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_name {

	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		
		//launch the chrome browser
		d=new ChromeDriver();
		//open the url
		d.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		//enter first name
		d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Mohammed");
		//enter last name
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Shafi");
		// enter email      //input[@type='text']
		d.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shafi@gmail.com");
		//enter password
		d.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("abc@12345");
		//enter repeat password
		d.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("abc@12345");
		//wait for 2 seconds
		Thread.sleep(2000);
		//close the window
		d.close();

	}

}
