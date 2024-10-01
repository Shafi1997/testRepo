package calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar9usrformatfuture {

	public static WebDriver driver;
	public static void main(String[] args) throws ParseException {
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("first_date_picker"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		String expdate="35/June/2025";//current date is June 2024
		
		//To format the date into calendar available format
		Calendar calendar=Calendar.getInstance();//set the time zone
		SimpleDateFormat date=new SimpleDateFormat("dd/MMM/yyyy");//specifying user given input format
		date.setLenient(false);//this will validate input date
		Date formatteddate=date.parse(expdate);//format the date
		calendar.setTime(formatteddate);//setting date with calendar in web
		//separate the expdate
		int expday=calendar.get(calendar.DAY_OF_MONTH);//28
		int expmonth=calendar.get(calendar.MONTH);//06
		int expyear=calendar.get(calendar.YEAR);//2024
		
		String currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();
		//format the current date
		//SimpleDateFormat date1=new SimpleDateFormat("MMMyyyy");
		//Date formattedcurrentdate=date.parse(currentdate);
		//calendar.setTime(formattedcurrentdate);
		calendar.setTime(new SimpleDateFormat("MMMyyyy").parse(currentdate));
		//separate the current date
		int currentmonth=calendar.get(calendar.MONTH);//06
		int currentyear=calendar.get(calendar.YEAR);//2024
		//select future date
		while(expmonth>currentmonth||expyear>currentyear) {
			driver.findElement(By.className("ui-datepicker-next")).click();
			 currentdate=driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMMyyyy").parse(currentdate));
			//separate the current date
			 currentmonth=calendar.get(calendar.MONTH);//07
			 currentyear=calendar.get(calendar.YEAR);//2024
			
		}
		
		driver.findElement(By.xpath("//a[text()='"+expday+"']")).click();
	}

}
