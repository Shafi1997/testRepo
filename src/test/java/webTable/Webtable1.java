package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {
	public static WebDriver driver;
	public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://seleniumpractise.blogspot.com/search?q=webtable");
	driver.manage().window().maximize();
	//find number of rows
	int rows=driver.findElements(By.xpath("//table[@id='customers']//descendant::tr")).size();
	System.out.println("Number of rows:"+rows);
	//find number of cells
	int cells=driver.findElements(By.xpath("//table[@id='customers']//descendant::td")).size();
	System.out.println("Number of Cells:"+cells);
	//retrieve particular value
	String contact=driver.findElement(By.xpath("//table[@id='customers']//tr[3]//td[3]")).getText();
	System.out.println(contact);
	//Number of columns
	int col=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	System.out.println(col);
	//Get entire table
	for(int r=2;r<=rows;r++) { 
	for(int c=1;c<=col;c++) {
	String value=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();//(2,1)(2,2)(2,3)(2,4)(2,5)(3,1)(3,2)
	System.out.print(value+" ");
//	System.out.print(rows+"th row "+col+"th col "+value+" ");
	}
	System.out.println();
	}
	//click on checkbox whose city is banglore
	//get each value in table and compare with banglore then click checkbox
	List<WebElement> tdata=driver.findElements(By.xpath("//table[@id='customers']//descendant::td"));
	for(WebElement values:tdata) {
	String data=values.getText();
	if(data.equals("Bangalore")) {
	driver.findElement(By.xpath("//td[text()='Bangalore']//preceding-sibling::td//input")).click();
	driver.findElement(By.xpath("//td[text()='Bangalore']//following-sibling::td//a")).click();
	}
	}
	
	
	//Get Contact names only
//	for(int c=2;c<=rows;c++) {
//	String value=driver.findElement(By.xpath("//table[@id='customers']//tr["+c+"]//td[3]")).getText();//(2,1)(2,2)(2,3)(2,4)(2,5)(3,1)(3,2)
//	System.out.print(value+" ");
	
//	}
	}


}
