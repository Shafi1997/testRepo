package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicTest {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
		driver.findElement(By.id("reg_email")).sendKeys("vamshinani9000@gmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("Vamshi@123");
		driver.findElement(By.name("register")).click();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(3000);
//		driver.findElement(By.id("password")).sendKeys("Password123");
//		JavascriptExecutor j=(JavascriptExecutor)driver;
//		j.executeScript("document.getElementById('password').value='Password123'");
		((RemoteWebDriver)driver).executeScript("document.getElementById('password').value='Password123'");
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		
		//findout number of images on webpage
		driver.get("https://www.amazon.in/");
		int images=driver.findElements(By.tagName("img")).size();
		System.out.println("Number of images:"+images);
	}
}

