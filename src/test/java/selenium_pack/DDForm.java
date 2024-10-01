package selenium_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDForm {

	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		d=new ChromeDriver();
		//single selection dropdown without select tagname
		d.get("https://formy-project.herokuapp.com/form");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//input[@id='first-name']")).sendKeys("abc");
		d.findElement(By.xpath("//input[@id='last-name']")).sendKeys("xyz");
		d.findElement(By.xpath("//input[@id='job-title']")).sendKeys("Software test engineer");
		d.findElement(By.xpath("//input[@id='radio-button-2']")).click();
		d.findElement(By.xpath("//input[@id='checkbox-1']")).click();
		WebElement we=d.findElement(By.xpath("//select[@id='select-menu']"));
		Select s=new Select(we);
		s.selectByIndex(1);
		d.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("20/12/1997");
		Thread.sleep(3000);
//		d.findElement(By.xpath("//a[@role='button']")).click();
		
	}

}
