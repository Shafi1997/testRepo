package selenium_pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(12));
		
		driver.findElement(By.id("populate-text")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("target-text"), "Selenium Webdriver"));
		WebElement ele=driver.findElement(By.className("target-text"));
		System.out.println(ele.getText());


	}

}
