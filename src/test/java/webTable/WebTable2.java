package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	public static WebDriver d;
	public static void main(String[] args) {
		d=new ChromeDriver();
		//load the web page
		d.get("https://seleniumpractise.blogspot.com/search?q=webtable");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//		System.out.println(d.getTitle());
		List<WebElement> tr_rows=d.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("No of rows: "+tr_rows.size());
		int row_num=1,col_num;
		for(WebElement rows:tr_rows)
		{
			List<WebElement> td_cols=rows.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
			System.out.println("No of columns in: "+row_num+" row: "+td_cols.size());
			col_num=1;
			for(WebElement columns:td_cols)
			{
				System.out.println("rows # "+row_num+", col # "+col_num+", Text="+columns.getText());
//				if(columns.getText().equals("Jeff Bezos"))
//				{
//					d.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]/preceding-sibling::td[2]")).click();
//					break;
//				}
				col_num++;
			}
			row_num++;
		}

	}

}
