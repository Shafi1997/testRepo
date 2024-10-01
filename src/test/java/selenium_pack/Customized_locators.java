package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customized_locators {

	public static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			driver=new ChromeDriver();
			driver.get("https://practice.automationtesting.in/my-account/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='reg_email']")).sendKeys("vamshinani9000@gmail.com");
			driver.findElement(By.xpath("//input[@id='reg_password']")).sendKeys("Vamshi@123");
			driver.findElement(By.name("register")).click();
			String text=driver.findElement(By.linkText("Lost your password?")).getText();
			System.out.println(text);
	


	}

}
