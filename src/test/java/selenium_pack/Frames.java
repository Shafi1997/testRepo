package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//switch to frame1
		//driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("frame1");
		
		//switch to main web page
		driver.switchTo().defaultContent();
		
		//switch to frame2
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("frame2");
		
		//switch to main web page
		driver.switchTo().defaultContent();
		
		//switch to frame3
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3");
		
		//a frame is inside another frame
		//switch to inner frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='Sign in to Google']")).click();
	}

}
