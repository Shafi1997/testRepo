package selenium_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static WebDriver d;
	public static void main(String[] args) {
		
		d=new ChromeDriver();
		
		//open the url
		d.get("https://www.hyrtutorials.com/p/waits-demo.html");
		//maximize the window
		d.manage().window().maximize();
		//click the 
	}
}
