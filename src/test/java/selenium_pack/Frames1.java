package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames1 {
	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		d.manage().window().maximize();
//		WebElement we=d.findElement(By.tagName("iframe"));
//		System.out.println(we);
//		d.findElement(By.xpath("//a[@href='#Single']")).click();
//		d.findElement(By.xpath("//a[@href='#Multiple']")).click();
		d.switchTo().frame(1);
		Actions a=new Actions(d);
		//scroll By pixel
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(400,0)", "");
		
		
		WebElement text=d.findElement(By.xpath("//input[@type='text']"));
//		js.executeScript("arguments[0].scrollIntoView();", text);
		text.sendKeys("Shafi");
		text.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		text.sendKeys(Keys.CONTROL, "x");
		Thread.sleep(2000);
		text.sendKeys(Keys.CONTROL, "v");
				
		
		Thread.sleep(2000);   
		d.close();
	}

}
