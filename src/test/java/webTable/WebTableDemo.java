package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static WebDriver d;
	public static void main(String[] args) {
				d=new ChromeDriver();
				//load the web page
				d.get("https://www.letskodeit.com/practice");
				d.manage().window().maximize();
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//				System.out.println(d.getTitle());
				List<WebElement> tr_collections=d.findElements(By.xpath("//table[@id='product']/tbody/tr"));
				System.out.println("Number of rows: "+tr_collections.size());
				int row_num=1, col_num;
				for(WebElement tr_element:tr_collections)
				{
					
					List<WebElement> td_collection=tr_element.findElements(By.xpath("td"));
					System.out.println("Number of columns in: "+row_num+" row: "+td_collection.size());
					col_num=1;
					for(WebElement td_element:td_collection)
					{
						System.out.println("row # "+row_num+", col # "+col_num + ", Text="+td_element.getText());
						if(td_element.getText().equals("35"))
						{
							System.out.println("Test Found");
							break;
						}
						col_num++;
					}
					row_num++;
				}
				

	}

}
