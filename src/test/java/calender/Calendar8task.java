package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar8task {

	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		d=new ChromeDriver();
		d.get("https://www.globalsqa.com/demo-site/datepicker/");
		d.manage().window().maximize();
		System.out.println(d.findElement(By.tagName("iframe")).getText());
//		d.findElement(By.className("page_heading")).click();    
		d.switchTo().frame(0);
		//calendar by sendkeys
		WebElement we=d.findElement(By.xpath("//input[@id='datepicker']"));
		we.click();
		//current date
		we.sendKeys("25/06/2024");
		we.clear();
		//past date
		we.sendKeys("25/05/2022");
		we.clear();
		//future date
		we.sendKeys("25/05/2026");
		
		
		Thread.sleep(2000);
		d.close();
		
	}

}
