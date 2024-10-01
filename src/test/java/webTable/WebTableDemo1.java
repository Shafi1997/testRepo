package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableDemo1 {

	public static WebDriver d;
	@Test
	public void webtable_Demo1() {
		
		
		List<WebElement> allheaders=d.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(allheaders.size());
		
		//verifying headers size, if it not same print message
		Assert.assertEquals(allheaders.size(), 5,"Column count is not same");
		boolean status=false;
		
		for(WebElement ele:allheaders)
		{
			String headervalue=ele.getText();
			System.out.println(headervalue);
			//verify country in header of the table
			if(headervalue.contains("Country"))
			{
				status=true;
				break; //if you want to print all the values then comment break
			}
			
		}
		//if the above loop fails then it will fail and will print the message
		Assert.assertTrue(status,"Header is not present");
		
		System.out.println("***************************************");
		
		List <WebElement> numOfRows=d.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total count of rows "+numOfRows.size());
		Assert.assertEquals(numOfRows.size(), 7,"Number of rows count are not equal");
		
		System.out.println("***************************************");
		
		List<WebElement> allData=d.findElements(By.xpath("//table[@id='customers']//td"));
		
        boolean datastatus=false;
		
		for(WebElement allele:allData)
		{
			String allelevalue=allele.getText();
			System.out.println(allelevalue);
			//verify country in header of the table
			if(allelevalue.contains("Ola"))
			{
				datastatus=true;
				break;
			}
			
		}
		//if the above loop fails then it will fail and will print the message
		Assert.assertTrue(datastatus,"Provided data is not present in table");
		
		System.out.println("***********************************");
		
		List<WebElement> companyNames=d.findElements(By.xpath("//table[@id='customers']//tr/td[2]"));
		
		boolean companystatus=false;
		
//		for(int i=0;i<companyNames.size();i++)
//		{
//			WebElement element1=companyNames.get(i);
//			String value1=element1.getText();
//			if(value1.contains("Java"))
//			{
//				companystatus=true;
//			}
//		}
		
		for(WebElement comnames:companyNames)
		{
			String company=comnames.getText();
			System.out.println(company);
			//verify country in header of the table
			if(company.contains("Java"))
			{
				companystatus=true;
				break;
			}
			
		}
		//if the above loop fails then it will fail and will print the message
		Assert.assertTrue(companystatus,"Could not find company");

		
		d.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();
		
		d.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[3]//a")).click();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		//launch the browser
		d=new ChromeDriver();
		d.get("https://seleniumpractise.blogspot.com/search?q=webtable");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(70));
	    System.out.println(d.getTitle());
	}
	@AfterMethod
	public void tearDown()
	{
		//close the browser
		d.quit();
	}

}
