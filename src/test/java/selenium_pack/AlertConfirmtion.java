package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmtion {
	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		d=new ChromeDriver();
		d.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@id='alertBox']")).click();
		d.switchTo().alert().accept();
		d.findElement(By.xpath("//button[@id='confirmBox']")).click();
		d.switchTo().alert().dismiss();
		d.findElement(By.xpath("//button[@id='confirmBox']")).click();
		d.switchTo().alert().accept();
		d.findElement(By.xpath("//button[@id='promptBox']")).click();
		d.switchTo().alert().sendKeys("shafi");
		d.switchTo().alert().accept();
		Thread.sleep(3000);
		d.close();

	}

}
