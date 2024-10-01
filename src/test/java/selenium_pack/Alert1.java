package selenium_pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert1 {
	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(d,Duration.ofMinutes(2));
//		d.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		//simple alert
		d.findElement(By.xpath("//button[@id='alertButton']")).click();
		d.switchTo().alert().accept();
		d.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		d.switchTo().alert().accept();
		d.findElement(By.xpath("//button[@id='confirmButton']")).click();
		d.switchTo().alert().accept();
		d.findElement(By.xpath("//button[@id='promtButton']")).click();
		d.switchTo().alert().sendKeys("Shafi");
		
		Thread.sleep(2000);
		d.close();
		
	}
}
