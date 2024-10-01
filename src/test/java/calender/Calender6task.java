package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender6task {

	public static WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Datepicker.html");
		d.manage().window().maximize();
		//direct entering the date in the date field
		WebElement datefield2=d.findElement(By.xpath("//input[@id='datepicker2']"));
		datefield2.sendKeys("6/20/2024");
		datefield2.clear();
		datefield2.sendKeys("6/25/2024");
		datefield2.clear();
		datefield2.sendKeys("6/15/2024");
		
		//selecting the date from datepicker
		int day=20;
		WebElement datefield=d.findElement(By.xpath("//input[@id='datepicker1']"));
		datefield.click();
		//selecting current date 
		d.findElement(By.xpath("//a[text()='"+day+"']")).click();
		//selecting previous date
		int preday=20;
		String premonthyr="December 2020";
//		int preyear=2020;
		datefield.click();
		while(true) {
			String currentmonthyr=d.findElement(By.className("ui-datepicker-title")).getText();
//			String currentyear=d.findElement(By.className("ui-datepicker-year")).getText();
			if(premonthyr.equals(currentmonthyr)) {
				break;
			}
			else {
				d.findElement(By.className("ui-datepicker-prev")).click();
			}
		}
		d.findElement(By.xpath("//a[text()='"+preday+"']")).click();
		
		
		//selecting date from dropdown
		int date=28;
		datefield2.click();
		WebElement daydd=d.findElement(By.className("//a[text()='"+date+"']"));
		WebElement monthdd=d.findElement(By.xpath("//select[@title='Change the year']"));
		Select s=new Select(monthdd);
		s.selectByIndex(7);
		WebElement yeardd=d.findElement(By.xpath("//select[@title='Change the month']"));
		Select s1=new Select(yeardd);
		s1.selectByVisibleText("2028");
		daydd.click();
		
		Thread.sleep(3000);
		d.close();
	}
}
