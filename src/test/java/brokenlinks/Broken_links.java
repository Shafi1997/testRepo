package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

		public static WebDriver driver;
		public static void main(String[] args) throws IOException, InterruptedException {
			driver=new ChromeDriver();
			driver.get("http://www.deadlinkcity.com/");
			driver.manage().window().maximize();
			
			//find number of links on the webpage
			List<WebElement>links=driver.findElements(By.tagName("a"));
			for(int i=0;i<links.size();i++) {
				WebElement element=links.get(i);
				//get href attribute value
				String url=element.getAttribute("href");
				URL link=new URL(url);//form attribute into a url
				HttpURLConnection httpConn=(HttpURLConnection) link.openConnection();
				httpConn.connect();//url will hit the server
				Thread.sleep(2000);
				int rescode=httpConn.getResponseCode();
				if(rescode==200) {
					System.out.println("Valid url"+" "+url);
				}else {
					System.err.println("Broken link"+" "+url);
				}
				httpConn.disconnect();
			}
		
		}

	
}
