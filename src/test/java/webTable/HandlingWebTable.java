package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static WebDriver d;
	
	
	public static void main(String[] args) {
		
		d=new ChromeDriver();
		d.get("https://seleniumpractise.blogspot.com/search?q=webtable");
		d.manage().window().maximize();
		//find number of rows
//		int row=d.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		int rows=d.findElements(By.xpath("//table[@id='customers']//descendant::tr")).size();
		System.out.println(rows);
		//find number of cells
//		int row=d.findElements(By.xpath("//table[@id='customers']/tbody/tr/td")).size();
		int cells=d.findElements(By.xpath("//table[@id='customers']//descendant::td")).size();
		System.out.println(cells);
		//retrieve particular value
		String contact=d.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]")).getText();
		System.out.println(contact);
		//Number of columns
		int col=d.findElements(By.xpath("//table[@id='customers']//th")).size();
		//get entire table
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{
				String value=d.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+" ");
			}
			System.out.println();

		}
		

	}

}
