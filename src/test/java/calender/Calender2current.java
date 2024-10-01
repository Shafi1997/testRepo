package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2current {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		int day=22;
		//calendar to select date in current month
		driver.findElement(By.id("first_date_picker")).click();
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
}

}
