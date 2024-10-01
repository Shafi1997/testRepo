package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender4future {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		//20/12/2022
		int day=20;
		String expdate="December 2024";


		//calendar to select future date
				driver.findElement(By.id("first_date_picker")).click();
				while(true) {//this loop will run infinitely
					String currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();//June 2024, July 2024, August 2024
					if(expdate.equals(currentdate)) {//December 2024 with June 2024
						break;
					}else {
						driver.findElement(By.className("ui-datepicker-next")).click();//perform
					}
					
				}
				driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		
	}

}
