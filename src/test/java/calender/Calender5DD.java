package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender5DD {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		int day=22;
		//Calendar with drop downs
		driver.findElement(By.id("third_date_picker")).click();
		
		WebElement month=driver.findElement(By.className("ui-datepicker-month"));
		Select drpmonth=new Select(month);
		drpmonth.selectByIndex(3);
		
		WebElement year=driver.findElement(By.className("ui-datepicker-year"));
		Select drpyear=new Select(year);
		drpyear.selectByIndex(6);
		
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}

}
