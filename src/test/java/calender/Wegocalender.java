package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wegocalender {

	public static WebDriver d;  

	public static void main(String[] args) throws InterruptedException {
		d = new ChromeDriver();
		d.get("https://www.wego.co.in/");
		d.manage().window().maximize();

		d.findElement(By.xpath("//input[@id='outboundSearchQuery']")).click();
		List<WebElement> we = d.findElements(By.xpath("//div[@class='LMIHbU8OifNpK30_y6Oi']"));
		for (int i = 0; i < we.size(); i++) {
			String alloptions = we.get(i).getText();
			if (we.get(i).getText().equals("Hyderabad")) {
				System.out.println(we.get(i).getText());
				we.get(i).click();
				break;
			}
//			else
//			{
//				System.out.println("No such city available in the list");
//			}

		}

		d.findElement(By.xpath("//input[@id='inboundSearchQuery']")).click();
		List<WebElement> we1 = d.findElements(By.xpath("//div[@class='LMIHbU8OifNpK30_y6Oi']"));
		for (int i = 0; i < we1.size(); i++) {

			if (we1.get(i).getText().equals("Kuwait")) {
				System.out.println(we1.get(i).getText());
				we1.get(i).click();
				break;
			}
		}

		// from date picking
		d.findElement(By.className("pK6N_01I0i2kQ_QCAD62")).click();
		int dpatday = 29;
		String dpatdate = "June 2024";

		while (true) {// this loop will run infinitely
//			String currentdate=d.findElement(By.xpath("(//div[@class='Mb0fqfkJKrlrncFaK_py'])[1]")).getText();//June 2024, May 2024, April 2024
			String currentdate = d.findElement(By.xpath("//div[@class='Mb0fqfkJKrlrncFaK_py']")).getText();// June 2024,
																		// 2024
			if (dpatdate.equals(currentdate)) {// June 2024 with June 2024
				System.out.println(dpatdate);
				break;
			} else {
				d.findElement(By.xpath("//div[@data-pw='datePicker_previousMonthBtn']")).click();
			}

		}
		d.findElement(By.xpath("//div[@data-index='"+dpatday+"']")).click();

		// to date picking
		int retrnday = 29;
		String retrndate = "September 2024";

		while (true) {// this loop will run infinitely
			String currentdate = d.findElement(By.xpath("//div[@class='Mb0fqfkJKrlrncFaK_py']")).getText();// June 2024,
																				// 2024
			if (retrndate.equals(currentdate)) {// June 2024 with June 2024
				System.out.println(retrndate);
				break;
			} else {
				d.findElement(By.xpath("//div[@data-pw='datePicker_nextMonthBtn']")).click();
			}

		}
		d.findElement(By.xpath("//div[@data-index='"+retrnday+"']")).click();

		Thread.sleep(3000);
		d.close();

	}

}
